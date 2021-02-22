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
	
		Bil b1 = new Bil("", "Mercedes", "CLA250e", "Hvit", UtleieEnum.STOR_BIL, "2000");
		biler.add(b1);
		Bil b2 = new Bil("", "Toyota", "Yaris", "Rød", UtleieEnum.MELLOMSTOR_BIL, "2000");
		biler.add(b2);
		
		return biler;	
	}
	
	public static List<Bil> leggTilBiler2() {
		
		List<Bil> biler =new ArrayList<Bil>();
		
		Bil b1 = new Bil("", "VW", "Caddy", "Hvit", UtleieEnum.STASJONSVOGN, "2000");
		biler.add(b1);
		Bil b2 = new Bil("", "KIA", "Sport", "Grå", UtleieEnum.MELLOMSTOR_BIL, "2000");
		biler.add(b2);
		Bil b3 = new Bil("", "Opel", "Ampera", "Rød", UtleieEnum.LITEN_BIL, "2000");
		biler.add(b3);
		
		return biler;
	}
	
	public static List<Bil> leggTilBiler3() {
		
		List<Bil> biler =new ArrayList<Bil>();
		
		Bil b1 = new Bil("", "Jaguar", "I-Pace", "Hvit", UtleieEnum.LITEN_BIL, "2000");
		biler.add(b1);
		Bil b2 = new Bil("", "Nissan", "Leaf", "Grå", UtleieEnum.MELLOMSTOR_BIL, "2000");
		biler.add(b2);
		Bil b3 = new Bil("", "Toyota", "Yaris", "Blå", UtleieEnum.STOR_BIL, "2000");
		biler.add(b3);
		Bil b4 = new Bil("", "Volvo", "V90", "Grå", UtleieEnum.STASJONSVOGN, "2000");
		biler.add(b4);
		Bil b5 = new Bil("", "", "", "", UtleieEnum.MELLOMSTOR_BIL, "2000");
		biler.add(b5);
		
		return biler;
	}

}
