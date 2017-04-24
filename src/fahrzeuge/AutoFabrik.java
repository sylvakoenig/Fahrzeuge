package fahrzeuge;

public class AutoFabrik extends Fabrik {

	
	
	public Auto createAuto(Integer tueren, FahrzeugFarben farbe, FahrzeugMarke marke){
		return new Auto(tueren, farbe, marke);		
	}

	@Override
	public Fahrzeug createFahrzeug() {
		assert parameters.containsKey(FahrzeugParameter.ParameterTyp.tueren);
		assert parameters.containsKey(FahrzeugParameter.ParameterTyp.farbe);
		assert parameters.containsKey(FahrzeugParameter.ParameterTyp.marke);
		
		Integer tueren = parameters.get(FahrzeugParameter.ParameterTyp.tueren).getTueren();
		FahrzeugFarben farbe = parameters.get(FahrzeugParameter.ParameterTyp.farbe).getFarbe();
		FahrzeugMarke marke = parameters.get(FahrzeugParameter.ParameterTyp.marke).getMarke();
		
		return createAuto(tueren, farbe, marke);
	}
	
}
