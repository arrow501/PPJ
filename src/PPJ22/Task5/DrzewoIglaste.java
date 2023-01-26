package PPJ22.Task5;

import PPJ22.Task4.Drzewo;

public class DrzewoIglaste extends Drzewo {
    private int iloscIgiel;
    double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel,
            double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    public int getIloscIgiel() {
        return this.iloscIgiel;
    }

    public double getDlugoscSzyszki() {
        return this.dlugoscSzyszki;
    }

    @Override
    public String toString() {
        return super.toString() + "{" + " iloscIgiel='" + getIloscIgiel() + "'" + ", dlugoscSzyszki='"
                + getDlugoscSzyszki() + "'" + "}";
    }

}
