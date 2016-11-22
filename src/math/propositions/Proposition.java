package math.propositions;

import math.expressions.Expression;
import math.containers.TermContainer;
import math.containers.PropositionContainer;
import math.interfaces.Textable;
import math.terms.Term;
import math.terms.operations.Operation;
import math.terms.values.VoidValue;

public abstract class Proposition extends Expression implements TermContainer
{
	private Term[] terms;
	private PropositionContainer parentProposition;

	public Proposition(Term[] t)
	{
		if (t.length != 2)
		{
			System.out.println("Proposition.Proposition(): t.length != 2");
		}
		setTerms(t);
	}

	@Override public Term getTerm(int index)
	{
		if ((index < 0) || (index >= terms.length))
		{
			System.out.println("Proposition.getTerm(): invalid index=" + index);
			return null;
		}
		return terms[index];
	}

	@Override public Expression getExpression(int index)
	{
		return getTerm(index);
	}

	public PropositionContainer getParentProposition()
	{
		return parentProposition;
	}

	public abstract String getCalcSign();

	@Override public boolean removeThis()
	{
		if (getParent() == null)
		{
			System.out.println("Proposition.removeThis(): parent == null");
			return false;
		}
		PropositionContainer p = getParentProposition();
		int index = -1;
		if (p == null)
		{
			return false;
		}
		for (int i = 0; i < p.getPropositions().length; i++)
		{
			if (p.getProposition(i) == this)
			{
				index = i;
			}
		}

		if (index == -1)
		{
			System.out.println("Proposition.removeThis(): index == -1");
			return false;
		}

		p.setProposition(null, index); // Wenn eine Proposition entfernt wird, wird auch deren Inhalt entfernt
		return true;
	}

	@Override public boolean insertOperation(Operation op) // A Proposition can't be replaced by an Operation
	{
		return false;
	}

	// TermContainer
	@Override public void setTerms(Term... t_arg)
	{
		terms = t_arg;
		for (Term t : terms)
		{
			t.setParent(this);
			t.setUpperExpression(this); // Weil Proposition kein Term ist
		}
	}

	@Override public void setTerm(Term t, int index)
	{
		if (index < 0 || index >= terms.length)
		{
			System.out.println("Proposition.setTerm(): invalid index = " + index);
			return;
		}
		t.setParent(this);
		t.setUpperExpression(this);
		terms[index] = t;
	}

	@Override public Expression[] getExpressions()
	{
		return terms;
	}

	@Override public Expression getDownerExpression()
	{
		return getTerms()[0];
	}

	@Override public Term[] getTerms()
	{
		return terms;
	}

	@Override public String getString()
	{
		return "(" + getTerms()[0].getString() + " " + getCalcSign() + " " + getTerms()[1].getString() + ")";
	}

	@Override public String getRenderString(Textable selectedExpression)
	{
		if (this == selectedExpression)
		{
			return BEGIN_RENDERSTRING_TOKEN + "(" + getTerms()[0].getString() + " = " + getTerms()[1].getString() + ")" + END_RENDERSTRING_TOKEN;
		}
		return "(" + getTerms()[0].getRenderString(selectedExpression) + " = " + getTerms()[1].getRenderString(selectedExpression) + ")";
	}
}
