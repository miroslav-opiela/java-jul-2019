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

    // vstupny string nema medzery, vsetko male pismena
    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // vstupny retazec ma medzery, male aj velke pismena
    public boolean isPalindromeWithSpaces(String s) {
        // Jelenovi pivo nelej
        s = s.toUpperCase();
        // JELENOVI PIVO NELEJ
        s = s.replaceAll(" ", "");
        // JELENOVIPIVONELEJ

        String newString = this.reverseString(s);
        return s.equals(newString);
    }

    // minimum a maximum vratane
    public int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);

    }

    public char randomChar(String s) {
        // 1. vygenerovat nahodne cislo od 0 po dlzku slova
        int index = this.randomNumber(0, s.length() - 1);
        // 2. vratit znak na vygenerovanom indexe
        return s.charAt(index);
    }

    public String randomName() {
        String result = "";
        String samohlasky = "aeiouy";
        String spoluhlasky = "bcdfghjklmnprstvz";
        // 1. vygenerovat nahodne cislo od 4 do 7
        int wordLength = this.randomNumber(4, 7);
        // 2. v cykle po vygenerovane cislo:
        for (int i = 0; i < wordLength; i++) {
            // 3.1 ak je to parny index
            // vybrat pismeno zo spoluhlasok
            if (i % 2 == 0) {
                result = result + this.randomChar(spoluhlasky);
            } else {
                // 3.2 ak je to neparny index
                // vybrat pismeno zo samohlasok
                result = result + this.randomChar(samohlasky);
            }
        }
        // 4. vratit vytvoreny string
        return result;
    }

    public Datum tenYearsLater(Datum datum) {
        Datum newDatum = new Datum();
        newDatum.day = datum.day;
        newDatum.month = datum.month;
        newDatum.year = datum.year + 10;
        return newDatum;
    }

    public int[] addToArray(int[] numbers, int value) {
        // 1. vyrobit nove pole o 1 vacsie
        int[] newArray = new int[numbers.length + 1];
        // 2. skopirovat hodnoty z povodneho pola
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }
        //System.arraycopy(numbers, 0, newArray,
        //        0, numbers.length);

        // 3. pridat value na koniec
        newArray[newArray.length - 1] = value;
        // 4. vratit nove pole
        return newArray;
    }
}
