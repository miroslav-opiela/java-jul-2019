package sk.elct.parking;

import java.util.List;
import java.util.Scanner;

public class ParkingMenu {

    public static void main(String[] args) {
        System.out.println("Vitajte v parkovisku.");
        ParkingLot parkingLot = new ParkingLot(3);

        Scanner citac = new Scanner(System.in);
        int volba = -1;
        while (volba != 0) {
            System.out.println("---------");
            System.out.println("zvolte si moznost:");
            System.out.println("1: checkIn, 2: checkOut, 3: vypis vsetky listky, 4: pocet volnych miest, 0: koniec");
            volba = citac.nextInt();

            switch (volba) {
                case 1:
                    System.out.println("Zadaj ECV");
                    String ecv = citac.next();
                    Ticket ticket = parkingLot.checkIn(ecv);
                    if (ticket == null) {
                        System.out.println("Nepodarilo sa zaparkovat. (napr. je plno alebo taka ecv tam uz je)");
                    } else {
                        System.out.println("OK, zaregistroval som " + ticket);
                    }
                    break;
                case 2:
                    System.out.println("Zadaj ECV");
                    String leavingEcv = citac.next();
                    try {
                        int price = parkingLot.checkOut(leavingEcv);
                        System.out.println("Zaplat " + price / 100.0 + "€");
                    } catch (TicketNotFoundException e) {
                        System.err.println("Neexistuje taka ECV v parkovisku");
                    }
                    break;
                case 3:
                    List<Ticket> list = parkingLot.getAllTickets();
                    System.out.println(list);
                    list.clear();
                    break;
                case 4:
                    System.out.println("pocet volnych miest "
                            + parkingLot.freeLots());
                    break;
                default:
                    System.out.println("Taku moznost nemam.");
                    break;
            }
        }

        System.out.println("DOVIDENIA.");

    }
}
