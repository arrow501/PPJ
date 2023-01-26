package PPJ22.Task3;

public class PojazdKolowy extends Pojazd {
    private int iloscOsi;

    PojazdKolowy(String kolor, int iloscOsi){
        super(kolor);
        this.iloscOsi = iloscOsi;
    }
    public int getIloscOsi(){
        return this.iloscOsi;
    }
}
