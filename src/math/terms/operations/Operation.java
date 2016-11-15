package math.terms.operations;

import math.terms.Term;
import math.expressions.Expression;
import math.containers.TermContainer;
import math.interfaces.Textable;

public abstract class Operation extends Term implements TermContainer
{
	protected Term[] terms;

	protected Operation(Term... t)
	{
		super();
		setTerms(t);
	}

	@Override public boolean insertOperation(Operation op)
	{
		TermContainer p = getTermParent();
		Term[] parentTerms = p.getTerms();
		int index = -1;
		for (int i = 0; i < parentTerms.length; i++)
		{
			if (parentTerms[i] == this)
			{
				index = i;
			}
		}
		if (index == -1)
		{
			System.out.println("Operation.insertOperation(): index == -1");
			return false;
		}

		p.setTerm(op, index);
		op.setTerm(this, 0); // Sich selbst an die erste stelle der neuen Operation stellen
		return true;
	}

	@Override public boolean hasValidDoubleValue()
	{
		for (int i = 0; i < terms.length; i++)
		{
			if (!terms[i].hasValidDoubleValue())
			{
				return false;
			}
		}
		return true;
	}

	// TermContainer
	@Override public Term[] getTerms() { return terms; }
	@Override public void setTerms(Term... t)
	{
		terms = t;
		for (Term term : getTerms())
		{
			term.setUpperExpression(this);
			term.setParent(this);
		}
	}

	public void setTerm(Term t, int index)
	{
		if (index < 0 || index >= terms.length)
		{
			System.out.println("Operation.setTerm(): index = " + index + " is invalid");
			return;
		}
		t.setParent(this);
		t.setUpperExpression(this);
		terms[index] = t;
	}

	// ExpressionContainer
	@Override public Expression[] getExpressions() { return terms; }

	// Textable
	@Override public String getRenderString(Textable selectedTerm)
	{
		if (this == selectedTerm)
		{
			return BEGIN_RENDERSTRING_TOKEN + getString() + END_RENDERSTRING_TOKEN;
		}
		return getTerms()[0].getRenderString(selectedTerm) + "" + getTerms()[1].getRenderString(selectedTerm);
	}

	@Override
	public Term getDownerExpression()
	{
		return terms[0];
	}
}
