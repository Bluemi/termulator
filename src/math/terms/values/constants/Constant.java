package math.terms.values.constants;

import math.terms.values.Value;

public abstract class Constant extends Value
{
	@Override public boolean hasValidDoubleValue() { return true; }
}
