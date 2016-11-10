package math.systems;

import math.containers.ExpressionContainer;
import math.expressions.Expression;

public class System implements ExpressionContainer
{
	private Expression root;
	private Expression selectedExpression;

	public System(Expression e)
	{
		root = e;
		root.setParent(this);
		selectedExpression = root;
	}

	@Override public Expression[] getExpressions()
	{
		return new Expression[] {root};
	}

	// Navigation
	public void levelDownEvent() { selectedExpression = selectedExpression.getDownerExpression(); }
	public void levelUpEvent() { selectedExpression = selectedExpression.getUpperExpression(); }
	public void levelRighterEvent() { selectedExpression = selectedExpression.getRighterExpression(); }
	public void levelLefterEvent() { selectedExpression = selectedExpression.getLefterExpression(); }

	public String getString()
	{
		return root.getRenderString(selectedExpression);
	}
}
