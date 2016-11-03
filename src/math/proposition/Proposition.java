package math.proposition;

import math.container.TermContainer;
import math.term.Term;
import math.interfaces.Textable;

public abstract class Proposition implements TermContainer, Textable
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

	@Override public void setTerms(Term... t_arg)
	{
		terms = t_arg;
		for (Term t : terms)
		{
			t.setParent(this);
			t.setUpperTerm(null); // Weil Proposition kein Term ist
		}
	}

	@Override public Term[] getTerms()
	{
		return terms;
	}

	@Override public String getString()
	{
		return "(" + getTerms()[0].getString() + " = " + getTerms()[1].getString() + ")";
	}

	@Override public String getRenderString(Textable selectedTerm)
	{
		if (this == selectedTerm)
		{
			return BEGIN_RENDERSTRING_TOKEN + getTerms()[0].getString() + " = " + getTerms()[1].getString() + END_RENDERSTRING_TOKEN;
		}
		return "(" + getTerms()[0].getString() + " = " + getTerms()[1].getString() + ")";
	}
}
