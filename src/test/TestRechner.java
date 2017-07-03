package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import calc.Addition;
import calc.Division;
import calc.EquationParser;
import calc.Multiplication;
import calc.EquationParser.Token;
import calc.EquationParser.TokenType;
import calc.Number;
import calc.Subtraction;

public class TestRechner {

	Number a = new Number(5);
	Number b = new Number(3);
	Number c = new Number(2);
	Number d = new Number(8);
	Number e = new Number(16)
			;
	double eps = 0.01;

	@Test
	public void testEvaluate() {
		assertEquals(5, a.evaluate(), eps);
		// 3. eingabe ist ein epsilon (für Ungenauigkeiten wegen
		// Gleitzahlarithmetik)
	}

	@Test
	public void testSimpleAddition() {
		Addition addition = new Addition(a, b);
		assertEquals(addition.evaluate(), d.evaluate(), eps);
	}

	@Test
	public void testSimpleSubtraction() {
		Subtraction subtraction = new Subtraction(a, b);
		assertEquals(subtraction.evaluate(), c.evaluate(), eps);
	}
	
	@Test
	public void testSimpleMultiplication() {
		Multiplication multiplication = new Multiplication(c,d);
		assertEquals(multiplication.evaluate(), e.evaluate(), eps);
	}	

	@Test
	public void testSimpleDivision() {
		Division division = new Division(e,d);
		assertEquals(division.evaluate(), c.evaluate(), eps);
	}		
	
	@Test
	public void testGetTokenList() {
		String string = "5 + 22 - 73";

		EquationParser eqParser = new EquationParser();

		ArrayList<Token> result = eqParser.getTokenList(string);

		assertEquals(result.get(0).getValue(), "5");
		assertEquals(result.get(1).getTokenType().compareTo(TokenType.Plus), 0);
		assertEquals(result.get(2).getValue(), "22");
		assertEquals(result.get(3).getTokenType().compareTo(TokenType.Minus), 0);
		assertEquals(result.get(4).getValue(), "73");

	}

	@Test
	public void testGetTokenListOnlyOneToken() {
		String string = "7";

		EquationParser eqParser = new EquationParser();

		ArrayList<Token> result = eqParser.getTokenList(string);

		assertEquals(result.get(0).getValue(), "7");
	}

	@Test
	public void testParse() {
		String string = "345 - 237 + 42";

		EquationParser eqParser = new EquationParser();

		Number res = eqParser.parse(string);

		assertEquals(res.evaluate(), 150, eps);

	}

	@Test
	public void testParseMultiplication(){
		String string = "5 + 2*3";
		EquationParser eqParser = new EquationParser();
		Number res = eqParser.parse(string);
		assertEquals(res.evaluate(), 11, eps);		
	}

	@Test
	public void testParseDivision(){
		String string = "5 + 15/5";
		EquationParser eqParser = new EquationParser();
		Number res = eqParser.parse(string);
		assertEquals(res.evaluate(), 8, eps);		
	}

	@Test
	public void testParseLongExpression(){
		String string = "5 + 2*3 -2-2 + 2*3*3";
		EquationParser eqParser = new EquationParser();
		Number res = eqParser.parse(string);
		assertEquals(res.evaluate(), 25, eps);		
	}
}
