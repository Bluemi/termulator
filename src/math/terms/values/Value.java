package math.terms.values;

/*
	Überklasse für alle Klassen, die nicht von TermContainer aber von Term erben
*/

import math.terms.Term;
import math.containers.TermContainer;
import math.terms.operations.Operation;
import math.expressions.Expression;
import math.interfaces.Textable;

public abstract class Value extends Term
{
	public Value() {}

	@Override public boolean insertOperation(Operation op)
	{
		TermContainer p = getTermParent();
		Term[] parentTerms = p.getTerms();
		int index = -1;
		for (int i = 0; i < parentTerms.length; i++)
		{
			if (parentTerms[i] == this)
			{
				index = i;
			}
		}
		if (index == -1)
		{
			System.out.println("Operation.insertOperation(): index == -1");
			return false;
		}

		p.setTerm(op, index);
		op.setTerm(this, 0); // Sich selbst an die erste stelle der neuen Operation stellen
		return true;
	}

	@Override public String getRenderString(Textable selectedExpression)
	{
		if (this == selectedExpression)
		{
			return BEGIN_RENDERSTRING_TOKEN + getString() + END_RENDERSTRING_TOKEN;
		}
		return getString();
	}

	@Override public Expression getDownerExpression()
	{
		return this;
	}
}
