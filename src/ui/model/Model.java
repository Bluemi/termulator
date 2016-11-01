package ui.model;

import term.Term;
import term.values.VoidValue;

public class Model
{
	private Term term;
	private Term selectedTerm;

	public Model()
	{
		term = new VoidValue();
		selectedTerm = term;
	}

	public String getText()
	{
		return term.getString();
	}
}
