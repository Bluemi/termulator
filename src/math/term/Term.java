package math.term;

import math.container.TermContainer;
import math.interfaces.Textable;
import math.expression.Expression;

public abstract class Term extends Expression
{
	public Term() {}

	public abstract boolean hasValidDoubleValue();
	public abstract double getDoubleValue();
}
