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
	
		Bil b1 = new Bil("", "", "", "", UtleieEnum.LITEN_BIL, "2000");
		biler.add(b1);
		Bil b2 = new Bil("", "", "", "", UtleieEnum.MELLOMSTOR_BIL, "2000");
		biler.add(b2);
		Bil b3 = new Bil("", "", "", "", UtleieEnum.STOR_BIL, "2000");
		biler.add(b3);
		Bil b4 = new Bil("", "", "", "", UtleieEnum.STASJONSVOGN, "2000");
		biler.add(b4);
		
		return biler;	
	}
	
	public static List<Bil> leggTilBiler2() {
		
		List<Bil> biler =new ArrayList<Bil>();
		
		Bil b1 = new Bil("", "", "", "", UtleieEnum.LITEN_BIL, "2000");
		biler.add(b1);
		Bil b2 = new Bil("", "", "", "", UtleieEnum.MELLOMSTOR_BIL, "2000");
		biler.add(b2);
		Bil b3 = new Bil("", "", "", "", UtleieEnum.STOR_BIL, "2000");
		biler.add(b3);
		Bil b4 = new Bil("", "", "", "", UtleieEnum.STASJONSVOGN, "2000");
		biler.add(b4);
		
		return biler;
	}
	
	public static List<Bil> leggTilBiler3() {
		
		List<Bil> biler =new ArrayList<Bil>();
		
		Bil b1 = new Bil("", "", "", "", UtleieEnum.LITEN_BIL, "2000");
		biler.add(b1);
		Bil b2 = new Bil("", "", "", "", UtleieEnum.MELLOMSTOR_BIL, "2000");
		biler.add(b2);
		Bil b3 = new Bil("", "", "", "", UtleieEnum.STOR_BIL, "2000");
		biler.add(b3);
		Bil b4 = new Bil("", "", "", "", UtleieEnum.STASJONSVOGN, "2000");
		biler.add(b4);
		
		return biler;
	}

}
