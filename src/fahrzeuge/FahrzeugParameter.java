package fahrzeuge;

import marke.AutoMarke;
import marke.FahrradMarke;
import marke.Marke;
import marke.MotorradMarke;

public class FahrzeugParameter {
	private Integer tueren;
	private Integer raeder;
	public Marke getMarke() {
		return marke;
	}

	public void setMarke(Marke marke) {
		this.marke = marke;
	}

	public void setRaeder(Integer raeder) {
		this.raeder = raeder;
	}

	private Marke marke;
	private FahrzeugFarben farbe;
	private ParameterTyp typ;
	private Boolean hatGepaecktrager;
	
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

	public Boolean getHatGepaecktrager() {
		return hatGepaecktrager;
	}

	public void setHatGepaecktrager(Boolean hatGepaecktrager) {
		this.hatGepaecktrager = hatGepaecktrager;
	}

	public enum ParameterTyp{
		tueren, raeder, farbe, hatGepaecktraeger, Marke;
	}

	public static FahrzeugParameter createMarkeParameter(Marke marke){
		FahrzeugParameter parameter = new FahrzeugParameter();
		parameter.setTyp(ParameterTyp.Marke);
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

	public static FahrzeugParameter createGepaeckParameter(boolean hatGepaecktraeger) {
		FahrzeugParameter parameter = new FahrzeugParameter();
		parameter.setTyp(ParameterTyp.hatGepaecktraeger);
		parameter.setHatGepaecktrager(hatGepaecktraeger);
		return parameter;
	}
	
}
