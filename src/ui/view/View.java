package ui.view;

import javax.swing.JFrame;

import ui.controller.DefaultController;
import ui.model.Model;

public class View
{
	private DefaultController controller;
	private Model model;

	private JFrame frame;

	public View()
	{
		// frame erstellen
		frame = new JFrame("Termulator");
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(200,200);
		frame.setSize(500, 500);
		frame.setVisible(true);

		// Model erstellen
		Model model = new Model();

		// Controller erstellen
		controller = new DefaultController();
	}
}
