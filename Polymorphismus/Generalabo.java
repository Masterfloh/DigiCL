package RandomCode.Polymorphismus;

public class Generalabo extends Ticket
{
    /**
     * Nur für diese Person gültig
     */
    private String inhaber;
    /**
     * String im Format JJJMMTT.
     * Nach diesem Datum ungültig
     */
    private String verfallsDatum;
    public Generalabo(int preis, String inhaber, String verfallsDatum) {
        super(preis);
        this.inhaber = inhaber;
        this.verfallsDatum = verfallsDatum;
    }
    
    public void entwerten() { /* es passiert nix! */ }
    
    public String gibVerfallsDatum() {
        return verfallsDatum;
    }
    
    public boolean gueltigInZone(int zone) {
        return true;
    }
    
    public String gibInhaber() {
        return inhaber;
    }
}
