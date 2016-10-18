package terms.values.constants;

import terms.values.Value;

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
