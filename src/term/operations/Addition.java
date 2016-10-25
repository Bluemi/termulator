package term.operations;

import term.Term;

public class Addition extends Operation
{
	public Addition(Term t1, Term t2)
	{
		super(t1, t2);
	}

	@Override
	public double getDoubleValue()
	{
		return terms[0].getDoubleValue() + terms[1].getDoubleValue();
	}

}
