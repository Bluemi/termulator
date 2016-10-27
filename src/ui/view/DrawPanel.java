package ui.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

public class DrawPanel extends JPanel
{
	public DrawPanel()
	{
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		clear(g);
		drawString("NENEN", 10, 10, g);
	}

	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(View.X_SIZE, View.Y_SIZE);
	}

	private void clear(Graphics g)
	{
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, getSize().width-1, getSize().height-1);
	}

	public void drawString(String text, int x, int y, Graphics g)
	{
		g.setColor(Color.WHITE);
		g.drawString(text, x, y);
	}
}
