import java.util.ArrayList;

public class BilutleieKontor {
    private Integer kontorNummer;
    private String adresse;
    private Integer telefonnummer;

    private ArrayList<Bil> biler;

    public BilutleieKontor(Integer kontorNummer, String adresse, Integer telefonnummer) {
        this.kontorNummer = kontorNummer;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
        this.biler = new ArrayList<Bil>();
    }

    public Integer getKontorNummer() { return kontorNummer; }
    public void setKontorNummer(Integer kontorNummer) { this.kontorNummer = kontorNummer; } // Unødvendig?

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; } // Unødvendig?

    public Integer getTelefonnummer() { return telefonnummer; }
    public void setTelefonnummer(Integer telefonnummer) { this.telefonnummer = telefonnummer; } // Unødvendig?

    public boolean leieUtBil(params) {
        // TODO: Lag Metode
        throw new java.lang.UnsupportedOperationException("Metoden er ikke opprettet enda");
    }

    public boolean TaImotBil(params) {
        // TODO: Lag Metode
        throw new java.lang.UnsupportedOperationException("Metoden er ikke opprettet enda");
    }
}
