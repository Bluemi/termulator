package ui.view;

import javax.swing.JFrame;
import java.awt.Panel;

import ui.controller.DefaultController;
import ui.model.Model;

public class View
{
	private DefaultController controller;
	private Model model;

	private JFrame frame;
	private DrawCanvas canvas;

	public static final int X_SIZE = 500;
	public static final int Y_SIZE = 500;

	public View()
	{
		// frame erstellen
		frame = new JFrame("Termulator");
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(200,200);
		frame.setSize(X_SIZE, Y_SIZE);

		// Model erstellen
		Model model = new Model();

		// Controller erstellen
		controller = new DefaultController();

		// Panel erstellen
		Panel panel = new Panel();
		panel.setLocation(0,-5);
		panel.setSize(X_SIZE+1, Y_SIZE+5);

		// Canvas erstellen
		canvas = new DrawCanvas();
		// canvas.addListener(controller);
		canvas.setLocation(0, 0);
		canvas.setSize(X_SIZE+1, Y_SIZE+5);
		canvas.addKeyListener(controller);
		panel.add(canvas);

		frame.add(panel);

		frame.setVisible(true);
	}
}
