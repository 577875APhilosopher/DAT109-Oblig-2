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
		Bil b2 = new Bil("", "Toyota", "Yaris", "R�d", UtleieEnum.MELLOMSTOR_BIL, "2000");
		biler.add(b2);
		
		return biler;	
	}
	
	public static List<Bil> leggTilBiler2() {
		
		List<Bil> biler =new ArrayList<Bil>();
		
		Bil b1 = new Bil("", "VW", "Caddy", "Hvit", UtleieEnum.STASJONSVOGN, "2000");
		biler.add(b1);
		Bil b2 = new Bil("", "KIA", "Sport", "Gr�", UtleieEnum.MELLOMSTOR_BIL, "2000");
		biler.add(b2);
		Bil b3 = new Bil("", "Opel", "Ampera", "R�d", UtleieEnum.LITEN_BIL, "2000");
		biler.add(b3);
		
		return biler;
	}
	
	public static List<Bil> leggTilBiler3() {
		
		List<Bil> biler =new ArrayList<Bil>();
		
		Bil b1 = new Bil("", "Jaguar", "I-Pace", "Hvit", UtleieEnum.LITEN_BIL, "2000");
		biler.add(b1);
		Bil b2 = new Bil("", "Nissan", "Leaf", "Gr�", UtleieEnum.MELLOMSTOR_BIL, "2000");
		biler.add(b2);
		Bil b3 = new Bil("", "Toyota", "Yaris", "Bl�", UtleieEnum.STOR_BIL, "2000");
		biler.add(b3);
		Bil b4 = new Bil("", "Volvo", "V90", "Gr�", UtleieEnum.STASJONSVOGN, "2000");
		biler.add(b4);
		Bil b5 = new Bil("", "", "", "", UtleieEnum.MELLOMSTOR_BIL, "2000");
		biler.add(b5);
		
		return biler;
	}

}
