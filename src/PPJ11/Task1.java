package PPJ11;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int arr_size = (int) (Math.random() * 6 + 9); // 10 - 15
        int[] arr = new int[arr_size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int switch_index = (int) (Math.random() * arr.length);
            arr[i] = arr[switch_index];
            arr[switch_index] = temp;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int k : arr) {
                if (i == k) {
                    System.out.print("*  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();

        }
    }
}
