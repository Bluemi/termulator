package term.operations;

import term.Term;
import term.values.VoidValue;

public class Subtraction extends Operation
{
	public Subtraction()
	{
		super(new VoidValue(), new VoidValue());
	}

	public Subtraction(Term t1, Term t2)
	{
		super(t1, t2);
	}

	@Override
	public double getDoubleValue()
	{
		return terms[0].getDoubleValue() - terms[1].getDoubleValue();
	}

	@Override
	public String getString()
	{
		return "(" + terms[0].getString() + " – " + terms[1].getString() + ")";
	}
}
