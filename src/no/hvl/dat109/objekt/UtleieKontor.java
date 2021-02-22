package no.hvl.dat109.objekt;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Klasse for å definere ett utleiekontor.
 * 
 * @author Philippe, Matias, Sebastian
 *
 */

public class UtleieKontor {
	
	private static final AtomicInteger count = new AtomicInteger(0);
	private final int id;
	private String navn;
	private Adresse adresse;
	private UtleieSelskap utleieselskap;
	private List<Bil> biler;
	
	public UtleieKontor(String navn, Adresse adresse, UtleieSelskap utleieselskap) {
		super();
		this.id = count.incrementAndGet();
		this.navn = navn;
		this.adresse = adresse;
		this.utleieselskap = utleieselskap;
		this.biler = new ArrayList<Bil>();
	}
	
	/**
	 * Metode for å lage en reservasjon.
	 */
	public Reservasjon lagReservasjon(Bil bil, LocalDate startDato, LocalTime startTid, int antDager, UtleieKontor utleieKontor, UtleieKontor returKontor, Kunde kunde) {
		Reservasjon reservasjon = new Reservasjon(bil, startDato, startTid, antDager, utleieKontor, returKontor, kunde);
		return reservasjon;
	}
	
	/**
	 * Metode for å lagre en reservasjon
	 * 
	 * @param reservasjon
	 */
	public void lagreReservasjon(Reservasjon reservasjon) {
		utleieselskap.leggTilReservasjon(reservasjon);
	}
	
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getId() {
		return id;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public UtleieSelskap getUtleieSelskap() {
		return utleieselskap;
	}

	public void setUtleieSelskap(UtleieSelskap utleieselskap) {
		this.utleieselskap = utleieselskap;
	}

	public void leggTilBil(Bil bil) {
		biler.add(bil);
	}
	
	public List<Bil> getBiler() {
		return biler;
	}
	
	public void setBiler(List<Bil> biler) {
		this.biler = biler;
	}
	
}