package Extras;


import java.util.Arrays;
import Toolbox.Toolbox;
import Toolbox.PPJutils;
public class quicksortTest {
    public static void main(String[] args) {
        int[] randomArray = PPJutils.getRandomIntArray(1, 10_000_000, 1_000_000);
        
        // create a copy of random Array
        int[] array = Arrays.copyOf(randomArray, randomArray.length);
        
        // record the start time
        long startTime = System.currentTimeMillis();

        // sort the array using quicksort
        PPJutils.quicksort(array);

        // record the end time
        long endTime = System.currentTimeMillis();

        // calculate the total time taken by quicksort
        long totalTime = endTime - startTime;

        // print the total time taken by quicksort
        System.out.println("Total time taken by quicksort: " + totalTime + " milliseconds");
        
        // create a copy of random Array
        array = Arrays.copyOf(randomArray, randomArray.length);
        
        // record the start time
        startTime = System.currentTimeMillis();
        
        Toolbox.sortArrAscending(array);
        
        // record the end time
        endTime = System.currentTimeMillis();
        // calculate the total time taken by quicksort
        totalTime = endTime - startTime;

        // print the total time taken by 
        System.out.println("Total time taken by insertion sort: " + totalTime + " milliseconds");
    }
}
