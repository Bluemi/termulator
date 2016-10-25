package ui.controller;

import java.awt.event.KeyEvent;

public class DefaultController implements Controller
{
	public DefaultController() {};

	@Override
	public void keyTyped(KeyEvent e)
	{
		System.out.println("Typed");
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		System.out.println("Pressed");
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		System.out.println("Released");
	}
}
