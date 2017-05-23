package fahrzeuge;

import eigenschaften.FahrzeugFarben;
import eigenschaften.FahrzeugTyp;
import eigenschaften.marke.Marke;
import eigenschaften.marke.MotorradMarke;

public class Motorrad extends Fahrzeug {

	private Boolean hatGepaecktraeger;
	private Boolean hatPedale;
	private MotorradMarke marke;

	public Motorrad(FahrzeugFarben farbe, Marke marke, Boolean hatGepaecktraeger){
		super(2, farbe, marke);
		this.hatGepaecktraeger = hatGepaecktraeger;
		this.setHatPedale(false);
	}
	
	public Motorrad(FahrzeugFarben farbe, MotorradMarke marke, Boolean hatGepaecktraeger){
		super(2, farbe);
		this.hatGepaecktraeger = hatGepaecktraeger;
		this.setHatPedale(false);
		this.marke = marke;
	}

	
	public Boolean getHatGepaecktraeger() {
		return hatGepaecktraeger;
	}

	public void setHatGepaecktraeger(Boolean hatGepaecktraeger) {
		this.hatGepaecktraeger = hatGepaecktraeger;
	}

	@Override
	public String toString() {
		return "Dein Motorrad ist ein " + marke + " mit "  + raeder + " Raedern, es ist " + farbe + " und hatGepaecktraeger="
				+ hatGepaecktraeger + ".";
	}


	public Boolean getHatPedale() {
		return hatPedale;
	}


	public void setHatPedale(Boolean hatPedale) {
		this.hatPedale = hatPedale;
	}

	@Override
	public FahrzeugTyp getTyp() {
		return FahrzeugTyp.MOTORRAD;
	}
	
	
}
