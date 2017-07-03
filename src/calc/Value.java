package calc;

public abstract class Value {
	// wird extended von den Klassen Number und Operation, 
	// d.h. Value kann direkt eine Zahl sein oder erst aus einer Operation bestimmt werden

	public abstract Double evaluate();

}
