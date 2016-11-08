package math.terms;

import math.containers.TermContainer;
import math.interfaces.Textable;
import math.expressions.Expression;

public abstract class Term extends Expression
{
	public Term() {}

	public abstract boolean hasValidDoubleValue();
	public abstract double getDoubleValue();
}
