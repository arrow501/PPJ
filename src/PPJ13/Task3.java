package PPJ13;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int n = 12;
        int[] tab = Task1.bubbleSort(Task1.getRandomArr(n,1,6));
        
        System.out.println(Arrays.toString(tab));
        System.out.println(is_at_least_half_of_sorted_arr_the_same_value(tab));
    }
    public static boolean is_at_least_half_of_sorted_arr_the_same_value(int[] arr){
        if(arr.length == 2) return true;
        else if(arr.length < 2) throw new Error("Given Array has to have lenght of 2 or more");
        
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]){
                count++;
                if(count >= (int) Math.ceil(arr.length/2.0)){
                    return true;
                }
            } else {
                count = 1;
            }
            
        }
        return false;
    }
    
    
}
