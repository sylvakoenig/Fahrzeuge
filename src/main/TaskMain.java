package main;

import eigenschaften.FahrzeugFarben;
import eigenschaften.FahrzeugParameter;
import eigenschaften.FahrzeugTyp;
import fabrik.Fabrik;
import marke.AutoMarke;
import marke.FahrradMarke;
import person.Person;

public class TaskMain {

	public static void main(String[] args) {
		Person sylva = new Person();
		Fabrik fabrik = Fabrik.createFahrzeugFabrik(FahrzeugTyp.FAHRRAD);

		fabrik.addParameter(FahrzeugParameter.createTuerenParameter(5));	
		fabrik.addParameter(FahrzeugParameter.createMarkeParameter(FahrradMarke.Diamant));	
		fabrik.addParameter(FahrzeugParameter.createFarbeParameter(FahrzeugFarben.grau));	
		fabrik.addParameter(FahrzeugParameter.createGepaeckParameter(true));
		sylva.addFahrzeug(fabrik.createFahrzeug());
		
		fabrik = Fabrik.createFahrzeugFabrik(FahrzeugTyp.AUTO);
		fabrik.addParameter(FahrzeugParameter.createFarbeParameter(FahrzeugFarben.gelb));
		fabrik.addParameter(FahrzeugParameter.createMarkeParameter(AutoMarke.Honda));
		fabrik.addParameter(FahrzeugParameter.createTuerenParameter(4));

		sylva.setHatFuehrerschein(true);
		sylva.addFahrzeug(fabrik.createFahrzeug());

		fabrik.addParameter(FahrzeugParameter.createFarbeParameter(FahrzeugFarben.blau));		
		sylva.addFahrzeug(fabrik.createFahrzeug());
		
		System.out.println(sylva);
	}

}

// Hausaufgaben

// - Packages erstellen -- max 5 Klassen pro Package
// ------> für die inhaltliche Bündelung hätte ich gern marke als package unter eigenschaften. wie krieg ich das hin?

// - Personen können ein oder mehr Fahrzeuge besitzen
// -- Abfrage: wie viele fahrzeuge und welche
// -- Person darf nur auto besitzen, wenn er/sie einen führerschein hat
// ------> erledigt

