package no.hvl.dat109.kontroller;

import java.util.Scanner;

import no.hvl.dat109.objekt.Adresse;
import no.hvl.dat109.objekt.Bilpark;
import no.hvl.dat109.objekt.UtleieKontor;
import no.hvl.dat109.objekt.UtleieSelskap;


public class Klient {
	
	private static UtleieSelskap bilforgamers = new UtleieSelskap("BilForGamers", new Adresse("", 0000 , "BergenSentrum"), "92822779");
	private static UtleieKontor loddefjord = new UtleieKontor("Loddefjord", new Adresse("", 0000 , "Loddefjord"), bilforgamers);
	private static UtleieKontor kokstad = new UtleieKontor("Kokstad", new Adresse("Tulleveien 1", 0000, "Kokstad"), bilforgamers);
	private static UtleieKontor bergensentrum = new UtleieKontor("BergenSentrum", new Adresse("Tulleveien 1", 0000, "BergenSentrum"), bilforgamers);


	public static void main(String[] args) {

		loddefjord.setBiler(Bilpark.leggTilBiler1());
		kokstad.setBiler(Bilpark.leggTilBiler2());
		bergensentrum.setBiler(Bilpark.leggTilBiler3());
		
		bilforgamers.leggTilKontor(loddefjord);
		bilforgamers.leggTilKontor(kokstad);
		bilforgamers.leggTilKontor(bergensentrum);
		
	
		Meny();

	}
	
	public static void Meny() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Hei og velkommen til BilForGamers");
		System.out.println("Meny:");
		System.out.println("1. Reservasjon");
		System.out.println("2. Utlevering av bil");
		System.out.println("3. Innlevering av bil");
		System.out.println("4. Avslutt");
		System.out.println("\nSkriv inn tallet for ønsket valg:\n");

		int brukersvalg = sc.nextInt();
		
		switch (brukersvalg) {
			case 1: 
				ReserverBil.reserverBil(bilforgamers);
				break;
			case 2:
				UtleieBil.leiUtBil(bilforgamers);
				break;
			case 3:
				InnleveringBil.leverInnBil(bilforgamers);
				break;
			case 4:
				System.out.println("\nProgrammet er avsluttet.");
			default:
				System.out.println("Noe gikk galt.");
		}
		
	}

}