package sk.elct;

public class SmartRobot {

    public String sing(String text, char letter) {
        String song = text + " " + text;
        song = song.replace('r', letter);
        return song;
    }

    public String abbreviation(String s) {
        // ak ma slovo malo pismen
        if (s.length() < 3) {
            return s.toUpperCase();
        }

        String abbreviation = s.substring(0, 3);
        return abbreviation.toUpperCase();
    }

    public String generateWord(char c, int count) {
        String s = "";
        for (int i = 0; i < count; i++) {
            s = s + c;
            //s += c;
        }
        return s;
    }

    public String reverseString(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        // alternativna verzia
        /*for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }*/
        return result;
    }

    public int numbersCount(String s) {
        // vyrobim si pocitadlo
        int counter = 0;
        // v cykle prejdem retazec
        for (int i = 0; i < s.length(); i++) {
            // ak je znak cislo, tak pripocitam 1
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                counter++;
            }
        }
        // vratim vysledok
        return counter;
    }

    public boolean hasSameCharacters(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(0)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasSameCharactersMystery(String s) {
        // vyrobit novy retazec dlzky s.length z pismen charAt(0)
        String newString = this.generateWord(s.charAt(0), s.length());

        // porovnat retazce
        // toto porovnava referencie
        // return s == newString;
        return s.equals(newString);
    }

    public void printBillions(int count) {
        // long namiesto int kvoli preteceniu
        long number = 0;
        for (int i = 0; i < count; i++) {
            System.out.println(number);
            number = number + 1000000000;
        }
    }

    public int randomDice() {
        return (int) (Math.random() * 6 + 1);
    }
}
