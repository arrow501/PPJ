package PPJ17;

import Toolbox.Toolbox;

public class Task1 {
    public static void main(String[] args) {
        int[][] tab = Toolbox.getInt2DArr(4,4);
        Toolbox.showArr(tab);
        rotateMatrix90CW(tab);
        Toolbox.showArr(tab);
    }
    static void rotateMatrix90CW(int[][] A){
        for (int[] row: A) {
            if(row.length != A.length)
                throw new Error("Provided matrix must be square!");
        }
        int side = A.length;
        for (int i = 0; i < side/2; i++) {
            int[] tempRow = A[i];
            A[i] = A[side - 1 - i];
            A[side - 1 - i] = tempRow;
        }
        for (int i = 0; i < side; i++) {
            for (int j = i + 1; j < side; j++) {
                int temp = A[j][i];
                A[j][i] = A[i][j];
                A[i][j] = temp;
            }
        }
    }
}
