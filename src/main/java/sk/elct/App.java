package sk.elct;

import sk.upjs.jpaz2.ObjectInspector;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        SmartRobot mark = new SmartRobot();
        System.out.println(mark.isPalindromeWithSpaces("Jelenovi pivo nelej"));

        int a = 5 / 2;
        System.out.println(a);
        double c = (double)a / a;

        double b = 5.0 / 2;
        System.out.println(b);

        for (int i = 0; i < 100; i++) {
            System.out.println(mark.randomName());
        }

        Datum dnes = new Datum();
        dnes.day = 25;
        dnes.month = 7;
        dnes.year = 2019;

        Datum neskor = mark.tenYearsLater(dnes);
        System.out.println(dnes.day + "."
                + dnes.month + "." + dnes.year + " " + dnes);
        System.out.println(neskor.day + "."
                + neskor.month + "." + neskor.year + " " + neskor);
        System.out.println(dnes.year);
        System.out.println(Datum.CALENDAR);

        System.out.println(Math.PI);
        SmartRobot.isPalindrome("abcba");

        int[] pole = new int[4];
        pole[0] = 4;
        pole[1] = 2;
        pole[2] = 7;
        pole[3] = 3;
        System.out.println(pole[2]);
        System.out.println(Arrays.toString(pole));
        Arrays.sort(pole);
        System.out.println(Arrays.toString(pole));
        for (int i = 0; i < pole.length; i++) {
            System.out.println(pole[i]);
        }
        int[] cisla = {1, 2, 3};
        System.out.println(Arrays.toString(mark.addToArray(cisla, 9)));

    }
}
