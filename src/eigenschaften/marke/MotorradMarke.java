package eigenschaften.marke;

public enum MotorradMarke implements Marke {
	Honda, Suzuki, BMW;

	@Override
	public MarkeTyp getType() {
		return MarkeTyp.Motorrad;
	}

	@Override
	public String getMarke() {
		return this.name();
	}
}
