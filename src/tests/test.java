package tests;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        int suma = 0, counter = 0;
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 26) + 65); // randomowo z przedzialu 90-65
            if (arr[i] >= 65 && arr[i] <= 90) {
                System.out.println((char) arr[i]);
            }
        }
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        do {

            System.out.print("podaj du?? litere z klawiatury : ");
            char input = scanner.next().charAt(0);

            for (int i = 0; i < arr.length; i++) {
                if (input == arr[i]) {
                    suma++;
                }

            }
            if (suma > 0) {
                ++counter;
                System.out.println("element wyst?puje " + suma + " raz");
                suma = 0;
                arr[counter] = 0;
                System.out.println(Arrays.toString(arr));

            } else {
                System.out.println("element nie wystepuje ani razu");
            }

        } while (arr[4] != 0);
    }
}
