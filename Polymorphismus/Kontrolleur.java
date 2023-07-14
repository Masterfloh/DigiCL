package RandomCode.Polymorphismus;
public class Kontrolleur {
    public static void main(String args[]) {
        Kontrolleur kontrolleur = new Kontrolleur();

        int personenOhneGueltigenFahrschein = kontrolleur.kontrolliere(
                new String[]{"Hans", "Susanne", "Max"},
                new Ticket[]{
                        new Einzelticket(3, "20210930", 2),
                        new Mehrfahrtenkarte(9, 3, 3),
                        new Generalabo(35, "Max", "20210924")
                }, 3, "20210925"
        );

        System.out.println(
                "Es gab insgesamt " +
                        personenOhneGueltigenFahrschein +
                        " Personen ohne gültigen Fahrschein."
        );
    }

    public int kontrolliere(String[] namen, Ticket[] tickets, int zone, String datum) {
        int personenOhneGueltigenFahrschein = 0;

        if (namen.length != tickets.length) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < namen.length; i++) {
            Ticket ticket = tickets[i];

            // Ticket entwerten
            ticket.entwerten();

            // Überprüfen, ob das Ticket gültig ist
            if (!ticket.gueltigInZone(zone)) {
                personenOhneGueltigenFahrschein++;
            } else if (ticket instanceof Einzelticket) {
                Einzelticket einzelticket = (Einzelticket) ticket;
                if (einzelticket.gibVerfallsDatum().compareTo(datum) < 0) {
                    personenOhneGueltigenFahrschein++;
                }
            } else if (ticket instanceof Generalabo) {
                Generalabo generalabo = (Generalabo) ticket;
                if (generalabo.gibVerfallsDatum().compareTo(datum) < 0) {
                    personenOhneGueltigenFahrschein++;
                }
            }
        }

        return personenOhneGueltigenFahrschein;
    }
}
