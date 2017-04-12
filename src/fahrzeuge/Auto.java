package fahrzeuge;

public class Auto extends Fahrzeug {

	private Integer tueren;

	public Auto(Integer tueren, String farbe, String marke) {
		super(4, farbe, marke);
		this.tueren = tueren;
	}
	
	public String toString() {
		return "Dein Auto ist ein " + marke + ", hat " + raeder + " R�der, " + tueren + " T�ren und ist " + farbe + ".";
	}

	public Integer getTueren() {
		return tueren;
	}

	public void setTueren(Integer tueren) {
		this.tueren = tueren;
	}

}
