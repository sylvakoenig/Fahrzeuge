package marke;

public enum FahrradMarke implements Marke {
	Trek, NSU, Diamant, Rose;

	@Override
	public MarkeTyp getType() {
		return MarkeTyp.Fahrrad;
	}

	@Override
	public String getMarke() {
		return this.name();
	}
}
