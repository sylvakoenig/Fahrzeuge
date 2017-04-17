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
			return new Fahrrad(farbe, marke, true, true);
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
				
		 randomInt = randomGenerator.nextInt(FahrzeugMarke.values().length);
		 FahrzeugMarke zufallsMarke;
		 zufallsMarke = FahrzeugMarke.values()[randomInt];
		 
		 return createFahrzeug(zufallsTyp, 2, zufallsFarbe, zufallsMarke);
	}
	
}
