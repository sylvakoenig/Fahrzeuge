package calc;

public class TaskMain {

	public static void main(final String[] args) {

		// Number a = new Number(5);
		// Number b = new Number(234);
		// Number c = new Number(1501);
		//
		// Addition addition = new Addition(a, b);
		// System.out.print(addition.toString());
		// System.out.println(" = " + Double.toString(addition.evaluate()));
		//
		// Subtraction differenz = new Subtraction(c,b);
		// System.out.print(differenz.toString());
		// System.out.println(" = " + Double.toString(differenz.evaluate()));
		//
		// Addition box = new Addition(a, differenz);
		// System.out.print(box.toString());
		// System.out.println(" = " + Double.toString(box.evaluate()));
		//
		//

		// Number a = new Number(5);
		// Number b = new Number(3);
		// Number d = new Number(8);
		//
		// Addition addition = new Addition(a, b);
		// System.out.println(addition.evaluate());
		// System.out.println(d.evaluate());
		// System.out.println((addition.evaluate() == d.evaluate()));
		//
		// System.out.println("******************");

		final String string = "15 +  3 * 2 - 1 + 10/2";

		final EquationParser eqParser = new EquationParser();

		final Number res = eqParser.parse(string);

		// ArrayList<Token> tokenList = eqParser.getTokenList(string);

		System.out.println(res);
	}
}
