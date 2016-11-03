package math.term.operations;

import java.lang.ArithmeticException;

import math.term.Term;
import math.term.values.VoidValue;
import math.term.operations.PairOperation;

public class Division extends PairOperation
{
	public Division()
	{
		super(new VoidValue(), new VoidValue());
	}

	public Division(Term t1, Term t2)
	{
		super(t1, t2);
	}

	@Override
	public double getDoubleValue()
	{
		double denominator = terms[1].getDoubleValue();
		if (denominator == 0.0)
		{
			throw new ArithmeticException("Division::getDoubleValue(): denominator = 0");
		}
		return terms[0].getDoubleValue() / denominator;
	}

	@Override
	public boolean hasValidDoubleValue()
	{
		return super.hasValidDoubleValue() && (terms[1].getDoubleValue() != 0.0);
	}

	@Override
	public String getCalcSign() { return "/"; }
}
