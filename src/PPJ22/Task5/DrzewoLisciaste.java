package PPJ22.Task5;

import PPJ22.Task4.Drzewo;

public class DrzewoLisciaste extends Drzewo {
    private int kszataltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int kszataltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.kszataltLiscia = kszataltLiscia;
    }

    public int getKszataltLiscia() {
        return this.kszataltLiscia;
    }

    @Override
    public String toString() {
        return super.toString() + "{" + " kszataltLiscia='" + getKszataltLiscia() + "'" + "}";
    }

}
