package main;

import java.util.ArrayList;
import java.util.List;

import fahrzeuge.Auto;
import fahrzeuge.Fahrzeug;
import fahrzeuge.Motorrad;

public class TaskMain {

	public static void main(String[] args) {

		Auto meinAuto = new Auto( 4, "blau", "Honda");
		Auto lukasAuto = new Auto(5, "schwarz", "Mercedes");
		Motorrad lukasMoped = new Motorrad("grau", "Kawasaki", false);
		System.out.println(meinAuto);
		meinAuto.setFarbe("rot");
		System.out.println(meinAuto);
		System.out.println(lukasAuto);
		System.out.println(lukasMoped);
		
		List<Fahrzeug> fahrzeuge = new ArrayList<>();
		fahrzeuge.add(lukasAuto);
		fahrzeuge.add(meinAuto);
		fahrzeuge.add(lukasMoped);
		
		for (Fahrzeug auto: fahrzeuge){
			System.out.println(auto);
		}
		
		
		
		
		
		
		
	}

}

