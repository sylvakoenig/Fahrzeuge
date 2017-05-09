package fahrzeuge;

import marke.Marke;
import marke.Marke.MarkeTyp;

public class FahrradFabrik extends Fabrik {
	
	public Fahrrad createFahrrad(FahrzeugFarben farbe, Marke marke, Boolean hatGepaecktraeger){
		return new Fahrrad(farbe, marke, hatGepaecktraeger);		
	}

	@Override
	public Fahrzeug createFahrzeug() {
		assert parameters.containsKey(FahrzeugParameter.ParameterTyp.farbe): "Farben-Parameter nicht gesetzt";;
		assert parameters.containsKey(FahrzeugParameter.ParameterTyp.Marke):"Fahrrad-Marken-Parameter nicht gesetzt";
		assert parameters.containsKey(FahrzeugParameter.ParameterTyp.hatGepaecktraeger): "Gepaecktraeger-Parameter nicht gesetzt";
		assert parameters.get(FahrzeugParameter.ParameterTyp.Marke).getMarke().getType() == MarkeTyp.Fahrrad: "Marke ist keine Fahrradmarke";	
		
		Boolean hatGepaecktraeger = parameters.get(FahrzeugParameter.ParameterTyp.hatGepaecktraeger).getHatGepaecktrager();
		FahrzeugFarben farbe = parameters.get(FahrzeugParameter.ParameterTyp.farbe).getFarbe();
		Marke marke = parameters.get(FahrzeugParameter.ParameterTyp.Marke).getMarke();
		
		return createFahrrad(farbe, marke, hatGepaecktraeger);
	}
}
