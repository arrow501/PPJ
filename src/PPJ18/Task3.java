package PPJ18;

public class Task3 {
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
