package term;

public abstract class Term
{
	private Term upperTerm;
	private TermContainer parent;

	public static final String BEGIN_RENDERSTRING_TOKEN = "<";
	public static final String END_RENDERSTRING_TOKEN = ">";

	public Term()
	{
		upperTerm = null;
	}

	public abstract double getDoubleValue();
	public abstract boolean hasValidDoubleValue(); // Gibt an, ob der Wert ausrechenbar ist

	public abstract String getRenderString(Term selectedTerm);
	public abstract String getString();

	// upper/lower Term
	public abstract Term getLevelDownTerm();
	public Term getLevelUpperTerm()
	{
		if (upperTerm == null)
		{
			return this;
		}
		return upperTerm;
	}
	public void setUpperTerm(Term upper) { upperTerm = upper; }

	// righter / lefter Term
	public Term getRighterTerm()
	{
		if (getParent() == null)
		{
			return this;
		}
		Term[] neighbors = getParent().getTerms();
		for (int i = 0; i < neighbors.length; i++)
		{
			if (neighbors[i] == this)
			{
				if ((i+1) < neighbors.length)
				{
					return neighbors[i+1];
				}
			}
		}
		return this;
	}

	public Term getLefterTerm()
	{
		if (getParent() == null)
		{
			return this;
		}
		Term[] neighbors = getParent().getTerms();
		for (int i = 0; i < neighbors.length; i++)
		{
			if (neighbors[i] == this)
			{
				if ((i-1) >= 0)
				{
					return neighbors[i-1];
				}
			}
		}
		return this;
	}

	// parent
	public void setParent(TermContainer p)
	{
		parent = p;
	}

	public TermContainer getParent()
	{
		return parent;
	}
}
