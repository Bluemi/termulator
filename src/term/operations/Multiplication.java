package term.operations;

import term.Term;
import term.values.VoidValue;
import term.operations.PairOperation;

public class Multiplication extends PairOperation
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
	public String getCalcSign() { return "*"; }
}
