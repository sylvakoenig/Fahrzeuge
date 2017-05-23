package fahrzeuge;

import eigenschaften.FahrzeugFarben;
import eigenschaften.FahrzeugTyp;
import eigenschaften.marke.Marke;

public class Auto extends Fahrzeug {

	private Integer tueren;

	public Auto(Integer tueren, FahrzeugFarben farbe, Marke marke) {
		super(4, farbe, marke);
		this.tueren = tueren;
	}

	public String toString() {
		return "Dein Auto ist ein " + marke + ", hat " + raeder + " Räder, " + tueren + " Türen und ist " + farbe + ".";
	}

	public Integer getTueren() {
		return tueren;
	}

	public void setTueren(Integer tueren) {
		this.tueren = tueren;
	}

	@Override
	public FahrzeugTyp getTyp() {
		return FahrzeugTyp.AUTO;
	}

}
