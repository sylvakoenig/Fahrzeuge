package fahrzeuge;

public class Fahrzeug {

	protected Integer raeder; // sichtbar für diese Klasse und alle die von
								// dieser Klasse erben
	protected String farbe;
	protected String marke;

	public Fahrzeug(Integer raeder, String farbe, String marke) {
		super();
		this.raeder = raeder;
		this.farbe = farbe;
		this.marke = marke;
	}

	public Integer getRaeder() {
		return raeder;
	}

	public void setRaeder(Integer raeder) {
		this.raeder = raeder;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

}
