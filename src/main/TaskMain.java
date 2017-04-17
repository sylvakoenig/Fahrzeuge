package main;

import java.util.ArrayList;
import java.util.List;

import fahrzeuge.Fabrik;
import fahrzeuge.Fahrzeug;

public class TaskMain {

	public static void main(String[] args) {

		Fabrik fabrik = new Fabrik();
		List<Fahrzeug> zufallsFabrik = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			Fahrzeug neuesFahrzeug = fabrik.createZufallsFahrzeug();
			zufallsFabrik.add(neuesFahrzeug);
		}
		
		for (Fahrzeug auto : zufallsFabrik) {
			System.out.println(auto);
		}

	}

}
