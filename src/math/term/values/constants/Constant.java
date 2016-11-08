package math.term.values.constants;

import math.term.values.Value;

public abstract class Constant extends Value
{
	@Override public boolean hasValidDoubleValue() { return true; }
}
