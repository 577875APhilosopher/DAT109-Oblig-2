package no.hvl.dat109.objekt;

import java.time.LocalDate;

/**
 * 
 * @author Philippe, Matias, Sebastian
 *
 */

public class Retur {

	private Kredittkort kredittkort;
	private LocalDate returdato;
	private String regnr;
	
	public Retur(Kredittkort kredittkort, LocalDate returdato, String regnr) {
		super();
		this.kredittkort = kredittkort;
		this.returdato = returdato;
		this.regnr = regnr;
	}
	
}
