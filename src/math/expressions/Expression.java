package math.expressions;

import math.containers.ExpressionContainer;
import math.interfaces.Textable;
import math.terms.operations.Operation;

public abstract class Expression implements Textable
{
	private Expression upperExpression;
	private ExpressionContainer parent;

	public Expression()
	{
		upperExpression = null;
		parent = null;
	}

	public ExpressionContainer getParent()
	{
		return parent;
	}

	// parent
	public void setParent(ExpressionContainer p)
	{
		parent = p;
	}

	public abstract boolean insertOperation(Operation o);

	// upper/lower Expression
	public abstract Expression getDownerExpression();
	public Expression getUpperExpression()
	{
		if (upperExpression == null)
		{
			return this;
		}
		return upperExpression;
	}

	public void setUpperExpression(Expression upper)
	{
		upperExpression = upper;
	}

	// righter / lefter Expression
	public Expression getRighterExpression()
	{
		if (getParent() == null)
		{
			return this;
		}
		Expression[] neighbors = getParent().getExpressions();
		for (int i = 0; i < neighbors.length; i++)
		{
			if (neighbors[i] == this)
			{
				if ((i+1) < neighbors.length)
				{
					return neighbors[i+1];
				}
			}
		}
		return this;
	}

	public Expression getLefterExpression()
	{
		if (getParent() == null)
		{
			return this;
		}
		Expression[] neighbors = getParent().getExpressions();
		for (int i = 0; i < neighbors.length; i++)
		{
			if (neighbors[i] == this)
			{
				if ((i-1) >= 0)
				{
					return neighbors[i-1];
				}
			}
		}
		return this;
	}
}
