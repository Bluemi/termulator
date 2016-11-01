package ui.controller;

import java.awt.event.KeyEvent;

import ui.model.Model;

public class DefaultController extends Controller
{
	public DefaultController(Model model)
	{
		super(model);
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		switch (e.getKeyCode())
		{
			case KeyEvent.VK_J:
			{
				getModel().levelDownEvent();
				break;
			}
			default:
				//System.out.println("unknown key with keycode: " + e.getKeyCode());
				break;
		}
	}

}
