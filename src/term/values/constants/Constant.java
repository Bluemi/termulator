package term.values.constants;

import term.values.Value;

public abstract class Constant extends Value
{
	@Override
	public boolean hasValidDoubleValue() { return true; }
}
