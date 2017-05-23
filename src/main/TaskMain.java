package main;

import eigenschaften.FahrzeugFarben;
import eigenschaften.FahrzeugParameter;
import eigenschaften.FahrzeugTyp;
import eigenschaften.marke.AutoMarke;
import eigenschaften.marke.FahrradMarke;
import fabrik.Fabrik;
import person.Person;
import person.Person.NoLicenseException;

public class TaskMain {

	public static void main(String[] args) {
		Person sylva = new Person();
		Fabrik fabrik = Fabrik.createFahrzeugFabrik(FahrzeugTyp.FAHRRAD);

		fabrik.addParameter(FahrzeugParameter.createTuerenParameter(5));
		fabrik.addParameter(FahrzeugParameter.createMarkeParameter(FahrradMarke.Diamant));
		fabrik.addParameter(FahrzeugParameter.createFarbeParameter(FahrzeugFarben.grau));
		fabrik.addParameter(FahrzeugParameter.createGepaeckParameter(true));

		try {
			sylva.addFahrzeug(fabrik.createFahrzeug());
		} catch (NoLicenseException e) {
			e.printStackTrace();
		}

		fabrik = Fabrik.createFahrzeugFabrik(FahrzeugTyp.AUTO);
		fabrik.addParameter(FahrzeugParameter.createFarbeParameter(FahrzeugFarben.gelb));
		fabrik.addParameter(FahrzeugParameter.createMarkeParameter(AutoMarke.Honda));
		fabrik.addParameter(FahrzeugParameter.createTuerenParameter(4));

		sylva.setHatFuehrerschein(false);
		try {
			sylva.addFahrzeug(fabrik.createFahrzeug());
		} catch (NoLicenseException e) {
			e.printStackTrace();
		}

		fabrik.addParameter(FahrzeugParameter.createFarbeParameter(FahrzeugFarben.blau));
		try {
			sylva.addFahrzeug(fabrik.createFahrzeug());
		} catch (NoLicenseException e) {
			e.printStackTrace();
		}

		System.out.println(sylva);
	}

}

// Hausaufgaben

// - Packages erstellen -- max 5 Klassen pro Package
// ------> für die inhaltliche Bündelung hätte ich gern marke als package unter
// eigenschaften. wie krieg ich das hin?

// - Personen können ein oder mehr Fahrzeuge besitzen
// -- Abfrage: wie viele fahrzeuge und welche
// -- Person darf nur auto besitzen, wenn er/sie einen führerschein hat
// ------> erledigt
