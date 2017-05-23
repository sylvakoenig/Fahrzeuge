package fabrik;

import eigenschaften.FahrzeugFarben;
import eigenschaften.FahrzeugParameter;
import eigenschaften.marke.Marke;
import fahrzeuge.Fahrzeug;
import fahrzeuge.Motorrad;

public class MotorradFabrik extends Fabrik {
	
	public Motorrad createMotorrad(FahrzeugFarben farbe, Marke marke, Boolean hatGepaecktraeger){
		return new Motorrad(farbe, marke, hatGepaecktraeger);		
	}

	@Override
	public Fahrzeug createFahrzeug() {
		assert parameters.containsKey(FahrzeugParameter.ParameterTyp.farbe): "Farben-Parameter nicht gesetzt";;
		assert parameters.containsKey(FahrzeugParameter.ParameterTyp.Marke):"Marken-Parameter nicht gesetzt";
		assert parameters.containsKey(FahrzeugParameter.ParameterTyp.hatGepaecktraeger): "Gepaecktraeger-Parameter nicht gesetzt";
		
		Boolean hatGepaecktraeger = parameters.get(FahrzeugParameter.ParameterTyp.hatGepaecktraeger).getHatGepaecktrager();
		FahrzeugFarben farbe = parameters.get(FahrzeugParameter.ParameterTyp.farbe).getFarbe();
		Marke marke = parameters.get(FahrzeugParameter.ParameterTyp.Marke).getMarke();
		
		return createMotorrad(farbe, marke, hatGepaecktraeger);
	}
	
}
