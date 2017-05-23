package person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.function.Consumer;

import eigenschaften.FahrzeugTyp;
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

	public void addFahrzeug(Fahrzeug neuesFahrzeug) throws NoLicenseException {
		if ((neuesFahrzeug instanceof Auto) && (!this.hatFuehrerschein)) {
			throw new NoLicenseException();
		}
		this.meineFahrzeuge.add(neuesFahrzeug);
	}

	public String toString() {

		HashMap<FahrzeugTyp, Integer> fahrzeugMap = new HashMap<>();

		Arrays.asList(FahrzeugTyp.values()).forEach(new Consumer<FahrzeugTyp>() {
			@Override
			public void accept(FahrzeugTyp t) {
				fahrzeugMap.put(t, 0);
			}
		});

		for (Fahrzeug fahrzeug : meineFahrzeuge) {
			fahrzeugMap.put(fahrzeug.getTyp(), fahrzeugMap.get(fahrzeug.getTyp()) + 1);
		}

		StringBuilder result = new StringBuilder();

		for (Entry<FahrzeugTyp, Integer> entry : fahrzeugMap.entrySet()) {
			result.append(entry.getValue().toString());
			result.append(" ");
			result.append(entry.getKey().toString());
			result.append(" ");
		}
		return result.toString();
	}

	public class NoLicenseException extends Exception {

		public NoLicenseException() {
			super("Die Person darf kein Auto bekommen, wenn sie keine Führerschein besitzt.");
		}

	}

}
