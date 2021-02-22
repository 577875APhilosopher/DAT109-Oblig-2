package no.hvl.dat109.objekt;

/**
 * Klasse for lagring av bil informasjon.
 * 
 * @author Philippe, Matias, Sebastian
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Bilpark {
	
	public static List<Bil> leggTilBiler1() {
		
		List<Bil> biler =new ArrayList<Bil>();
	
		Bil b1 = new Bil("BG1003", "Mercedes", "CLA250e", "Hvit", UtleieEnum.STOR_BIL, "700");
		biler.add(b1);
		Bil b2 = new Bil("HO1002", "Toyota", "Yaris", "Rød", UtleieEnum.MELLOMSTOR_BIL, "600");
		biler.add(b2);
		
		return biler;	
	}
	
	public static List<Bil> leggTilBiler2() {
		
		List<Bil> biler =new ArrayList<Bil>();
		
		Bil b1 = new Bil("KG4959", "VW", "Caddy", "Hvit", UtleieEnum.STASJONSVOGN, "800");
		biler.add(b1);
		Bil b2 = new Bil("FK2030", "KIA", "Sport", "Grå", UtleieEnum.MELLOMSTOR_BIL, "600");
		biler.add(b2);
		Bil b3 = new Bil("SK3993", "Opel", "Ampera", "Rød", UtleieEnum.LITEN_BIL, "500");
		biler.add(b3);
		
		return biler;
	}
	
	public static List<Bil> leggTilBiler3() {
		
		List<Bil> biler =new ArrayList<Bil>();
		
		Bil b1 = new Bil("SO2030", "Jaguar", "I-Pace", "Hvit", UtleieEnum.LITEN_BIL, "500");
		biler.add(b1);
		Bil b2 = new Bil("FG1304", "Nissan", "Leaf", "Grå", UtleieEnum.MELLOMSTOR_BIL, "600");
		biler.add(b2);
		Bil b3 = new Bil("TO0000", "Toyota", "Yaris", "Blå", UtleieEnum.STOR_BIL, "700");
		biler.add(b3);
		Bil b4 = new Bil("IO5486", "Volvo", "V90", "Grå", UtleieEnum.STASJONSVOGN, "800");
		biler.add(b4);
		Bil b5 = new Bil("WU5869", "VW", "Touran", "Svart", UtleieEnum.MELLOMSTOR_BIL, "600");
		biler.add(b5);
		
		return biler;
	}

}
