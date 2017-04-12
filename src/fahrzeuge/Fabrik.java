package fahrzeuge;

public class Fabrik {

	public Fahrzeug createFahrzeug(String typ, Integer tueren, String farbe, String marke){
		if (typ.equals("auto")){
			return new Auto( tueren, farbe, marke);
		}
		else {
			return new Motorrad(farbe, marke, false);
		}
			
	}
}
