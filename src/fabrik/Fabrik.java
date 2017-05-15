package fabrik;

import java.util.HashMap;

import eigenschaften.FahrzeugParameter;
import eigenschaften.FahrzeugTyp;
import eigenschaften.FahrzeugParameter.ParameterTyp;
import fahrzeuge.Fahrzeug;

public abstract class Fabrik {

	public Fabrik(){
		parameters = new HashMap<>();
	}
	
	public static Fabrik createFahrzeugFabrik(FahrzeugTyp typ){
		if (typ == FahrzeugTyp.AUTO){
			return new AutoFabrik();
		}
		else if (typ == FahrzeugTyp.MOTORRAD){
			return new MotorradFabrik();
		}
		else {
			return new FahrradFabrik();
		}
	}

	public abstract Fahrzeug createFahrzeug();	
	
	protected HashMap<ParameterTyp, FahrzeugParameter> parameters;
	
	public void addParameter(FahrzeugParameter parameter){
		parameters.put(parameter.getTyp(), parameter);
	}

}
