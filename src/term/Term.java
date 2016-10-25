package term;

public abstract class Term
{
	protected Term[] terms;

	public Term(Term... t)
	{
		terms = t;
	}

	public abstract double getDoubleValue();

	// Gibt an, ob der Wert ausrechenbar ist
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
