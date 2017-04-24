package fahrzeuge;

public class FahrzeugParameter {
	private Integer tueren;
	private Integer raeder;
	private FahrzeugMarke marke;
	private FahrzeugFarben farbe;
	private ParameterTyp typ;
	
	private FahrzeugParameter() {
		super();
	}
	
	public Integer getTueren() {
		return tueren;
	}
	private void setTueren(Integer tueren) {
		this.tueren = tueren;
	}
	public Integer getRaeder() {
		return raeder;
	}
	private void setRaeder(Integer raeder) {
		this.raeder = raeder;
	}
	public FahrzeugMarke getMarke() {
		return marke;
	}
	private void setMarke(FahrzeugMarke marke) {
		this.marke = marke;
	}
	public FahrzeugFarben getFarbe() {
		return farbe;
	}
	private void setFarbe(FahrzeugFarben farbe) {
		this.farbe = farbe;
	}
	
	
	public ParameterTyp getTyp() {
		return typ;
	}

	private void setTyp(ParameterTyp typ) {
		this.typ = typ;
	}


	public enum ParameterTyp{
		tueren, raeder, marke, farbe;
	}
	
	
	public static FahrzeugParameter createMarkeParameter(FahrzeugMarke marke){
		FahrzeugParameter parameter = new FahrzeugParameter();
		parameter.setTyp(ParameterTyp.marke);
		parameter.setMarke(marke);
		return parameter;
	}
	
	public static FahrzeugParameter createFarbeParameter(FahrzeugFarben farbe){
		FahrzeugParameter parameter = new FahrzeugParameter();
		parameter.setTyp(ParameterTyp.farbe);
		parameter.setFarbe(farbe);
		return parameter;
	}	
	
	public static FahrzeugParameter createTuerenParameter(Integer tueren){
		FahrzeugParameter parameter = new FahrzeugParameter();
		parameter.setTyp(ParameterTyp.tueren);
		parameter.setTueren(tueren);
		return parameter;
	}	
}
