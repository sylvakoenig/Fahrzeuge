package fahrzeuge;

import java.util.HashMap;
import java.util.Random;

import fahrzeuge.FahrzeugParameter.ParameterTyp;

public abstract class Fabrik {

	public Fabrik(){
		parameters = new HashMap<>();
	}
	
	public static Fabrik createFahrzeugFabrik(FahrzeugTyp typ){
		if (typ == FahrzeugTyp.AUTO){
			return new AutoFabrik();
		}
		return null;
//		else if (typ == FahrzeugTyp.MOTORRAD){
//			return new Motorrad(farbe, marke, false);
//		}
//		else {
//			return new Fahrrad(farbe, marke, true);
//		}
	}

	public abstract Fahrzeug createFahrzeug();	
	
	protected HashMap<ParameterTyp, FahrzeugParameter> parameters;
	
	public void addParameter(FahrzeugParameter parameter){
		parameters.put(parameter.getTyp(), parameter);
	}
	
	
}
