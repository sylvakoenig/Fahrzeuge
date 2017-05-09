package main;

import fahrzeuge.Fabrik;
import fahrzeuge.Fahrzeug;
import fahrzeuge.FahrzeugFarben;
import fahrzeuge.FahrzeugParameter;
import fahrzeuge.FahrzeugTyp;
import marke.FahrradMarke;

public class TaskMain {

	public static void main(String[] args) {
	
		Fabrik fabrik = Fabrik.createFahrzeugFabrik(FahrzeugTyp.FAHRRAD);

		fabrik.addParameter(FahrzeugParameter.createTuerenParameter(5));	
		fabrik.addParameter(FahrzeugParameter.createMarkeParameter(FahrradMarke.Diamant));	
		fabrik.addParameter(FahrzeugParameter.createFarbeParameter(FahrzeugFarben.grau));	
		fabrik.addParameter(FahrzeugParameter.createGepaeckParameter(true));
		//fabrik.addParameter(FahrzeugParameter.createFahrradMarkeParameter(FahrradMarke.Rose));

		Fahrzeug erstesFahrrad = fabrik.createFahrzeug();

		System.out.println(erstesFahrrad);

	}

}

// Hausaufgaben
// - Packages erstellen -- max 5 Klassen pro Package
// - Personen können ein oder mehr Fahrzeuge besitzen
// -- Abfrage: wie viele fahrzeuge und welche
// -- Person darf nur auto besitzen, wenn er/sie einen führerschein hat
