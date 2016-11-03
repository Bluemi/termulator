package math.container;

import math.term.Term;

public interface TermContainer
{
	public void setTerms(Term... t);
	public Term[] getTerms();
	public String getCalcSign();
}
