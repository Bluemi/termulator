package ui.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

import math.expressions.Expression;
import math.terms.values.VoidValue;

public class DrawPanel extends JPanel
{
	private String text;

	public DrawPanel(String t)
	{
		setText(t);
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
		g.setColor(Color.WHITE);
		g.drawString(text, 100, 100);
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

	private void setText(String t)
	{
		text = t;
	}

	public void update(String t)
	{
		setText(t);
		Graphics g = getGraphics();
		clear(g);
		paintExpressions(g);
	}
}
