package oblig2.objekt;

/**
 * Klasse for å definere en bil.
 * 
 * @author Matias, Philippe, Sebastian
 *
 */

public class Kunde {
	private String fornavn;
	private String etternavn;
	private Adresse adresse;
	private int tlfNr;
	
	public Kunde(String fornavn, String etternavn, int tlfNr, Adresse adresse) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.tlfNr = tlfNr;
		this.adresse = adresse;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public int getTlfNr() {
		return tlfNr;
	}

	public void setTlfNr(int tlfNr) {
		this.tlfNr = tlfNr;
	}
	
}
