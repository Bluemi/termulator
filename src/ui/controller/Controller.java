package ui.controller;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import ui.model.Model;

public abstract class Controller implements KeyListener
{
	private Model model;

	Controller(Model m)
	{
		model = m;
	}

	protected Model getModel()
	{
		return model;
	}

	@Override public final void keyTyped(KeyEvent e) {} // sollte nicht mehr überschrieben werden, da es nicht funktioniert
	@Override public final void keyReleased(KeyEvent e) {}
}
