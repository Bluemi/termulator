package math.terms;

import math.containers.TermContainer;
import math.interfaces.Textable;
import math.expressions.Expression;

public abstract class Term extends Expression
{
	private TermContainer termParent;

	public Term() {}

	public void setParent(TermContainer p)
	{
		super.setParent(p);
		termParent = p;
	}

	public TermContainer getTermParent() { return termParent; }

	public abstract boolean hasValidDoubleValue();
	public abstract double getDoubleValue();
}
