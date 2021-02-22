package no.hvl.dat109.objekt;

/**
 * Klasse for å definere en bil.
 * 
 * @author Philippe, Matias, Sebastian
 *
 */

public class Bil {
	private String regnr;
	private String merke;
	private String modell;
	private String farge;
	private UtleieEnum utleiegruppe;
	private Boolean ledig;
	private String dagspris;
	
	public Bil(String regnr, String merke, String modell, String farge, UtleieEnum utleiegruppe, String dagspris) {
		this.regnr = regnr;
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.utleiegruppe = utleiegruppe;
		this.dagspris = dagspris;
		this.ledig = true;
	}

	public String getRegnr() {
		return regnr;
	}

	public void setRegnr(String regnr) {
		this.regnr = regnr;
	}

	public String getMerke() {
		return merke;
	}

	public void setMerke(String merke) {
		this.merke = merke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}

	public UtleieEnum getUtleiegruppe() {
		return utleiegruppe;
	}

	public void setUtleiegruppe(UtleieEnum utleiegruppe) {
		this.utleiegruppe = utleiegruppe;
	}

	public Boolean getLedig() {
		return ledig;
	}

	public void setLedig(Boolean ledig) {
		this.ledig = ledig;
	}
	
	public String getDagspris() {
		return dagspris;
	}

	public void setDagspris(String dagspris) {
		this.dagspris = dagspris;
	}


	@Override
	public String toString() {
		return "Registreringsnummer:" + regnr + ", Merke:" + merke + ", Modell:" + modell + ", Farge:" + farge
				+ ", Utleiegruppe:" + utleiegruppe + ", Dagspris:" + dagspris + ", Ledig:" + ledig;
	}
	
	
}
