package math.terms.values;

/*
	Überklasse für alle Klassen, die nicht von TermContainer aber von Term erben
*/

import math.terms.Term;
import math.expressions.Expression;
import math.interfaces.Textable;

public abstract class Value extends Term
{
	public Value() {}

	@Override
	public String getRenderString(Textable selectedExpression)
	{
		if (this == selectedExpression)
		{
			return BEGIN_RENDERSTRING_TOKEN + getString() + END_RENDERSTRING_TOKEN;
		}
		return getString();
	}

	@Override
	public Expression getDownerExpression()
	{
		return this;
	}
}
