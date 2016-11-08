package math.terms.values;

public class VoidValue extends Value
{
	public VoidValue()
	{
	}

	@Override
	public String getString()
	{
		return "[]";
	}

	@Override
	public double getDoubleValue()
	{
		return 0.0;
	}

	@Override
	public boolean hasValidDoubleValue()
	{
		return false;
	}
}
