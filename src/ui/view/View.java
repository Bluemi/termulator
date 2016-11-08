package ui.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ui.controller.DefaultController;
import ui.model.Model;

public class View
{
	private DefaultController controller;
	private Model model;

	private JFrame frame;
	private DrawPanel panel;

	public static final int X_SIZE = 500;
	public static final int Y_SIZE = 500;

	public View()
	{
		// frame erstellen
		frame = new JFrame("Termulator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(200,200);

		// Model erstellen
		model = new Model(this);

		// Controller erstellen
		controller = new DefaultController(model);

		// Panel erstellen
		panel = new DrawPanel(model.getString());
		frame.addKeyListener(controller);
		frame.add(panel);
		frame.pack();

		frame.setVisible(true);
	}

	public void update()
	{
		panel.update(model.getString());
	}
}
