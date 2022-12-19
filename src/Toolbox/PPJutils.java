package Toolbox;

import java.util.Arrays;
import java.util.Random;

public class PPJutils {
    public static void print2DArray(int[][] array) {
        // loop through each row of the array
        for (int[] row : array) {
            // print the values in the row using Arrays.toString()
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[] getRandomIntArray(int minValue, int maxValue, int length) {
        // create a new random number generator
        Random random = new Random();
        
        // create the array to return
        int[] array = new int[length];
        
        // generate the random numbers and store them in the array
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }
        
        return array;
    }
    public static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }
    
    private static void quicksort(int[] array, int low, int high) {
        // if the array has 6 or fewer elements, use insertion sort
        if (high - low <= 5) {
            insertionSort(array, low, high);
            return;
        }
        
        // choose a random pivot element
        Random random = new Random();
        int pivotIndex = low + random.nextInt(high - low + 1);
        int pivot = array[pivotIndex];
        
        // move the pivot element to the end of the array
        swap(array, pivotIndex, high);
        
        // partition the array into two subarrays
        int i = low - 1;
        int j = high;
        while (true) {
            // move the left pointer to the right until we find a value greater than the pivot
            do {
                i++;
            } while (array[i] < pivot);
            
            // move the right pointer to the left until we find a value less than or equal to the pivot
            do {
                j--;
            } while (array[j] > pivot);
            
            // if the left pointer is greater than or equal to the right pointer, then we are done partitioning
            if (i >= j) {
                break;
            }
            
            // otherwise, swap the values at the left and right pointers and continue
            swap(array, i, j);
        }
        
        // move the pivot element back to the middle of the array
        swap(array, i, high);
        
        // sort the left subarray
        quicksort(array, low, j);
        
        // sort the right subarray
        quicksort(array, j + 1, high);
    }
    
    private static void insertionSort(int[] array, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int value = array[i];
            int j = i - 1;
            while (j >= low && array[j] > value) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = value;
        }
    }
    
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static boolean isArmstrongNumber(int number) {
        int[] digits = splitToDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += pow(digit, digits.length);
        }
        return (sum == number);
    }
    public static int[] splitToDigits(int number){
        if(number < 0) return new int[0];
        if(number == 0) return new int[]{0};
        int[] digits = new int[(int)(Math.floor(Math.log10(number)) + 1)];
        int currentIndex = digits.length - 1;
        while (number >= 1){
            digits[currentIndex--] = number%10;
            number /= 10;
        }
        return digits;
    }
    public static int pow(int x, int exponent){
        if(exponent< 0) return 0;
        int result = 1;
        for (int i = 0; i < exponent ; i++) {
            result *= x;
        }
        return result;
    }
}
