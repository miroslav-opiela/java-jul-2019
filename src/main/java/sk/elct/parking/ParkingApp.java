package sk.elct.parking;

public class ParkingApp {

    public static void main(String[] args) {
        /*ParkingLot park = new ParkingLot(100);

        park.checkIn("PO111AA");
        park.checkOut(listok);
        */
        Ticket listok = new Ticket("PO111AA");
        System.out.println(Math.ceil(2.3));
        System.out.println(Math.ceil(2.5));
        System.out.println(Math.ceil(2.8));


        ListParkingLotDAO dao = new ListParkingLotDAO();
        System.out.println(dao.numberOfTickets());
        dao.add(listok);
        System.out.println(dao.numberOfTickets());
        dao.delete(listok);
        System.out.println(dao.numberOfTickets());


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
