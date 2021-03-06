package no.hvl.dat109.objekt;

/**
 * Klasse for � definere en adresse.
 * 
 * @author Philippe, Matias, Sebastian
 *
 */

public class Adresse {
	
	private String gateadresse;
	private int postnr;
	private String poststed;
	
	public Adresse(String gateadresse, int postnr, String poststed) {
		super();
		this.gateadresse = gateadresse;
		this.postnr = postnr;
		this.poststed = poststed;
	}

	public String getGateadresse() {
		return gateadresse;
	}

	public int getPostnr() {
		return postnr;
	}

	public String getPoststed() {
		return poststed;
	}
}