package terms.operations;

import terms.Term;

public class Subtraktion extends Operation
{
	public Subtraktion(Term t1, Term t2)
	{
		super(t1, t2);
	}

	@Override
	public double getDoubleValue()
	{
		return terms[0].getDoubleValue() - terms[1].getDoubleValue();
	}
}
