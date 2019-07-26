package sk.elct.parking;

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

    }
}
