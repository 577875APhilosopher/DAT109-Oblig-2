package no.hvl.dat109.objekt;

/**
 * Klasse for å definere en kunde.
 * 
 * @author Philippe, Matias, Sebastian
 *
 */

public class Kunde {
	private String fornavn;
	private String etternavn;
	private Adresse addresse;
	private int telefonNummer;
	private Kredittkort kredittKort;
	
	public Kunde(String fornavn, String etternavn, Adresse addresse, int telefonNummer) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.addresse = addresse;
		this.telefonNummer = telefonNummer;
		this.kredittKort = null;
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
	
	public Adresse getAddresse() {
		return addresse;
	}

	public void setAddresse(Adresse addresse) {
		this.addresse = addresse;
	}

	public int getTelefonNummer() {
		return telefonNummer;
	}

	public void setTelefonNummer(int telefonNummer) {
		this.telefonNummer = telefonNummer;
	}
	
	public Kredittkort getKredittKort() {
		return kredittKort;
	}

	public void setKredittKort(Kredittkort kredittKort) {
		this.kredittKort = kredittKort;
	}
	
}
