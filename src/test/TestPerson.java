package test;

import static org.junit.Assert.*;

import org.junit.Test;

import eigenschaften.FahrzeugFarben;
import eigenschaften.FahrzeugParameter;
import eigenschaften.FahrzeugTyp;
import eigenschaften.marke.AutoMarke;
import eigenschaften.marke.FahrradMarke;
import fabrik.Fabrik;
import person.Person;

public class TestPerson {

	@Test
	public void testLicenseNegative() {
		Person sylva = new Person();
		Fabrik fabrik = Fabrik.createFahrzeugFabrik(FahrzeugTyp.AUTO);
		fabrik.addParameter(FahrzeugParameter.createFarbeParameter(FahrzeugFarben.gelb));
		fabrik.addParameter(FahrzeugParameter.createMarkeParameter(AutoMarke.Honda));
		fabrik.addParameter(FahrzeugParameter.createTuerenParameter(4));

		sylva.setHatFuehrerschein(false);
		try {
			sylva.addFahrzeug(fabrik.createFahrzeug());
			assert false;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLicensePositive() {
		Person sylva = new Person();
		Fabrik fabrik = Fabrik.createFahrzeugFabrik(FahrzeugTyp.AUTO);
		fabrik.addParameter(FahrzeugParameter.createFarbeParameter(FahrzeugFarben.gelb));
		fabrik.addParameter(FahrzeugParameter.createMarkeParameter(AutoMarke.Honda));
		fabrik.addParameter(FahrzeugParameter.createTuerenParameter(4));

		sylva.setHatFuehrerschein(true);
		try {
			sylva.addFahrzeug(fabrik.createFahrzeug());
		} catch (Exception e) {
			e.printStackTrace();
			assert false;
		}
		
		
	}	
	

}
