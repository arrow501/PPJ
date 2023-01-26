package PPJ22.Task3;

public class CiagnikSiodlowy extends PojazdKolowy {
    private double masa;
    public CiagnikSiodlowy(String kolor, int iloscOsi, double masa){
        super(kolor, iloscOsi);
        this.masa = masa;
    }
    public void rozpocznijJazde(){
        if( this.masa / super.getIloscOsi() > 11){
            System.out.println("Jazda niebezbieczna, odmowa uruchomienia silnika.");
        }
    }
    
}
