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

	public static final int X_SIZE = 500;
	public static final int Y_SIZE = 500;

	public View()
	{
		// frame erstellen
		frame = new JFrame("Termulator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(200,200);

		// Model erstellen
		Model model = new Model();

		// Controller erstellen
		controller = new DefaultController();

		// Panel erstellen
		DrawPanel p = new DrawPanel(model.getText());
		p.addKeyListener(controller);
		frame.add(p);
		frame.pack();

		frame.setVisible(true);
	}
}
