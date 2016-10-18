package terms.operations;

import java.lang.ArithmeticException;

import terms.Term;

public class Division extends Operation
{
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
}
