package math.term.values;

/*
	Überklasse für alle Klassen, die nicht von TermContainer aber von Term erben
*/

import math.term.Term;
import math.interfaces.Textable;

public abstract class Value extends Term
{
	public Value() {}

	@Override
	public String getRenderString(Textable selectedTerm)
	{
		if (this == selectedTerm)
		{
			return BEGIN_RENDERSTRING_TOKEN + getString() + END_RENDERSTRING_TOKEN;
		}
		return getString();
	}

	@Override
	public Term getLevelDownTerm()
	{
		return this;
	}
}
