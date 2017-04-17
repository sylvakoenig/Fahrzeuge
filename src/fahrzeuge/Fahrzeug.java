package fahrzeuge;

public class Fahrzeug {

	protected Integer raeder; // sichtbar für diese Klasse und alle die von
								// dieser Klasse erben
	protected FahrzeugFarben farbe;
	protected FahrzeugMarke marke;

	public Fahrzeug(Integer raeder, FahrzeugFarben farbe2, FahrzeugMarke marke2) {
		super();
		this.raeder = raeder;
		this.farbe = farbe2;
		this.marke = marke2;
	}

	public Fahrzeug(Integer raeder, FahrzeugFarben farbe2) {
		super();
		this.raeder = raeder;
		this.farbe = farbe2;
	}

	public Integer getRaeder() {
		return raeder;
	}

	public void setRaeder(Integer raeder) {
		this.raeder = raeder;
	}

	public FahrzeugFarben getFarbe() {
		return farbe;
	}

	public void setFarbe(FahrzeugFarben farbe) {
		this.farbe = farbe;
	}

	public FahrzeugMarke getMarke() {
		return marke;
	}

	public void setMarke(FahrzeugMarke marke) {
		this.marke = marke;
	}

}
