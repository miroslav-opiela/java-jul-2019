package sk.elct.parking;

import java.util.ArrayList;
import java.util.List;

/**
 * Trieda poskytuje pristup k datam.
 */
public class ListParkingLotDAO {

    /**
     * Zoznam listkov pre zaparkovane auta.
     */
    private List<Ticket> tickets;

    public ListParkingLotDAO() {
        tickets = new ArrayList<>();
    }

    public void add(Ticket ticket) {
        tickets.add(ticket);
    }

    public int numberOfTickets() {
        return tickets.size();
    }

    public void delete(Ticket ticket) {
        tickets.remove(ticket);
    }

    /*public Ticket getTicket(String ecv) {
        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticketFromList = tickets.get(i);
            if (ticketFromList.getEcv().equals(ecv)) {
                return ticketFromList;
            }
        }
        return null;
    }*/

    public Ticket getTicket(String ecv) {
        for (Ticket ticketFromList : tickets) {
            if (ticketFromList.getEcv().equals(ecv)) {
                return ticketFromList;
            }
        }
        return null;
    }
}
