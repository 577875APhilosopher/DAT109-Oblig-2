package no.hvl.dat109.kontroller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import no.hvl.dat109.objekt.Adresse;
import no.hvl.dat109.objekt.Bil;
import no.hvl.dat109.objekt.UtleieKontor;
import no.hvl.dat109.objekt.Kunde;
import no.hvl.dat109.objekt.Reservasjon;
import no.hvl.dat109.objekt.UtleieSelskap;

/**
 * Reservering av bil
 * 
 * @author Philippe, Matias, Sebastian
 *
 */
public class ReserverBil {
	
	public static void reserverBil(UtleieSelskap selskap) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter datoFormat = DateTimeFormatter.BASIC_ISO_DATE;
		
		System.out.println("Skriv inn utleiekontoret: ");
		String utleiekontor = sc.nextLine();
		
		System.out.println("Skriv inn ønsket returkontor: ");
		String returkontor = sc.nextLine();
		
		System.out.println("Skriv inn dato du ønsker å leie fra: (dd/MM/yyyy)");
		String stringdato = sc.nextLine();
		
		datoFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dato = LocalDate.parse(stringdato, datoFormat);
		
		System.out.println("Skriv inn ønsket klokkeslett for utleie: (HH:mm)");
		String klokke = sc.nextLine();
		datoFormat = DateTimeFormatter.ofPattern("hh:mm");
		LocalTime tidspunkt = LocalTime.parse(klokke);
		
		
		System.out.println("Skriv inn hvor mange dager du vil leie bilen: ");
		int dager = sc.nextInt();
		
		
		List<UtleieKontor> alleKontorer = selskap.getKontorer();
		System.out.println(alleKontorer);
		
		UtleieKontor utleieplass = alleKontorer.stream()
				.filter(p -> utleiekontor.equals(p.getNavn()))
				.findAny()
				.orElse(null);
		
		UtleieKontor returplass = alleKontorer.stream()
				.filter(p -> returkontor.equals(p.getNavn()))
				.findAny()
				.orElse(null);
		
		System.out.println(utleieplass.getNavn());
		List<Bil> alleBiler = utleieplass.getBiler();
		
		List<Bil> tilgjengeligBiler =  alleBiler.stream()
				.filter(p -> p.getLedig() == true)
				.collect(Collectors.toList());
		
		System.out.println("Tilgjengelige biler: ");
		tilgjengeligBiler.stream().forEach(System.out :: println);
		
		System.out.println("Skriv inn registeringsnummer for ønsket bil: ");
		sc.nextLine();
		String regnr = sc.nextLine();
		
		
		Bil bil = tilgjengeligBiler.stream()
				.filter(p -> regnr.equals(p.getRegnr()))
				.findAny()
				.orElse(null);
		
		if(bil == null) {
			System.out.println("Finnes ikke en bil med dette registreringsnummeret");
			sc.close();
			return;
		}
		
		System.out.println("Skriv inn fornavn: ");
		String fornavn = sc.nextLine();
		
		System.out.println("Skriv inn etternavn: ");
		String etternavn = sc.nextLine();
		
		System.out.println("Skriv inn tlf: ");
		int tlf = sc.nextInt();
		
		System.out.println("Skriv inn gateadresse: ");
		sc.nextLine();
		String gateadresse = sc.nextLine();
		
		System.out.println("Skriv inn postnummer: ");
		int postnummer = sc.nextInt();
		
		System.out.println("Skriv inn poststed: ");
		sc.nextLine();
		String poststed = sc.nextLine();
		
		
		
		System.out.println("Reservasjon fullført!");
		System.out.println();
		
		
		Kunde k1 = new Kunde(fornavn, etternavn, new Adresse(gateadresse, postnummer, poststed), tlf);
		Reservasjon reservasjon = new Reservasjon(bil, dato, tidspunkt, dager, utleieplass, returplass, k1);
		selskap.leggTilReservasjon(reservasjon);
	
		Klient.Meny();
		
	}

}