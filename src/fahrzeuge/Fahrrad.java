package fahrzeuge;

public class Fahrrad extends Fahrzeug {

	private Boolean hatGepaecktraeger;
	private Boolean hatPedale;
	private FahrradMarke marke;

	public Fahrrad(FahrzeugFarben farbe, FahrradMarke marke, Boolean hatGepaecktraeger) {
		super(2, farbe);
		this.hatGepaecktraeger = hatGepaecktraeger;
		this.hatPedale = true;
		this.marke = marke;
	}
	
	public Fahrrad(FahrzeugFarben farbe, FahrzeugMarke marke, Boolean hatGepaecktraeger) {
		super(2, farbe, marke);
		this.hatGepaecktraeger = hatGepaecktraeger;
		this.hatPedale = true;
	}
	

	public Boolean getHatPedale() {
		return hatPedale;
	}

	@Override
	public String toString() {
		return "Dein Fahrrad ist ein " + marke + " mit " + raeder + " Raedern, es ist " + farbe + " und hatGepaecktraeger=" + hatGepaecktraeger + ", hatPedale=" + hatPedale;
	}

	public void setHatPedale(Boolean hatPedale) {
		this.hatPedale = hatPedale;
	}

	public Boolean getHatGepaecktraeger() {
		return hatGepaecktraeger;
	}

	public void setHatGepaecktraeger(boolean hatGepaecktraeger) {
		this.hatGepaecktraeger = hatGepaecktraeger;
	}

}
