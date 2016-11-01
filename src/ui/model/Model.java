package ui.model;

import ui.view.View;

import term.Term;
import term.values.VoidValue;
import term.operations.Multiplication;

public class Model
{
	private View view;
	private Term completeTerm;
	private Term selectedTerm;

	public Model(View v)
	{
		view = v;
		completeTerm = new Multiplication(new VoidValue(), new VoidValue());
		selectedTerm = completeTerm;
	}

	public Term getCompleteTerm() { return completeTerm; }
	public Term getSelectedTerm() { return selectedTerm; }

	public void levelDownEvent()
	{
		selectedTerm = selectedTerm.getLevelDownTerm();
		view.update();
	}
}
