package math.containers;

import math.terms.Term;

public interface TermContainer extends ExpressionContainer
{
	public void setTerms(Term... t);
	public Term[] getTerms();
	public String getCalcSign();
}
