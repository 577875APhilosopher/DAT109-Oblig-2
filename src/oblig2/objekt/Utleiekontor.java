package oblig2.objekt;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Utleiekontor {
	private final int kontorNr;
	private String navn;
	private Adresse adresse;
	
	public Utleiekontor(String navn, Adresse adresse) {
		super();
		this.kontorNr = count.incrementAndGet();
		this.navn = navn;
		this.adresse = adresse;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getKontorNr() {
		return kontorNr;
	}

	public Adresse getAdresse() {
		return adresse;
	}
}
