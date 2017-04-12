package fahrzeuge;

public class Motorrad extends Fahrzeug {

	private Boolean hatGepaecktraeger;

	public Motorrad(String farbe, String marke, Boolean hatGepaecktraeger) {
		super(2, farbe, marke);
		this.hatGepaecktraeger = hatGepaecktraeger;
	}

	
	public Boolean getHatGepaecktraeger() {
		return hatGepaecktraeger;
	}

	public void setHatGepaecktraeger(Boolean hatGepaecktraeger) {
		this.hatGepaecktraeger = hatGepaecktraeger;
	}

	@Override
	public String toString() {
		return "Motorrad [raeder=" + raeder + ", farbe=" + farbe + ", marke=" + marke + ", hatGepaecktraeger="
				+ hatGepaecktraeger + "]";
	}
	
	
}
