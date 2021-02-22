package no.hvl.dat109.objekt;

/**
 * Klasse for å definere et kredittkort.
 * 
 * @author Philippe, Matias, Sebastian
 *
 */

public class Kredittkort {
	private long kortNummer;
	
	public Kredittkort(long nummer) {
		this.kortNummer = nummer;
	}

	public long getKortNummer() {
		return kortNummer;
	}

	public void setKortNummer(long kortNummer) {
		this.kortNummer = kortNummer;
	}
	
	public boolean validerKort() {
		boolean ok = false;
		
		if (String.valueOf(kortNummer).length() == 16) {
			ok = true;
		}
		
		return ok;
	}
}
