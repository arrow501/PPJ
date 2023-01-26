package PPJ22.Task4;

public class Drzewo {
    boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    public boolean isWiecznieZielone() {
        return this.wiecznieZielone;
    }

    public boolean getWiecznieZielone() {
        return this.wiecznieZielone;
    }

    public int getWysokosc() {
        return this.wysokosc;
    }

    public String getPrzekrojDrzewa() {
        return this.przekrojDrzewa;
    }

    @Override
    public String toString() {
        return "{" +
            " wiecznieZielone='" + isWiecznieZielone() + "'" +
            ", wysokosc='" + getWysokosc() + "'" +
            ", przekrojDrzewa='" + getPrzekrojDrzewa() + "'" +
            "}";
    }
}
