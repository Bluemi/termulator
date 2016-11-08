package math.terms.values.constants;

import math.terms.values.Value;

public final class DoubleConstant extends Constant
{
	private double value;

	public DoubleConstant(double d)
	{
		value = d;
	}

	@Override
	public double getDoubleValue() { return value; }

	@Override
	public String getString()
	{
		return "" + value;
	}
}
