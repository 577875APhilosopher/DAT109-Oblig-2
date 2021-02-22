package no.hvl.dat109.kontroller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import no.hvl.dat109.objekt.Bil;
import no.hvl.dat109.objekt.UtleieKontor;
import no.hvl.dat109.objekt.Kredittkort;
import no.hvl.dat109.objekt.Reservasjon;
import no.hvl.dat109.objekt.Retur;
import no.hvl.dat109.objekt.UtleieSelskap;

/**
 * Klasse for definering av innlevering av en bil
 * 
 * @author Philippe, Matias, Sebastian
 *
 */
public class InnleveringBil {
	
	/**
	 * Metode for å levere inn en bil.
	 * 
	 * @param bil
	 */
	public static void leverInnBil(UtleieSelskap selskap) {
		//Dato for innlevering
		LocalDate currDate = LocalDate.now();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Skriv inn telefonnummert ditt: ");
		int telefonnummer = sc.nextInt();
		
		List<Reservasjon> alleReservasjoner = selskap.getReservasjoner();
		
		Reservasjon reservasjoner = alleReservasjoner.stream()
				.filter(p -> telefonnummer == p.getKunde().getTelefonNummer())
				.findAny()
				.orElse(null);
		
		if(reservasjoner == null) {
			System.out.println("Finnes ikke en reservasjon med dette telefonnummeret");
			sc.close();
			return;
		}
		
		//Setter bil som ledig.
		Bil bil = reservasjoner.getBil();
		bil.setLedig(true);
		
		//Henter returkontor og legger til bil i billiste
		UtleieKontor returKontor = reservasjoner.getRetursted();
		returKontor.leggTilBil(bil);
		
		System.out.println("Regningen er nå sendt.");
		Kredittkort kort = reservasjoner.getKunde().getKredittKort();
		
		//Fjerner kundens bil
		alleReservasjoner.remove(reservasjoner);
		
		Retur retur = new Retur(kort, currDate, bil.getRegnr());
		List<Retur> returListe = selskap.getReturnerteBiler();
		returListe.add(retur);
		
		Klient.Meny();
		
		System.out.println("Bilen har blitt innlevert! ");
		System.out.println();
		Klient.Meny();
		
	}
}