package ui.model;

import ui.view.View;

import math.systems.System;
import math.propositions.EqualsProposition;
import math.terms.operations.*;
import math.terms.values.constants.*;

public class Model
{
	private View view;
	private System system;

	public Model(View v)
	{
		view = v;
		system = new System(new EqualsProposition(new Multiplication(new Addition(new DoubleConstant(2.0), new DoubleConstant(3.2)), new DoubleConstant(5.1)), new DoubleConstant(4.2)));
	}

	public void levelDownEvent()
	{
		system.levelDownEvent();
		view.update();
	}

	public void levelUpEvent()
	{
		system.levelUpEvent();
		view.update();
	}

	public void levelRighterEvent()
	{
		system.levelRighterEvent();
		view.update();
	}

	public void levelLefterEvent()
	{
		system.levelLefterEvent();
		view.update();
	}

	public String getString()
	{
		return system.getString();
	}
}
