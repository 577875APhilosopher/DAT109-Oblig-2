package oblig2.objekt;

import java.util.ArrayList;
import java.util.List;


public class BilutleieSelskap {
	private String navn;
	private String tlfNr;
	private Adresse firmaAdr;
	
	public BilutleieSelskap(String navn, Adresse firmaAdr, String tlfNr) {
		this.navn = navn;
		this.firmaAdr = firmaAdr;
		this.tlfNr = tlfNr;
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

}