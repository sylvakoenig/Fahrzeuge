package fahrzeuge;

public class Fabrik {

	public Fahrzeug createFahrzeug(FahrzeugTyp typ, Integer tueren, String farbe, String marke){
		if (typ == FahrzeugTyp.AUTO){
			return new Auto( tueren, farbe, marke);
		}
		else {
			return new Motorrad(farbe, marke, false);
		}
			
	}
}
