package fahrzeuge;

public class Fahrrad extends Fahrzeug {

	private Boolean hatGepaecktraeger;
	private Boolean hatPedale;

	public Fahrrad(String farbe, String marke, Boolean hatGepaecktraeger, Boolean hatPedale) {
		super(2, farbe, marke);
		this.hatGepaecktraeger = hatGepaecktraeger;
		this.hatPedale = hatPedale;
	}

	public Boolean getHatPedale() {
		return hatPedale;
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
