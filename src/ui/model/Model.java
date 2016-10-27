package ui.model;

import term.Term;
import term.values.VoidValue;

public class Model
{
	private Term term;

	public Model()
	{
		term = new VoidValue();
	}

	public String getText()
	{
		return term.getString();
	}
}
