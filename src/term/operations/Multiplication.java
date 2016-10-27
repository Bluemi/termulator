package term.operations;

import term.Term;
import term.values.VoidValue;

public class Multiplication extends Operation
{
	public Multiplication()
	{
		super(new VoidValue(), new VoidValue());
	}

	public Multiplication(Term t1, Term t2)
	{
		super(t1, t2);
	}

	@Override
	public double getDoubleValue()
	{
		return terms[0].getDoubleValue() * terms[1].getDoubleValue();
	}

	@Override
	public String getString()
	{
		return "(" + terms[0].getString() + " * " + terms[1].getString() + ")";
	}
}
