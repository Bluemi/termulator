package term;

public abstract class Term
{
	public Term() {}
	public abstract double getDoubleValue();

	// Gibt an, ob der Wert ausrechenbar ist
	public abstract boolean hasValidDoubleValue();

	public abstract String getString();
}
