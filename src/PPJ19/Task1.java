package PPJ19;

public class Task1 {
    public static void main(String[] args) {
        Word kaczka = new Word();
        for(char letter: "Kaczka".toCharArray()){
            kaczka.addChar(letter);
        }
        System.out.println("The word ");
        kaczka.show();
        System.out.print("has " + kaczka.length() + " letters");
    }
}
