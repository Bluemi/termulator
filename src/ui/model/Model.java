package ui.model;

import ui.view.View;

import math.expression.Expression;
import math.term.values.constants.DoubleConstant;
import math.term.operations.Multiplication;
import math.term.operations.Addition;
import math.proposition.EqualsProposition;

public class Model
{
	private View view;
	private Expression completeExpression;
	private Expression selectedExpression;

	public Model(View v)
	{
		view = v;
		completeExpression = new EqualsProposition(new Multiplication(new Addition(new DoubleConstant(2.0), new DoubleConstant(3.2)), new DoubleConstant(5.1)), new DoubleConstant(4.2));
		selectedExpression = completeExpression;
	}

	public Expression getCompleteExpression() { return completeExpression; }
	public Expression getSelectedExpression() { return selectedExpression; }

	public void levelDownEvent()
	{
		selectedExpression = selectedExpression.getDownerExpression();
		view.update();
	}

	public void levelUpEvent()
	{
		selectedExpression = selectedExpression.getUpperExpression();
		view.update();
	}

	public void levelRighterEvent()
	{
		selectedExpression = selectedExpression.getRighterExpression();
		view.update();
	}

	public void levelLefterEvent()
	{
		selectedExpression = selectedExpression.getLefterExpression();
		view.update();
	}
}
