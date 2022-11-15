package PPJ11;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        boolean[] tab = new boolean[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (Math.random() > 0.5)?true:false;
        }
        
        int truth_counter = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i]) truth_counter++;
        }
        boolean[] truths = new boolean[truth_counter];
        boolean[] lies = new boolean[tab.length - truth_counter];
        for (int i = 0; i < lies.length; i++) {
            lies[i] = false;
        }
        for (int i = 0; i < truths.length; i++) {
            truths[i] = true;
        }
        System.out.println("tab:\t" + Arrays.toString(tab));
        System.out.println("truths:\t" + Arrays.toString(truths));
        System.out.println("lies:\t" + Arrays.toString(lies));
    }
}
