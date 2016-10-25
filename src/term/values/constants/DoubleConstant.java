package term.values.constants;

import term.values.Value;

public final class DoubleConstant extends Constant
{
	private double value;

	public DoubleConstant(double d)
	{
		value = d;
	}

	@Override
	public double getDoubleValue() { return value; }
}
