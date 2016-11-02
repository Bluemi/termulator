package term.operations;

import term.Term;
import term.TermContainer;

public abstract class Operation extends Term implements TermContainer
{
	protected Term[] terms;

	protected Operation(Term... t)
	{
		super();
		setTerms(t);
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
	@Override public void setTerms(Term... t)
	{
		terms = t;
		for (Term term : getTerms())
		{
			term.setUpperTerm(this);
			term.setParent(this);
		}
	}

	@Override
	public String getRenderString(Term selectedTerm)
	{
		if (this == selectedTerm)
		{
			return BEGIN_RENDERSTRING_TOKEN + getString() + END_RENDERSTRING_TOKEN;
		}
		return getTerms()[0].getRenderString(selectedTerm) + "" + getTerms()[1].getRenderString(selectedTerm);
	}

	@Override
	public Term getLevelDownTerm()
	{
		return terms[0];
	}
}
