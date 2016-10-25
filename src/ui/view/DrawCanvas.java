package ui.view;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;

public class DrawCanvas extends Canvas
{
	@Override
	public void paint(Graphics g)
	{
		// clear Canvas
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, getSize().width-1, getSize().height-1);
	}
}
