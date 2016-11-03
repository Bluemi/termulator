package ui.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

import math.term.Term;
import math.term.values.VoidValue;

public class DrawPanel extends JPanel
{
	private Term completeTerm;
	private Term selectedTerm;

	public DrawPanel(Term ct, Term st)
	{
		setTerms(ct, st);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		clear(g);
		paintTerms(g);
	}

	private void paintTerms(Graphics g)
	{
		String renderString = completeTerm.getRenderString(selectedTerm);
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

	public void setTerms(Term ct, Term st)
	{
		if ((ct == null) || (st == null))
		{
			System.out.println("DrawPanel::setTerms(): null argument");
			completeTerm = new VoidValue();
			selectedTerm = completeTerm;
			return;
		}
		completeTerm = ct;
		selectedTerm = st;
	}

	public void update(Term ct, Term st)
	{
		setTerms(ct, st);
		Graphics g = getGraphics();
		clear(g);
		paintTerms(g);
	}
}
