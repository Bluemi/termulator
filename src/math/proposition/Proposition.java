package math.proposition;

import math.expression.Expression;
import math.container.TermContainer;
import math.interfaces.Textable;
import math.term.Term;

public abstract class Proposition extends Expression implements TermContainer
{
	private Term[] terms;

	public Proposition(Term[] t)
	{
		if (t.length != 2)
		{
			System.out.println("Proposition.Proposition(): t.length != 2");
		}
		setTerms(t);
	}

	public abstract String getCalcSign();

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
		return "(" + getTerms()[0].getString() + " = " + getTerms()[1].getString() + ")";
	}

	@Override public String getRenderString(Textable selectedExpression)
	{
		if (this == selectedExpression)
		{
			return BEGIN_RENDERSTRING_TOKEN + getTerms()[0].getString() + " = " + getTerms()[1].getString() + END_RENDERSTRING_TOKEN;
		}
		return "(" + getTerms()[0].getString() + " = " + getTerms()[1].getString() + ")";
	}
}
