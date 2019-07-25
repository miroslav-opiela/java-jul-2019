package sk.elct.parking;

public class ParkingLot {

    /**
     * Kapacita parkoviska. Pocet parkovacich miest spolu.
     */
    private int capacity;

    /**
     * Pristup k datam - zoznamu listkov.
     */
    private ListParkingLotDAO data;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        data = new ListParkingLotDAO();
    }

    /**
     * Prijazd vozidla
     *
     * @param ecv spz vozidla
     * @return referencia na objekt triedy ticket so zadanym casom.
     * alebo null ak sa nepodarilo zaparkovat napr. pre nedostatok miesta.
     */
    public Ticket checkIn(String ecv) {
        if (isFull()) {
            return null;
        }

        Ticket ticket = new Ticket(ecv);
        data.add(ticket);
        return ticket;
    }

    /**
     * Zisti ci je parkovisko naplnene.
     *
     * @return true ak nie je volne miesto.
     */
    private boolean isFull() {
        return data.numberOfTickets() >= capacity;
    }

    public int freeLots() {
        return capacity - data.numberOfTickets();
    }

    /**
     * Urobi odjazd vozidla
     *
     * @param ecv spz vozidla
     * @return cena v centoch
     */
    public int checkOut(String ecv) {
        return 0;
    }

    /**
     * Urobi odjazd vozidla
     *
     * @param ticket ticket
     * @return cena v centoch
     */
    public int checkOut(Ticket ticket) {
        return 0;
    }

    // vyriesit pripad ak tam taky ticket uz nie je

}
