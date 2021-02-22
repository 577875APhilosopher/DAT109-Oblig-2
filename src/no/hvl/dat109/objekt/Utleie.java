package no.hvl.dat109.objekt;

import java.time.LocalDate;

/**
 * Klasse for å definere utleie av bil.
 * 
 * @author Philippe, Matias, Sebastian
 *
 */

public class Utleie {

	private Kredittkort kredittkort;
	private String regnr;
	private LocalDate utleieDato;
	private LocalDate returDato;
	
	
	public Utleie(Kredittkort kredittkort, String regnr, LocalDate utleieDato, LocalDate returDato) {
		super();
		this.kredittkort = kredittkort;
		this.regnr = regnr;
		this.utleieDato = utleieDato;
		this.returDato = returDato;
	}
	
	public Kredittkort getKredittkort() {
		return kredittkort;
	}
}