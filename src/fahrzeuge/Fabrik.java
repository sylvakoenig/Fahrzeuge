package fahrzeuge;

import java.util.Random;

public class Fabrik {

	public Fahrzeug createFahrzeug(FahrzeugTyp typ, Integer tueren, FahrzeugFarben farbe, FahrzeugMarke marke){
		if (typ == FahrzeugTyp.AUTO){
			return new Auto( tueren, farbe, marke);
		}
		else if (typ == FahrzeugTyp.MOTORRAD){
			return new Motorrad(farbe, marke, false);
		}
		else {
			return new Fahrrad(farbe, marke, true);
		}
	}

	public Fahrzeug createFahrzeug(FahrzeugTyp typ, Integer tueren, FahrzeugFarben farbe){
		if (typ == FahrzeugTyp.AUTO){
			 Random randomGenerator = new Random();
			 int randomInt = randomGenerator.nextInt(FahrzeugMarke.values().length);
			 FahrzeugMarke zufallsMarke = FahrzeugMarke.values()[randomInt];
			return new Auto(tueren, farbe, zufallsMarke);
		}
		else if (typ == FahrzeugTyp.MOTORRAD){
			 Random randomGenerator = new Random();
			 int randomInt = randomGenerator.nextInt(MotorradMarke.values().length);
			 MotorradMarke zufallsMarke = MotorradMarke.values()[randomInt];
			 return new Motorrad(farbe, zufallsMarke, false);
		}
		else {
			 Random randomGenerator = new Random();
			 int randomInt = randomGenerator.nextInt(FahrradMarke.values().length);
			 FahrradMarke zufallsMarke = FahrradMarke.values()[randomInt];
			 return new Fahrrad(farbe, zufallsMarke, true);
		}
	}
	
	
	public Fahrzeug createZufallsFahrzeug(){
		 Random randomGenerator = new Random();
		 int randomInt = randomGenerator.nextInt(FahrzeugTyp.values().length);
		 FahrzeugTyp zufallsTyp;
		 zufallsTyp = FahrzeugTyp.values()[randomInt];
		
		 randomInt = randomGenerator.nextInt(FahrzeugFarben.values().length);
		 FahrzeugFarben zufallsFarbe;
		 zufallsFarbe = FahrzeugFarben.values()[randomInt];
				

		 
		 return createFahrzeug(zufallsTyp, 2, zufallsFarbe);
	}
	
}
