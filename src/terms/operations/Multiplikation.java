package terms.operations;

import terms.Term;

public class Multiplikation extends Operation
{
	public Multiplikation(Term t1, Term t2)
	{
		super(t1, t2);
	}

	@Override
	public double getDoubleValue()
	{
		return terms[0].getDoubleValue() * terms[1].getDoubleValue();
	}
}
