package calc;

public abstract class Operation extends Value {
	
	// Operation erweitert Value, ist also als ein Wert zu verstehen
	// Operation wird extended durch konkrete Rechenoperationen wie Addition und Subtraktion
	// Es werden nur binäre Operationen betrachtet, daher besteht eine Operation wiederum aus 2 Values

	protected Value field1;
	protected Value field2;

	public Operation(Value field1, Value field2) {
		super();
		this.field1 = field1;
		this.field2 = field2;
	}

}
