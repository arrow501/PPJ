package PPJ23.Task7;

import PPJ22.Task4.*;
import PPJ22.Task5.*;

public class Main {
    public static void main(String[] args) {
        Drzewo[] las = new Drzewo[6];

        // sosna
        las[0] = new DrzewoIglaste(true, 21, null, 2, 5);
    
        // modrzew
        las[1] =  new DrzewoIglaste(false, 11, null , 30, 2);

        // dąb
        las[2] = new DrzewoLisciaste(false, 18, null, 9);

        // osika
        las[3] = new DrzewoLisciaste(false, 40, null, 6);

        // morela
        las[4] = new DrzewoOwocowe(false, 8, null, 4, "Morela");

        //Śliwa
        las[5] = new DrzewoOwocowe(false, 5, null, 3, "Morela");


        for (Drzewo drzewo : las) {
            System.out.println(drzewo);
        }
    }
}
