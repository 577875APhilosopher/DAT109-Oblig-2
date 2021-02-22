package no.hvl.dat109.kontroller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import no.hvl.dat109.objekt.Bil;
import no.hvl.dat109.objekt.Kredittkort;
import no.hvl.dat109.objekt.Kunde;
import no.hvl.dat109.objekt.Reservasjon;
import no.hvl.dat109.objekt.UtleieSelskap;
import no.hvl.dat109.objekt.Utleie;


/**
 * Klasse for definering av utleie for en bil
 * 
 * @author Philippe, Matias, Sebastian
 *
 */
public class UtleieBil {
	
	/**
	 * Metode for å leie ut en bil.
	 * 
	 * @param bil
	 */
	public static void leiUtBil(UtleieSelskap selskap) {
		Scanner sc = new Scanner(System.in);
		
		LocalDate currDate = LocalDate.now();
		
		System.out.println("Skriv inn telefonnummert ditt: ");
		int telefonnummer = sc.nextInt();
		
		List<Reservasjon> alleReservasjoner = selskap.getReservasjoner();
		
		Reservasjon reservasjon = alleReservasjoner.stream()
				.filter(p -> telefonnummer == p.getKunde().getTelefonNummer())
				.findAny()
				.orElse(null);
		
		if(reservasjon == null) {
			System.out.println("Finnes ikke en reservasjon med dette telefonnummeret");
			sc.close();
			return;
		}
		
		Kunde kunde = reservasjon.getKunde();
		System.out.println("Skriv inn kredittkortnummer ditt: ");
		long kortNummer = sc.nextLong();
		
		Kredittkort kort = new Kredittkort(kortNummer);
		Boolean gyldigKort = kort.validerKort();
		
		while (!gyldigKort) {
			System.out.println("Kortnummer ikke gyldig, må ha en lengde på 16 siffer. Prøv igjen: ");
			long nyttKortNummer = sc.nextLong();
			
			kort.setKortNummer(nyttKortNummer);
			gyldigKort = kort.validerKort();
		}
		
		kunde.setKredittKort(kort);
		String regNr = reservasjon.getBil().getRegnr();
		
		Utleie utlevering = new Utleie(kunde.getKredittKort(), regNr, currDate, reservasjon.getStartDato().plusDays(reservasjon.getAntallDager()));
		selskap.leggTilUtlevertBil(utlevering);
		System.out.println();
		System.out.println("Her er leiebilen din! :)");
		Klient.Meny();
		
		Klient.Meny();
	}
}