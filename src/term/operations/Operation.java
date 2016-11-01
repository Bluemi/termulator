package term.operations;

import term.Term;
import term.TermContainer;

public abstract class Operation extends Term implements TermContainer
{
	protected Term[] terms;

	protected Operation(Term... t)
	{
		super();
		terms = t;
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

	@Override public Term[] getTerms() { return terms; }
	@Override public void setTerms(Term... t) { terms = t; }
}
