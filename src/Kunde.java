public class Kunde {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnummer;

    private String skoStr;
    private String rulleblad;
    private String haarfarge;
    private Boolean haarfagre;
    private Integer antallVenner;
    private String sosialStatus;
    private ArrayList<PrivateSamtale> samtaler;
    private String ansattHosFirma;
    private String internRangeringAvAtraktivitet;
    private String IQ;
    private String betalingsevne;

    public Kunde(String fornavn, String etternavn, String adresse, String telefonnummer) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
    }
}
