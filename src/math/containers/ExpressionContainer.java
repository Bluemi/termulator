package math.containers;

import math.expressions.Expression;

public interface ExpressionContainer
{
	public Expression getExpression(int index);
	public Expression[] getExpressions();
}
