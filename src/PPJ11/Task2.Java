package PPJ11;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int [5];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = (int)(Math.random()*100);
        }
        System.out.println("arr1:\t" + Arrays.toString(arr1));
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = (int)(Math.random()*100);
        }
        System.out.println("arr2:\t" + Arrays.toString(arr2));


        int[] arr_merge = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr_merge.length; i++){
            if( i < arr1.length){
                arr_merge[i] = arr1[i];
            } else {
                arr_merge[i] = arr2[i - arr1.length];
            }
        }
        System.out.println("merge:\t" + Arrays.toString(arr_merge));
        
        
        int[] arr_and = new int[arr1.length];
        int current_index = 0;
        for(int e1: arr1){
            for(int e2: arr2){
                if(e1 == e2){
                    arr_and[current_index++] = e1;
                }
            }
        }
        int[] temp_arr = new int[current_index];
        for (int i = 0; i < temp_arr.length; i++) {
            temp_arr[i] = arr_and[i];
        }
        arr_and = temp_arr;
        System.out.println("and:\t" + Arrays.toString(arr_and));


        int[] arr_range;
        int smallest = arr1[0],
                largest = arr1[0];
        // finding smallest and largest element from both arrays
        for(int element: arr1){
            if (element < smallest) smallest = element;
            if (element > largest) largest = element;
        }
        for(int element: arr2){
            if (element < smallest) smallest = element;
            if (element > largest) largest = element;
        }
        current_index = 0;
        temp_arr = new int[largest - smallest];
        for (int i = smallest + 1; i < largest ; i++) {
            boolean isInArrays = false;
            for(int element: arr1){
                if(element == i) isInArrays = true;
            }
            for(int element: arr2){
                if(element == i) isInArrays = true;
            }
            if(!isInArrays){
                temp_arr[current_index++] = i;
            }
        }
        arr_range = new int[current_index];
        for (int i = 0; i < arr_range.length; i++) {
            arr_range[i] = temp_arr[i];
        }
        System.out.println("range:\t" + Arrays.toString(arr_range));
    }
}
