package Toolbox;

public class Toolbox {

    public static String arrToString(int[] arr) {
        StringBuilder s = new StringBuilder();
        for (int o : arr) {
            s.append(o);
        }
        return s.toString();
    }

    public static String arrToString(int[][] arr) {
        StringBuilder s = new StringBuilder();
        for (int[] ints : arr) {
            s.append(arrToString(ints));
            s.append("\n");
        }
        return s.toString();
    }
    public static String arrToString(char[] arr) {
        StringBuilder s = new StringBuilder();
        for (char o : arr) {
            s.append(o);
        }
        return s.toString();
    }

    public static String arrToString(char[][] arr) {
        StringBuilder s = new StringBuilder();
        for (char[] ints : arr) {
            s.append(arrToString(ints));
            s.append("\n");
        }
        return s.toString();
    }

    public static String arrToString(byte[] arr) {
        StringBuilder s = new StringBuilder();
        for (byte o : arr) {
            s.append(o);
        }
        return s.toString();
    }

    public static String arrToString(byte[][] arr) {
        StringBuilder s = new StringBuilder();
        for (byte[] ints : arr) {
            s.append(arrToString(ints));
            s.append("\n");
        }
        return s.toString();
    }

    public static void showArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(int[][] arr){
        System.out.println("{");
        for (int[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void showArr(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%.2f", arr[i]);
            if(i!=arr.length-1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(double[][] arr){
        System.out.println("{");
        for (double[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void showArr(float[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%.2f", arr[i]);
            if(i!=arr.length-1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(float[][] arr){
        System.out.println("{");
        for (float[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void showArr(char[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(char[][] arr){
        System.out.println("{");
        for (char[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void showArr(byte[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(byte[][] arr){
        System.out.println("{");
        for (byte[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void sortArrAscending(int[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrAscending(double[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrAscending(char[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            char temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrAscending(float[] arr) {
        //selection sort;
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            float temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrAscending(byte[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            byte temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(int[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            int temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(double[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            double temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(char[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            char temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(float[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            float temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(byte[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            byte temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static int getIntRandomNumber(int min, int max){
        //range [min, max]
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int[] getInt1DArr(int length){
        int[] arr = new int[length];
        for (int i = 0, counter = 1; i < arr.length; i++) {
            arr[i] = counter++;
        }
        return arr;
    }

    public static int[][] getInt2DArr(int rows, int columns){
        int[][] arr = new int[rows][columns];
        for (int i = 0, counter = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = counter++;
            }
        }
        return arr;
    }
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

