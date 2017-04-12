package fahrzeuge;

public class Motorrad {

	private Integer raeder;
	private String farbe;
	private String marke;
	private Boolean hatGepaecktraeger;


	public Motorrad(Integer raeder, String farbe, String marke, Boolean hatGepaecktraeger) {
		super();
		this.raeder = raeder;
		this.farbe = farbe;
		this.marke = marke;
		this.hatGepaecktraeger = hatGepaecktraeger;
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
