package person;

import java.util.ArrayList;

import fahrzeuge.Auto;
import fahrzeuge.Fahrrad;
import fahrzeuge.Fahrzeug;

public class Person {

	private Boolean hatFuehrerschein;
	private ArrayList<Fahrzeug> meineFahrzeuge = new ArrayList<Fahrzeug>();

	public Boolean getHatFuehrerschein() {
		return hatFuehrerschein;
	}

	public void setHatFuehrerschein(Boolean hatFuehrerschein) {
		this.hatFuehrerschein = hatFuehrerschein;
	}

	public ArrayList<Fahrzeug> getMeineFahrzeuge() {
		return meineFahrzeuge;
	}

	public void setMeineFahrzeuge(ArrayList<Fahrzeug> meineFahrzeuge) {
		this.meineFahrzeuge = meineFahrzeuge;
	}

	public void addFahrzeug(Fahrzeug neuesFahrzeug){
		if (neuesFahrzeug instanceof Auto){
			if (this.hatFuehrerschein){
				this.meineFahrzeuge.add(neuesFahrzeug);
			} else {
				System.out.println("Die Person darf kein Auto bekommen, wenn sie keine Führerschein besitzt."); // oder das hier lieber als assert?? 
			}
		} else { // neuesFahrzeug ist kein Auto
			this.meineFahrzeuge.add(neuesFahrzeug);	
		}
		
	}
	
	public String toString(){
		Integer anzAuto = 0;
		Integer anzFahrrad = 0;
		Integer anzMotorrad = 0;
		
		for (int i=0; i < this.meineFahrzeuge.size(); i++){
			if (this.meineFahrzeuge.get(i) instanceof Auto){
				anzAuto ++;
			} else if (this.meineFahrzeuge.get(i) instanceof Fahrrad){
				anzFahrrad ++;
			} else {
				anzMotorrad ++;
			}
		}	

		return "Du hast " + anzAuto + " Auto(s), " + anzFahrrad + " Fahrrad/Fahrräder und " + anzMotorrad + " Motorrad/Motorräder.";
	}
}
