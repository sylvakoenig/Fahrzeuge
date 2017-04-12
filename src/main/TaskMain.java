package main;

import java.util.ArrayList;
import java.util.List;

import fahrzeuge.Auto;
import fahrzeuge.Motorrad;

public class TaskMain {

	public static void main(String[] args) {

		Auto meinAuto = new Auto(4, 4, "blau", "Honda");
		Auto lukasAuto = new Auto(4, 5, "schwarz", "Mercedes");
		Motorrad lukasMoped = new Motorrad(2, "grau", "Kawasaki", false);
		System.out.println(meinAuto);
		meinAuto.setFarbe("rot");
		System.out.println(meinAuto);
		System.out.println(lukasAuto);
		System.out.println(lukasMoped);
		
		List<Auto> autos = new ArrayList<>();
		autos.add(lukasAuto);
		autos.add(meinAuto);
		
		for (Auto auto: autos){
			System.out.println(auto);
		}
		
	}

}

