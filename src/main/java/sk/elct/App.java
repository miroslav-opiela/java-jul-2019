package sk.elct;

import sk.upjs.jpaz2.ObjectInspector;

public class App {
    public static void main( String[] args ) {
        String slovo = "utorok";
        System.out.println(slovo);
        System.out.println( "AHOJ Hello World!" );

        //ObjectInspector oi = new ObjectInspector();
        //oi.inspect(slovo);

        String ineSlovo = slovo.replace('o', 'P');
        System.out.println(ineSlovo);

        SmartRobot mark = new SmartRobot();
        System.out.println(mark.sing("tancuj vykrucaj", 'l'));

        //oi.inspect(mark);
    }
}
