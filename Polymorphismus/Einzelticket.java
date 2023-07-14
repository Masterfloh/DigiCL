package RandomCode.Polymorphismus;

public class Einzelticket extends Ticket
{
    /**
     * Nur in dieser Zone gültig
     */
    private int zone;
    /**
     * String im Format JJJJMMTT.
     * Nach diesem Datum ungültig
     */
    private String verfallsDatum;
    
    public Einzelticket(int preis, String verfallsDatum, int zone) {
        super(preis);
        this.verfallsDatum = verfallsDatum;
        this.zone = zone;
    }
    
    public String gibVerfallsDatum() {
        return verfallsDatum;
    }
    
    public boolean gueltigInZone(int zone) {
        return zone == this.zone;
    }
}
