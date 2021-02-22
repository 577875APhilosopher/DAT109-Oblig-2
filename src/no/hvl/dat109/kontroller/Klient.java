package no.hvl.dat109.kontroller;

import java.util.Scanner;

import no.hvl.dat109.objekt.Adresse;
import no.hvl.dat109.objekt.Bilpark;
import no.hvl.dat109.objekt.UtleieKontor;
import no.hvl.dat109.objekt.UtleieSelskap;


public class Klient {
	
	private static UtleieSelskap bilforgamers = new UtleieSelskap("BilForGamers", new Adresse("Fredriksbergsgaten 2", 5005 , "Bergensentrum"), "55133132");
	private static UtleieKontor loddefjord = new UtleieKontor("Loddefjord", new Adresse("Vadnyrveien 10", 5172 , "Loddefjord"), bilforgamers);
	private static UtleieKontor kokstad = new UtleieKontor("Kokstad", new Adresse("Kokstadvegen 20", 5257, "Kokstad"), bilforgamers);
	private static UtleieKontor bergensentrum = new UtleieKontor("Bergensentrum", new Adresse("Fredriksbergsgaten 2", 5005, "Bergensentrum"), bilforgamers);


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
		System.out.println("Hva ønsker du?");
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