package PPJ14;

public class Task1 {
    public static void main(String[] args) {
        float[][] tab = new float[8][];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = getRandomArr(8, 0f, 10f);
        }

        float leftDiagonalSum = 0f,
            rightDiagonalSum = 0f;
        for (int i = 0; i < tab.length; i++) {
            leftDiagonalSum += tab[i][i];
            rightDiagonalSum += tab[i][tab.length - 1 - i];
        }

        System.out.println("Left diagonal sum: " + leftDiagonalSum);
        System.out.println("Right diagonal sum: " + rightDiagonalSum);
    }

    public static float[] getRandomArr(int length, float lower_range, float upper_range) {
        if (upper_range <= lower_range)
            throw new Error("Upper range has to be larger or equal to lower range");
        float[] arr = new float[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (Math.random() * (upper_range - lower_range) + lower_range);
        }
        return arr;
    }
}
