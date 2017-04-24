package main;

import java.util.ArrayList;
import java.util.List;

import fahrzeuge.Fabrik;
import fahrzeuge.Fahrzeug;
import fahrzeuge.FahrzeugFarben;
import fahrzeuge.FahrzeugMarke;
import fahrzeuge.FahrzeugParameter;
import fahrzeuge.FahrzeugParameter.ParameterTyp;
import fahrzeuge.FahrzeugTyp;

public class TaskMain {

	public static void main(String[] args) {

		
		Fabrik fabrik = Fabrik.createFahrzeugFabrik(FahrzeugTyp.AUTO);

		
		fabrik.addParameter(FahrzeugParameter.createTuerenParameter(5));	
		fabrik.addParameter(FahrzeugParameter.createMarkeParameter(FahrzeugMarke.BMW));	
		fabrik.addParameter(FahrzeugParameter.createFarbeParameter(FahrzeugFarben.grau));	

		
		Fahrzeug erstesAuto = fabrik.createFahrzeug();
		
		System.out.println(erstesAuto);
	}

}
