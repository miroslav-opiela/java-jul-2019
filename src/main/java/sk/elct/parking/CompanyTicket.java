package sk.elct.parking;

public class CompanyTicket extends Ticket {

    private String company;

    public CompanyTicket(String ecv, String company) {
        super(ecv);
        this.company = company;
    }

    public CompanyTicket(String ecv, long arrivalTime,
                         String company) {
        super(ecv, arrivalTime);
        this.company = company;
    }

    @Override
    public String toString() {
        return super.toString() + "," + company;
    }

    @Override
    public int computePrice() {
        int hours = getElapsedTime();
        if (hours < 5) {
            return hours * ParkingLot.PRICE_PER_HOUR;
        } else {
            // fixna suma pre dlhodobe parkovanie
            // idealne mat tiez v konstante
            return 10;
        }

    }
}
