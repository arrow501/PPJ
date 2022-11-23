package PPJ13;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] tab = getRandomArr(100, 1,10 );// = {1, 1, 2, 3, 3};

        tab = bubbleSort(tab);
        System.out.println(countOfUniqueNumbers(tab));
        System.out.println(Arrays.toString(tab));
    }

    public static int countOfUniqueNumbers(int[] arr) {
        if (arr.length == 0) return 0;
        int counter = 1;
        int lastNumber = arr[0];
        for (int number : arr) {
            if (number > lastNumber) counter++;
            else if (number < lastNumber) throw new Error("Numbers in array aren't sorted correctly");
            lastNumber = number;
        }
        return counter;
    }
    public static int[] getRandomArr(int length,int lower_range, int upper_range){
        if(upper_range <= lower_range) throw new Error("Upper range has to be larger or equal to lower range");
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(upper_range-lower_range)+lower_range);
        }
        return arr;
    }
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        do {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            n = n - 1;
        } while (n > 1);
        return arr;
    }
}
