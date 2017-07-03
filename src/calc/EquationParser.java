package calc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EquationParser {

	public EquationParser() {
	}

	public Number parse(String string) { // einmaliger Aufruf
		ArrayList<Token> tokenList = getTokenList(string);

		// Voraussetzung: In der TokenList stehen abwechselnd Zahlen und
		// Rechenzeichen (+/-), endet mit Zahl
		// --> ggf neue Methode cleanTokenList, die das sicherstellt (d.h. 2
		// aufeinanderfolgende Numbers zu einer zusammenfasst und aus +- ein -
		// macht)

		Value currentValue = null;
		Number result = null;

		while (tokenList.size() > 1) {
			int nextIndex = 0;

			if (getMultiplicationIndex(tokenList) >= 0) {
				nextIndex = getMultiplicationIndex(tokenList);
			} else if (getDivisionIndex(tokenList) >= 0) {
				nextIndex = getDivisionIndex(tokenList);
			}

			Token current = tokenList.get(nextIndex);

			tokenList.remove(nextIndex); // aktueller Token wird gespeichert und
											// dann aus der TokenList gelöscht.
											// Damit wird diese immer kleiner
											// und die Funktion terminiert bei
											// rekursivem Aufruf.

			switch (current.tokenType) {
			case Number: // Zahlen als aktuellen Wert speichern
				currentValue = new Number(current);
				break;
			case Plus: // nächste Zahl finden und Addition ausführen
						// Ergebnis an 1. Stelle schreiben
				currentValue = new Addition(currentValue, new Number(tokenList.get(nextIndex)));
				tokenList.set(nextIndex, new Token(currentValue.evaluate().toString(), TokenType.Number));
				break;
			case Minus: // nächste Zahl finden und Subtraktion ausführen
						// Ergebnis an 1. Stelle schreiben
				currentValue = new Subtraction(currentValue, new Number(tokenList.get(nextIndex)));
				tokenList.set(nextIndex, new Token(currentValue.evaluate().toString(), TokenType.Number));
				break;
			case Times: // "*" war auf index n und wurde schon gelöscht. Dann multipliziere n und n-1,
						// schreibe ergebnis auf index n-1 und lösche n
				currentValue = new Multiplication(new Number(tokenList.get(nextIndex - 1)),
						new Number(tokenList.get(nextIndex)));
				tokenList.set(nextIndex - 1, new Token(currentValue.evaluate().toString(), TokenType.Number));
				tokenList.remove(nextIndex);
				break;
			case Divided:// "*" war auf index n und wurde schon gelöscht. Dann dividiere n-1 durch n,
						 // schreibe ergebnis auf index n-1 und lösche n
				currentValue = new Division(new Number(tokenList.get(nextIndex-1)), new Number(tokenList.get(nextIndex)));
				tokenList.set(nextIndex-1, new Token(currentValue.evaluate().toString(), TokenType.Number));
				tokenList.remove(nextIndex);				
				break;
			default:
				break;

			}
		}

		if (tokenList.size() == 1) {
			result = new Number(tokenList.get(0));
		}
		return result;
	}

	private Integer getDivisionIndex(ArrayList<Token> tokenList) {
		int index = -1;
		for (int i = 0; i < tokenList.size(); i++) {
			if (tokenList.get(i).getTokenType() == TokenType.Divided) {
				index = i;
				break;
			}
		}
		return index;
	}

	private Integer getMultiplicationIndex(ArrayList<Token> tokenList) {
		int index = -1;
		for (int i = 0; i < tokenList.size(); i++) {
			if (tokenList.get(i).getTokenType() == TokenType.Times) {
				index = i;
				break;
			}
		}
		return index;
	}

	public enum TokenType {
		Number, Plus, Minus, Times, Divided;
	}

	public ArrayList<Token> getTokenList(String string) {
		List<String> chars = Arrays.asList(string.split(""));
		Iterator<String> charIterator = chars.iterator();

		ArrayList<Token> output = new ArrayList<>();

		String tokenString = "";

		while (charIterator.hasNext()) {
			String current = charIterator.next();
			while (isNumeric(current)) {
				tokenString += current;
				if (charIterator.hasNext()) {
					current = charIterator.next();
				} else {
					break;
				}
			}
			if (!tokenString.isEmpty()) {
				output.add(new Token(tokenString, TokenType.Number));
			}
			tokenString = "";

			if (current.equals("+")) {
				output.add(new Token(current, TokenType.Plus));
			}
			if (current.equals("-")) {
				output.add(new Token(current, TokenType.Minus));
			}
			if (current.equals("*")) {
				output.add(new Token(current, TokenType.Times));
			}
			if (current.equals("/")) {
				output.add(new Token(current, TokenType.Divided));
			}
		}
		return output;
	}

	public void printTokenList(ArrayList<Token> tokenList) {
		for (Token token : tokenList) {
			System.out.println(token.getValue().toString());
		}
	}

	private boolean isNumeric(String current) {
		try {
			Double.parseDouble(current);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public class Token {

		private String Value;
		private TokenType tokenType;

		public Token(String value, TokenType tokenType) {
			super();
			Value = value;
			this.tokenType = tokenType;
		}

		public String getValue() {
			return Value;
		}

		public void setValue(String value) {
			Value = value;
		}

		public TokenType getTokenType() {
			return tokenType;
		}

		public void setTokenType(TokenType tokenType) {
			this.tokenType = tokenType;
		}

	}

}
