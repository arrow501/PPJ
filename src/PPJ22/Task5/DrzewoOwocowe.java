package PPJ22.Task5;

public class DrzewoOwocowe extends DrzewoLisciaste {
    String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int kszataltLiscia,
            String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, kszataltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }
    public String getNazwaOwoca(){
        return nazwaOwoca;
    }
    @Override
    public String toString() {
        return super.toString() + "{" +
            " nazwaOwoca='" + getNazwaOwoca() + "'" +
            "}";
    }
}
