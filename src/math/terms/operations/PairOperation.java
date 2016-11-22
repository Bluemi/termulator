package math.terms.operations;

import math.terms.Term;
import math.interfaces.Textable;

public abstract class PairOperation extends Operation
{
	public PairOperation(Term t1, Term t2)
	{
		super(t1, t2);
	}

	public abstract String getCalcSign();

	@Override public String getString()
	{
		return "(" + terms[0].getString() + getCalcSign() + terms[1].getString() + ")";
	}

	@Override public String getRenderString(Textable selectedTerm)
	{
		if (this == selectedTerm)
		{
			return BEGIN_RENDERSTRING_TOKEN + getString() + END_RENDERSTRING_TOKEN;
		}
		return "(" + getTerms()[0].getRenderString(selectedTerm) + getCalcSign() + getTerms()[1].getRenderString(selectedTerm) + ")";
	}
}
