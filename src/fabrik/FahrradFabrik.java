package fabrik;

import eigenschaften.FahrzeugFarben;
import eigenschaften.FahrzeugParameter;
import eigenschaften.marke.Marke;
import eigenschaften.marke.Marke.MarkeTyp;
import fahrzeuge.Fahrrad;
import fahrzeuge.Fahrzeug;

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
