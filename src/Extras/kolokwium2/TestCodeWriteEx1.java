package Extras.kolokwium2;

import java.util.Arrays;

import org.w3c.dom.Attr;

import Toolbox.PPJutils;
import Toolbox.Toolbox;

public class TestCodeWriteEx1 {
    public static void main(String[] args) {

        System.out.println("\nEx 1:\n");
        int value = 456712315;
        System.out.println("Unique digits of " + value);
        for (byte digit : uniqueDigits(value)) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Unique digits of " + value + " in order of first appearance");
        for (byte digit : uniqueDigitsNonSorted(value)) {
            System.out.print(digit + " ");
        }
        System.out.println();

        //=======================================

        System.out.println("\nEx 2:\n");

        System.out.println("0" + isExponent((byte) 0));
        System.out.println("1" + isExponent((byte) 1));
        System.out.println("65" + isExponent((byte) 65));
        System.out.println("32" + isExponent((byte) 32));
        System.out.println("64" + isExponent((byte) 64));

        // ===========================================
        System.out.println("\nEx 3:\n");

        int randomInt = (int) (Math.random() * 2147483640);
        System.out.println("random number: " + randomInt);

        byte[] uniqueDigitArray = uniqueDigits(randomInt);
        System.out.println(Arrays.toString(uniqueDigitArray));

        for (int i = uniqueDigitArray.length - 1; i >= 0; i--) {
            if (!isExponent(uniqueDigitArray[i])) {
                System.out.print(uniqueDigitArray[i] + " ");
            }
        }
        System.out.println();

        // ===========================================
        System.out.println("\nEx 4:\n");

        System.out.println("5^3 = " + pow(5, 3));
        System.out.println("12^2 = " + pow(12, 2));
        System.out.println("2^10 = " + pow(2, 10));
        System.out.println("9999^0 = " + pow(9999, 0));
        System.out.println("-5^3 = " + pow(-5, 3));

        // ===========================================
        System.out.println("\nBubblesort:\n");

        int[] randomArray = PPJutils.getRandomIntArray(0, 1000, 10);
        
        int[] tab = Arrays.copyOf(randomArray, randomArray.length);
        System.out.println("unsorted: " + Arrays.toString(tab));
        bubblesort(tab);

        System.out.println("sorted: " + Arrays.toString(tab));

        tab = Arrays.copyOf(randomArray, randomArray.length);
        System.out.println("unsorted: " + Arrays.toString(tab));
        bubblesortBad(tab);

        System.out.println("sorted: " + Arrays.toString(tab));
    }

    public static byte[] uniqueDigits(int value) {
        boolean[] doesDigitAppear = new boolean[10];
        while (value > 0) {
            int digit = value % 10;
            doesDigitAppear[digit] = true;
            value /= 10;
        }
        int uniqueDigitCount = 0;
        for (boolean b : doesDigitAppear) {
            if (b)
                uniqueDigitCount++;
        }

        byte[] uniqueDigitArray = new byte[uniqueDigitCount];
        int currentIndex = 0;
        for (byte digit = 0; digit < doesDigitAppear.length; digit++) {
            if (doesDigitAppear[digit])
                uniqueDigitArray[currentIndex++] = digit;
        }
        return uniqueDigitArray;
    }
    public static byte[] uniqueDigitsNonSorted(int value) {
        byte[] digitArray = new byte[getCountOfDigits(value)];

        int currentIndex = digitArray.length - 1;
        while(value > 0){
            digitArray[currentIndex--] = (byte)(value%10);
            value /= 10;
        }

        boolean[] digitsSeen = new boolean[10];

        for (int i = 0; i < digitArray.length; i++) {
            byte digit = digitArray[i];
            if(digitsSeen[digit]){
                shiftLeft(digitArray, i);
            }
            else{
                digitsSeen[digit] = true;
            }
        }
        int uniqueDigitCount = 0;
        for (boolean b : digitsSeen) {
            if(b) uniqueDigitCount++;
        }
        byte[] uniqueDigitArray = new byte[uniqueDigitCount];
        for (int i = 0; i < uniqueDigitArray.length; i++) {
            uniqueDigitArray[i] = digitArray[i];
        }

        return uniqueDigitArray;
    }
    public static void shiftLeft(byte[] arr, int index){
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
    }
    public static int getCountOfDigits(int number){
        int digitCount = 0;
        while(number > 0){
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }

    public static boolean isExponent(byte value) {
        byte powerOf2 = 1;
        while (powerOf2 <= value && powerOf2 > 0) {
            if (powerOf2 == value)
                return true;
            powerOf2 *= 2;
        }
        return false;
    }

    public static boolean isExponent(int value) {
        int powerOf2 = 1;
        while (powerOf2 <= value && powerOf2 > 0) {
            if (powerOf2 == value)
                return true;
            powerOf2 *= 2;
        }
        return false;
    }

    public static int pow(int base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent < 0)
            throw new RuntimeException("This method requires and exponent of 0 or more");
        return pow(base, exponent - 1) * base;
    }

    public static void bubblesort(int[] arr) {
        int endIndex = arr.length - 1; // set to the largest index in the array
        while (endIndex > 0) {
            // iterate over indices up to, but not including end index
            for (int i = 0; i < endIndex; i++) {
                // swap if next element is larger
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            // largest element is now at endIndex
            endIndex--;
        }
    }

    public static void bubblesortBad(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
