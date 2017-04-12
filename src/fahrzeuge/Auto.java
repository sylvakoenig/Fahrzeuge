package fahrzeuge;

public class Auto {

	private Integer raeder;
	private Integer tueren;
	private String farbe;
	private String marke;

	public Auto(Integer raeder, Integer tueren, String farbe, String marke) {
		super();
		this.raeder = raeder;
		this.tueren = tueren;
		this.farbe = farbe;
		this.marke = marke;
	}

	public String toString() {
		return "Dein Auto ist ein " + marke + ", hat " + raeder + " Räder, " + tueren + " Türen und ist " + farbe + ".";
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public Integer getRaeder() {
		return raeder;
	}

	public void setRaeder(Integer raeder) {
		this.raeder = raeder;
	}

	public Integer getTueren() {
		return tueren;
	}

	public void setTueren(Integer tueren) {
		this.tueren = tueren;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getFarbe() {
		return farbe;
	}

}
