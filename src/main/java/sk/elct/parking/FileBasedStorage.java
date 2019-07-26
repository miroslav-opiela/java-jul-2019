package sk.elct.parking;

/**
 * Interface oznacuje metody ake ma mat trieda,
 * ktora svoje data uklada do suboru.
 *
 */
public interface FileBasedStorage {

    void save();

    void load();

}
