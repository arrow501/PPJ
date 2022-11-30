package PPJ15;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] tab = { { 1, 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1 } };
        int newTabLength = 0;
        for (int[] sub_array : tab) {
            for (int i : sub_array) {
                newTabLength++;
            }
        }
        int[] newTab = new int[newTabLength];
        int currentIndex = 0;
        for (int[] sub_array : tab) {
            for (int i : sub_array) {
                newTab[currentIndex++] = i;
            }
        }
        System.out.println(Arrays.toString(newTab));
    }
}
