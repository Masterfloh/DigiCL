package RandomCode.Polymorphismus;

public abstract class Ticket
{
    /**
     * Der Preis
     */
    private int preis;
    /**
     * Ungültig, wenn entwertet
     */
    private boolean entwertet;
    
    public Ticket(int preis) {
        this.preis = preis;
        entwertet = false;
    }
    
    public int gibPreis() {
        return preis;
    }
    
    public void entwerten() {
        entwertet = true;
    }
    
    public boolean istEntwertet() {
        return entwertet;
    }
    
    public abstract boolean gueltigInZone(int zone);
}
