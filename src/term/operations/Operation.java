package term.operations;

import term.Term;

public abstract class Operation extends Term
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
}
