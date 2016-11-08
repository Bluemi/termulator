package math.container;

import math.term.Term;

public interface TermContainer extends ExpressionContainer
{
	public void setTerms(Term... t);
	public Term[] getTerms();
	public String getCalcSign();
}
