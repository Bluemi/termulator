package math.term.operations;

import math.term.Term;
import math.term.values.VoidValue;
import math.term.operations.PairOperation;

public class Addition extends PairOperation
{
	public Addition()
	{
		super(new VoidValue(), new VoidValue());
	}

	public Addition(Term t1, Term t2)
	{
		super(t1, t2);
	}

	@Override
	public double getDoubleValue()
	{
		return terms[0].getDoubleValue() + terms[1].getDoubleValue();
	}

	@Override
	public String getCalcSign() { return "+"; }
}
