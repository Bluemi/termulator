package term;

public abstract class Term
{
	public static final String BEGIN_RENDERSTRING_TOKEN = "<";
	public static final String END_RENDERSTRING_TOKEN = ">";
	public Term() {}
	public abstract double getDoubleValue();

	// Gibt an, ob der Wert ausrechenbar ist
	public abstract boolean hasValidDoubleValue();
	public abstract String getRenderString(Term selectedTerm);
	public abstract String getString();
	public abstract Term getLevelDownTerm();
}
