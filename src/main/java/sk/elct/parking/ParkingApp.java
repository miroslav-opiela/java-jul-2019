package sk.elct.parking;

import sk.elct.SmartRobot;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ParkingApp {

    public static void main(String[] args) {
        Set<Integer> mnozina = new HashSet<Integer>();
        mnozina.add(1005166);
        mnozina.add(2150);
        mnozina.add(3156168);
        mnozina.add(1);
        System.out.println(mnozina);
        System.out.println(mnozina.contains(2150));

        Set<Ticket> listky = new HashSet<>();
        listky.add(new Ticket("KE", 0));
        listky.add(new Ticket("PO", 0));
        listky.add(new Ticket("PO", 0));
        System.out.println(listky);

        CompanyTicket t1 = new CompanyTicket("KE", 0, "ELCT");
        CompanyTicket t2 = new CompanyTicket("PO", 0, "ELCT");

        System.out.println(t1.equals(t2));

    }
}
