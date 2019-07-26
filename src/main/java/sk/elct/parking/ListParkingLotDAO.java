package sk.elct.parking;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

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
        load();
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
        File file = new File(FILENAME);
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Ticket ticket = parseTicket(line);
                tickets.add(ticket);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param s vo formate ecv,cas
     */
    private Ticket parseTicket(String s) {
        // da sa urobit s.split(",")
        Scanner sc = new Scanner(s);
        sc.useDelimiter(",");
        String ecv = sc.next();
        long time = sc.nextLong();
        return new Ticket(ecv, time);
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

    public List<Ticket> getAllTickets() {
        // nechcem dat referenciu na zoznam, ale vyrobit kopiu
        return new ArrayList<>(tickets);
    }
}
