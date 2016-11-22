package math.systems;

import math.containers.TermContainer;
import math.expressions.Expression;
import math.terms.Term;
import math.terms.operations.Operation;
import math.terms.values.VoidValue;

public class System implements TermContainer
{
	private Expression root;
	private Expression selectedExpression;

	public System(Expression e)
	{
		resetWithExpression(e);
	}

	private void resetWithExpression(Expression e)
	{
		root = e;
		root.setParent(this);
		selectedExpression = root;
	}

	private void resetWithTerm(Term t)
	{
		t.setTermParent(this);
		root = t;
		selectedExpression = root;
	}

	@Override public Term getTerm(int index)
	{
		return null;
	}

	@Override public Term[] getTerms()
	{
		return null;
	}

	@Override public void setTerm(Term t, int index)
	{
		if (index != 0)
		{
			java.lang.System.out.println("System.setTerm(): invalid index = " + index);
			return;
		}
		resetWithExpression(t);
	}

	@Override public void setTerms(Term... t)
	{
		if (t == null)
		{
			java.lang.System.out.println("System.setTerms(): t == null");
		}
		if (t.length != 1)
		{
			java.lang.System.out.println("System.setTerms(): invalid argument: t.length = " + t.length);
		}
		resetWithExpression(t[0]);
	}

	@Override public Expression[] getExpressions()
	{
		return new Expression[] {root};
	}

	@Override public Expression getExpression(int index)
	{
		if (index != 0)
		{
			java.lang.System.out.println("System.getExpression(): invalid index = " + index);
			return null;
		}
		return root;
	}

	// Navigation
	public void levelDownEvent() { selectedExpression = selectedExpression.getDownerExpression(); }
	public void levelUpEvent() { selectedExpression = selectedExpression.getUpperExpression(); }
	public void levelRighterEvent() { selectedExpression = selectedExpression.getRighterExpression(); }
	public void levelLefterEvent() { selectedExpression = selectedExpression.getLefterExpression(); }

	public boolean insertOperation(Operation op)
	{
		return selectedExpression.insertOperation(op);
	}

	public String getString()
	{
		return root.getRenderString(selectedExpression);
	}

	public boolean remove()
	{
		Expression newSelectedExpression = selectedExpression.getUpperExpression();
		if (newSelectedExpression == selectedExpression)
		{
			VoidValue v = new VoidValue();
			resetWithTerm(v);
			if (v.getTermParent() == null)
			{
				java.lang.System.out.println("JPJUPJUPJUP");
			}
			return true;
		}
		boolean ok = selectedExpression.removeThis();
		selectedExpression = newSelectedExpression;
		return ok;
	}
}
