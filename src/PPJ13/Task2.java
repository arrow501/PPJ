package PPJ13;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] A, B, C;
        A = Task1.bubbleSort(Task1.getRandomArr(10, 0, 100));
        B = invertArr(Task1.bubbleSort(Task1.getRandomArr(11, 0, 100)));
        //System.out.println(Arrays.toString(B));
        C = new int[A.length + B.length];
        int currentA = 0, currentB = B.length - 1;
        for (int i = 0; i < C.length; i++) {
            if (currentB == -1) C[i] = A[currentA++];
            else if (currentA == A.length - 1) C[i] = B[currentB];
            else if (A[currentA] <= B[currentB]) {
                C[i] = A[currentA++];
            } else {
                C[i] = B[currentB--];
            }
        }
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
        System.out.println("C: " + Arrays.toString(C));
    }

    public static int[] invertArr(int[] arr) {
        for (int i = 0; i < (arr.length / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

}
