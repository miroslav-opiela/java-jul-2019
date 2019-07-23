package sk.elct;

public class SmartRobot {

    public String sing(String text, char letter) {
        String song = text + " " + text;
        song = song.replace('r', letter);
        return song;
    }
}
