package sk.elct.parking;

public class ParkingApp {

    public static void main(String[] args) {

        Ticket listok = new Ticket("PO111AA");

        System.out.println(listok.getEcv()
                + " " + listok.getArrivalTime());

        ParkingLot parkovisko = new ParkingLot(5);
        for (int i = 0; i < 8; i++) {
            Ticket blocek = parkovisko.checkIn("KE12" + i + "BC");
            if (blocek == null) {
                System.out.println("Je plno");
            } else {
                System.out.println(blocek.getEcv() + " " + blocek.getArrivalTime());
            }
        }

        /*int cena = parkovisko.checkOut("KE123BC");
        int cenaVCentoch = parkovisko.checkOut(blocek);*/


    }
}
