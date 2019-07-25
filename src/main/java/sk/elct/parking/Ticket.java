package sk.elct.parking;

/**
 * Reprezentuje jedno zaparkovanie.
 */
public class Ticket {

    /**
     * SPZ auta
     */
    private String ecv;

    /**
     * Cas prijazdu auta na parkovisko.
     */
    private long arrivalTime;

    public Ticket(String ecv) {
        this.ecv = ecv;
        this.arrivalTime = System.currentTimeMillis();
    }

    // tento konstruktor sa doplni automaticky
    // ak nemam napisany ziaden
    /*public Ticket() {

    }*/

    public String getEcv() {
        return ecv;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }


}
