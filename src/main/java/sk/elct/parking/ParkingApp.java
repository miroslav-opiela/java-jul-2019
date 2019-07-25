package sk.elct.parking;

public class ParkingApp {

    public static void main(String[] args) {
        Ticket listok = new Ticket("PO111AA");

        System.out.println(listok.getEcv()
                + " " + listok.getArrivalTime());



    }
}
