package Extras.kolokwium2;

public class TestCodeReadEx1 {

    public static void main(String[] args) {
        int[][] multi = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
        for (int[] j : multi) {
            int idx = j.length - 1;
            while (idx > 0) {
                System.out.print(j[--idx] + "\t");
            }
        }
    }
    // 1   0    4    3   8    7   6   
}