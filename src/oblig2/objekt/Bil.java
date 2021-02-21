package oblig2.objekt;

/**
 * Klasse for å definere en bil.
 * 
 * @author Matias, Philippe, Sebastian
 *
 */

public class Bil {
	private String regNr;
	private String merke;
	private String modell;
	private String farge;
	private UtleieEnum utleie;
	private boolean ledig;
	
	
	public Bil(String regNr, String merke, String modell, String farge, UtleieEnum utleie, boolean ledig) {
		this.regNr = regNr;
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.utleie = utleie;
		this.ledig = ledig;
	}
	
	public String getRegnr() {
		return regNr;
	}
	
	public void setRegnr(String regNr) {
		this.regNr = regNr;
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
	
	public UtleieEnum getUtleie() {
		 return utleie;
	}
	
	public void setUtleie(UtleieEnum utleie) {
		this.utleie = utleie;
	}

	public Boolean getLedig() {
		return ledig;
	}

	public void setLedig(Boolean ledig) {
		this.ledig = ledig;
	}
	
	@Override
	public String toString() {
		return "Bil [regnr =" + regNr + ", merke =" + merke + ", modell =" + modell + ", farge =" + farge
				+ ", utleiegruppe =" + utleie + ", ledig =" + ledig + "]";
	}
	
}
