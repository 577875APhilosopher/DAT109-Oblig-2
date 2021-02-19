public class Bil {
	private String regNr;
	private String merke;
	private String modell;
	private String farge;
	private Utleiegruppe utleiegruppe;
	private boolean ledig;
	
	
	public Bil(String regNr, String merke, String modell, String farge, Utleiegruppe utleiegruppe, boolean ledig) {
		this.regNr=regNr;
		this.merke=merke;
		this.modell=modell;
		this.farge=farge;
		this.utleiegruppe = utleiegruppe;
		this.ledig=ledig;
	}
}
