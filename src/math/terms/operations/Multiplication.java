package math.terms.operations;

import math.terms.Term;
import math.terms.values.VoidValue;
import math.terms.operations.PairOperation;

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
