package no.hvl.dat109.objekt;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse for å definere ett utleieselskap.
 * 
 * @author Philippe, Matias, Sebastian
 *
 */

public class UtleieSelskap {
	private String navn;
	private Adresse firmaAdr;
	private String tlfNr;
	private List<Reservasjon> reservasjoner;
	private List<UtleieKontor> utleiekontorer;
	private List<Utleie> utleverteBiler;
	private List<Retur> returnerteBiler;
	
	public UtleieSelskap(String navn, Adresse firmaAdr, String tlfNr) {
		this.navn = navn;
		this.firmaAdr = firmaAdr;
		this.tlfNr = tlfNr;
		this.reservasjoner = new ArrayList<Reservasjon>();
		this.utleiekontorer = new ArrayList<UtleieKontor>();
		this.utleverteBiler = new ArrayList<Utleie>();
		this.returnerteBiler = new ArrayList<Retur>();
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public Adresse getFirmaAdr() {
		return firmaAdr;
	}

	public void setFirmaAdr(Adresse firmaAdr) {
		this.firmaAdr = firmaAdr;
	}

	public String getTlfNr() {
		return tlfNr;
	}

	public void setTlfNr(String tlfNr) {
		this.tlfNr = tlfNr;
	}
	
	public List<Reservasjon> getReservasjoner(){
		return this.reservasjoner;
	}
	
	/**
	 * Metode for å legge til en reservasjon.
	 * 
	 * @param res
	 */
	public void leggTilReservasjon(Reservasjon res) {
		reservasjoner.add(res);
	}
	
	public List<UtleieKontor> getKontorer(){
		return this.utleiekontorer;
	}
	
	public void leggTilKontor(UtleieKontor kontor) {
		utleiekontorer.add(kontor);
	}
	
	public List<Utleie> getUtleverteBiler() {
		return utleverteBiler;
	}
	
	/**
	 * Metode for å legge til en utlevering.
	 * 
	 * @param utlevering
	 */
	public void leggTilUtlevertBil(Utleie utlevering) {
		utleverteBiler.add(utlevering);
	}
	
	public List<Retur> getReturnerteBiler() {
		return returnerteBiler;
	}
	
	/**
	 * Metode for å legge til en innlevering.
	 * 
	 * @param retur
	 */
	public void leggTilReturnertBil(Retur retur) {
		returnerteBiler.add(retur);
	}
	
}