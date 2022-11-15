package PPJ11;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        long[] tab = new long[10];
        tab[0] = 1; // any number
        
        for (int i = 1; i < tab.length; i++) {
            tab[i] = tab[i-1] + 1;
        }
        System.out.println(Arrays.toString(tab));
        
        boolean concurent_values = true;
        while(concurent_values){
            int i1 = (int)(Math.random()*tab.length);
            int i2 = (int)(Math.random()*tab.length);
            
            long temp = tab[i1];
            tab[i1] = tab[i2];
            tab[i2] = temp;

            concurent_values = false;
            for (int i = 1; i < tab.length; i++) {
                if(tab[i-1] + 1 == tab[i]) concurent_values = true;
            }
        }
        System.out.println(Arrays.toString(tab));
    }
    
}
