package math.term.operations;

import math.term.Term;
import math.expression.Expression;
import math.container.TermContainer;
import math.interfaces.Textable;

public abstract class Operation extends Term implements TermContainer
{
	protected Term[] terms;

	protected Operation(Term... t)
	{
		super();
		setTerms(t);
	}

	@Override
	public boolean hasValidDoubleValue()
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
