package ui.model;

import ui.view.View;

import math.term.Term;
import math.term.values.constants.DoubleConstant;
import math.term.operations.Multiplication;
import math.term.operations.Addition;

public class Model
{
	private View view;
	private Term completeTerm;
	private Term selectedTerm;

	public Model(View v)
	{
		view = v;
		completeTerm = new Multiplication(new Addition(new DoubleConstant(2.0), new DoubleConstant(3.2)), new DoubleConstant(5.1));
		selectedTerm = completeTerm;
	}

	public Term getCompleteTerm() { return completeTerm; }
	public Term getSelectedTerm() { return selectedTerm; }

	public void levelDownEvent()
	{
		selectedTerm = selectedTerm.getLevelDownTerm();
		view.update();
	}

	public void levelUpEvent()
	{
		selectedTerm = selectedTerm.getLevelUpperTerm();
		view.update();
	}

	public void levelRighterEvent()
	{
		selectedTerm = selectedTerm.getRighterTerm();
		view.update();
	}

	public void levelLefterEvent()
	{
		selectedTerm = selectedTerm.getLefterTerm();
		view.update();
	}
}
