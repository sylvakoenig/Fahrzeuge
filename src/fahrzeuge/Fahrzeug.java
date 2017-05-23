package fahrzeuge;

import eigenschaften.FahrzeugFarben;
import eigenschaften.FahrzeugTyp;
import eigenschaften.marke.Marke;

public abstract class Fahrzeug {

	protected Integer raeder; // sichtbar für diese Klasse und alle die von
								// dieser Klasse erben
	protected FahrzeugFarben farbe;
	protected Marke marke;

	public abstract FahrzeugTyp getTyp();
	
	public Fahrzeug(Integer raeder, FahrzeugFarben farbe, Marke marke) {
		super();
		this.raeder = raeder;
		this.farbe = farbe;
		this.marke = marke;
	}

	public Fahrzeug(Integer raeder, FahrzeugFarben farbe) {
		super();
		this.raeder = raeder;
		this.farbe = farbe;
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

	public Marke getMarke() {
		return marke;
	}

	public void setMarke(Marke marke) {
		this.marke = marke;
	}

}
