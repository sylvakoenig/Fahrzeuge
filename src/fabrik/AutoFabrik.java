package fabrik;

import eigenschaften.FahrzeugFarben;
import eigenschaften.FahrzeugParameter;
import fahrzeuge.Auto;
import fahrzeuge.Fahrzeug;
import marke.Marke;
import marke.Marke.MarkeTyp;

public class AutoFabrik extends Fabrik {

	
	
	public Auto createAuto(Integer tueren, FahrzeugFarben farbe, Marke marke){
		return new Auto(tueren, farbe, marke);		
	}

	@Override
	public Fahrzeug createFahrzeug() {
		assert parameters.containsKey(FahrzeugParameter.ParameterTyp.tueren): "Tueren-Parameter nicht gesetzt";
		assert parameters.containsKey(FahrzeugParameter.ParameterTyp.farbe): "Farben-Parameter nicht gesetzt";
		assert parameters.containsKey(FahrzeugParameter.ParameterTyp.Marke):"Marken-Parameter nicht gesetzt";
		assert parameters.get(FahrzeugParameter.ParameterTyp.Marke).getMarke().getType() == MarkeTyp.Auto: "Marke ist keine Automarke";	
		
		Integer tueren = parameters.get(FahrzeugParameter.ParameterTyp.tueren).getTueren();
		FahrzeugFarben farbe = parameters.get(FahrzeugParameter.ParameterTyp.farbe).getFarbe();
		Marke marke = parameters.get(FahrzeugParameter.ParameterTyp.Marke).getMarke();
		
		return createAuto(tueren, farbe, marke);
	}
	
}
