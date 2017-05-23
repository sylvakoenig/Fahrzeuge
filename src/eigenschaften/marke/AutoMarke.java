package eigenschaften.marke;

public enum AutoMarke implements Marke {
	BMW, Audi, Opel, Honda, Skoda;

	@Override
	public MarkeTyp getType() {
		return MarkeTyp.Auto;
	}

	@Override
	public String getMarke() {
		return this.name();
	}
}
