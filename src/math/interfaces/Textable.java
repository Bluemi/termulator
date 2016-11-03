package math.interfaces;

import math.term.Term;

public interface Textable
{
	public static final String BEGIN_RENDERSTRING_TOKEN = "<";
	public static final String END_RENDERSTRING_TOKEN = ">";

	public String getString();
	public String getRenderString(Textable selectedTerm);
}
