package sk.elct;

import sk.upjs.jpaz2.ObjectInspector;

public class App {
    public static void main( String[] args ) {
        SmartRobot mark = new SmartRobot();
        System.out.println(mark.sing("tancuj vykrucaj", 'l'));

        System.out.println(mark.abbreviation("ut"));
        String res = mark.generateWord('A', 3);
        System.out.println(res);
        System.out.println(res.length());
        System.out.println(mark.reverseString("abcd"));

       /* System.out.println('z' > 'a');
        System.out.println('z' > 'Z');
        System.out.println('A' == 65);
        System.out.println('Z' > 65);
        System.out.println('A');
        int cislo = 'A';
        System.out.println(cislo);
        char znak = 65;
        System.out.println(znak);*/
        System.out.println(mark.numbersCount("sdasda4545asddsa56"));
        System.out.println(mark.hasSameCharactersMystery("aaaa"));

        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        mark.printBillions(10);

        for (int i = 0; i < 100; i++) {
            System.out.println(mark.randomDice());
        }

    }
}
