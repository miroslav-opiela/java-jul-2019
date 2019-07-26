package sk.elct.parking;

import sk.elct.SmartRobot;

import java.util.Arrays;

public class ParkingApp {

    public static int spracujString(String s) {
        int cislo = -1;
        try {
            cislo = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("problem");
        }
        finally {

        }
        return cislo;
    }

    public static void main(String[] args) {
        System.out.println(spracujString("132"));
        System.out.println(spracujString("132a"));

        System.out.println(new ParkingLot(4).toString());
        System.out.println("abcd".toString());
        System.out.println(new CompanyTicket("BL111AA", "ELCT").getElapsedTime());


        String s = new String();
        SmartRobot mark = new SmartRobot();
        ParkingLot p = new ParkingLot(3);
        Ticket t = new Ticket("aa");

        Object q = new String();
        Object r = new SmartRobot();

        Object i = new CompanyTicket("ab", "elct");
        FileBasedStorage e = new ListParkingLotDAO();
        Comparable<Ticket> x = new Ticket("abv");

        //Object[] pole = {"abc", mark, l, x};
        //System.out.println(Arrays.toString(pole));

        Object l = new CompanyTicket("ab", "ac");
        if (l instanceof CompanyTicket) {
            CompanyTicket ll =(CompanyTicket) l;
        }
    }
}
