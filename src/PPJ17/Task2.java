package PPJ17;

public class Task2 {
    public static void main(String[] args) {
        int[] tab = {1,2,3,1,2,1};
        System.out.println(countOfValue(tab, 0, 1));
    }
    static int countOfValue(int[] arr, int startingIndex, int value){
        if(startingIndex == arr.length) return 0;
        if(arr[startingIndex] == value) return countOfValue(arr, startingIndex+1, value) + 1;
        return countOfValue(arr, startingIndex + 1, value);
    }
}
