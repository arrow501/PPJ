package PPJ6.Task5;

public class Task5 {
    public static void main(String[] args) {
        boolean czyPada = true;
        boolean czySwieciSlonce = false;

        if(czyPada && czySwieciSlonce) {
            System.out.println("Tęcza");
        } else if (czyPada) {
            System.out.println("Plucha");
        } else if (czySwieciSlonce) {
            System.out.println("Słonecznie");
        } else {
            System.out.println("Pochmurno");
        }
    }
}
