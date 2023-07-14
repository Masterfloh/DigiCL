package RandomCode.Polymorphismus;

public class Mehrfahrtenkarte extends Ticket
{
    /**
     * Anzahl erlaubte Fahrten
     */
    private int fahrten;
    /**
     * Nur in dieser Zone gültig
     */
    private int zone;
    public Mehrfahrtenkarte(int preis, int fahrten, int zone) {
        super(preis);
        this.fahrten = fahrten;
        this.zone = zone;
    }
    
    public void entwerten() {
        if (fahrten == 0) return;
        fahrten -= 1;
    }
    
    public boolean istEntwertet() {
        return fahrten == 0;
    }
    
    public boolean gueltigInZone(int zone) {
        return zone == this.zone;
    }
}
