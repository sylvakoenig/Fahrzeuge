package calc;

public class Addition extends Operation {

	// Addition

	public Addition(Value field1, Value field2) {
		super(field1, field2);
	}

	@Override
	public Double evaluate() {
		return (this.field1.evaluate() + this.field2.evaluate());
	}

	public String toString() {
		return this.field1.toString() + " + " + this.field2.toString();
	}

}
