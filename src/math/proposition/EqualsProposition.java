package math.proposition;

import math.term.Term;

public class EqualsProposition extends Proposition
{
	public EqualsProposition(Term t1, Term t2)
	{
		super(new Term[]{t1, t2});
	}

	@Override public String getCalcSign() { return "="; }
}
