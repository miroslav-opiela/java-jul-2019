package sk.elct.parking;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Trieda poskytuje pristup k datam.
 */
public class ListParkingLotDAO {

    private static final String FILENAME = "parkovisko.txt";

    /**
     * Zoznam listkov pre zaparkovane auta.
     */
    private List<Ticket> tickets;

    public ListParkingLotDAO() {
        tickets = new ArrayList<>();
    }

    public void add(Ticket ticket) {
        tickets.add(ticket);
        save();
    }

    public int numberOfTickets() {
        return tickets.size();
    }

    public void delete(Ticket ticket) {
        tickets.remove(ticket);
        save();
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

    private void load() {

    }

    private void save() {
        File file = new File(FILENAME);
        // try-catch with resources
        try (PrintWriter pw = new PrintWriter(file)) {
            for (Ticket ticketFromList : tickets) {
                pw.println(ticketFromList.toString());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

    }
}
