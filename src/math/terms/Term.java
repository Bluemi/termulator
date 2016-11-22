package math.terms;

import math.containers.TermContainer;
import math.interfaces.Textable;
import math.expressions.Expression;
import math.terms.values.VoidValue;

public abstract class Term extends Expression
{
	private TermContainer termParent;

	public Term() {}

	public void setTermParent(TermContainer p)
	{
		super.setParent(p);
		termParent = p;
	}

	public TermContainer getTermParent() { return termParent; }

	public boolean removeThis()
	{
		TermContainer p = getTermParent();
		if (p == null)
		{
			System.out.println("Term.removeThis(): getTermParent == null");
			return false;
		}
		int index = -1;
		for (int i = 0; i < p.getTerms().length; i++)
		{
			if (p.getTerm(i) == this)
			{
				index = i;
			}
		}

		if (index == -1)
		{
			System.out.println("Term.removeThis(): index == -1");
			return false;
		}

		p.setTerm(new VoidValue(), index);
		return true;
	}

	public abstract boolean hasValidDoubleValue();
	public abstract double getDoubleValue();
}
