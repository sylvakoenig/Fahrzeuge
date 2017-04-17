package main;

import java.util.ArrayList;
import java.util.List;

import fahrzeuge.Fabrik;
import fahrzeuge.Fahrzeug;
import fahrzeuge.FahrzeugTyp;

public class TaskMain {

	public static void main(String[] args) {

		Fabrik fabrik = new Fabrik();
		Fahrzeug lukasAuto = fabrik.createFahrzeug(FahrzeugTyp.AUTO, 5, "schwarz", "Mercedes");
		Fahrzeug meinAuto = fabrik.createFahrzeug(FahrzeugTyp.AUTO, 5, "rot", "Opel");
		Fahrzeug lukasMoped = fabrik.createFahrzeug(FahrzeugTyp.MOTORRAD, 5, "schwarz", "BMW");

		
		List<Fahrzeug> fahrzeuge = new ArrayList<>();
		fahrzeuge.add(lukasAuto);
		fahrzeuge.add(meinAuto);
		fahrzeuge.add(lukasMoped);
		
		for (Fahrzeug auto: fahrzeuge){
			System.out.println(auto);
		}		
		
	}

}

