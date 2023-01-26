package PPJ23.Task9;
import java.util.Random;
public class Rakieta {
    private String nazwa;
    private int wagaPaliwa;


    public Rakieta(String nazwa, int wagaPaliwa) {
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }
    public void zatankuj(){
        Random random = new Random();
        wagaPaliwa += random.nextInt(1000);
    }
    public void start() throws Exception {
        if(wagaPaliwa < 1000) throw new Exception("start anulowany - za mało paliwa");
    }
}
