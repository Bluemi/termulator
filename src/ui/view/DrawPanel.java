package ui.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

import math.expression.Expression;
import math.term.values.VoidValue;

public class DrawPanel extends JPanel
{
	private Expression completeExpression;
	private Expression selectedExpression;

	public DrawPanel(Expression ct, Expression st)
	{
		setExpressions(ct, st);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		clear(g);
		paintExpressions(g);
	}

	private void paintExpressions(Graphics g)
	{
		String renderString = completeExpression.getRenderString(selectedExpression);
		g.setColor(Color.WHITE);
		g.drawString(renderString, 100, 100);
	}

	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(View.X_SIZE, View.Y_SIZE);
	}

	private void clear(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getSize().width-1, getSize().height-1);
	}

	public void setExpressions(Expression ct, Expression st)
	{
		if ((ct == null) || (st == null))
		{
			System.out.println("DrawPanel::setExpressions(): null argument");
			completeExpression = new VoidValue();
			selectedExpression = completeExpression;
			return;
		}
		completeExpression = ct;
		selectedExpression = st;
	}

	public void update(Expression ct, Expression st)
	{
		setExpressions(ct, st);
		Graphics g = getGraphics();
		clear(g);
		paintExpressions(g);
	}
}
