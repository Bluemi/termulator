package math.term.values.constants;

import math.term.values.Value;

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
