package calc;
import calc.EquationParser.Token;

public class Number extends Value {

	private double number;

	public Number(double number) {
		this.number = number;
	}

	public Number(Token current) {
		this.number = Double.parseDouble(current.getValue());
	}

	@Override
	public Double evaluate() {
		return number;
	}

	public String toString(){
		return Double.toString(number);
	}
}
