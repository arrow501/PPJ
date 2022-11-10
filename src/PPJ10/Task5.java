package PPJ10;

public class Task5 {
    public static void main(String[] args) {
        char[] arr = {'g', 'a', 'y'};
        
        int smallest_value_index = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[smallest_value_index])
                smallest_value_index = i;
        }
        System.out.println("Smallest value at index: " + smallest_value_index);
    }
}
