package PPJ18;

import java.util.Arrays;

public class FuncStat {
    public static void main(String[] args) {
        System.out.println(fiboR(45));
        System.out.println(fiboI(45));
        System.out.println(factR(12));
        System.out.println(factI(12));
        System.out.println(FuncStat.gcdR(12125,40643));
        System.out.println(FuncStat.gcdI(12125,40643));
        int[] a = {3,8,2,9,7,4};
        System.out.println("Max     : " + FuncStat.maxElem(a,0));
        System.out.println("Num even: " + FuncStat.numEven(a,0));
        System.out.println("Before:   " + Arrays.toString(a));FuncStat.reverse(a,0);
        System.out.println("After :   " + Arrays.toString(a));
        System.out.println("Is 'radar' a palindrom? " +FuncStat.isPalindrom("radar"));
        System.out.println("Is 'abba' a palindrom?  " +FuncStat.isPalindrom("abba"));
        System.out.println("Is 'rover' a palindrom? " +FuncStat.isPalindrom("rover"));
    }
    public static int fiboR(int n){
        // sequence starts at 1, 1
        if(n <= 2) return 1;
        return fiboR(n - 2) + fiboR(n - 1);
    }
    public static int fiboI(int n){
        // sequence starts at 1, 1
        int[] fibonacciNumbers = {1,1};
        for (int i = 1; i < n-1; i++) {
            int nextFibonacciNumber = fibonacciNumbers[0] + fibonacciNumbers[1];
            fibonacciNumbers[0] = fibonacciNumbers[1];
            fibonacciNumbers[1] = nextFibonacciNumber;
        }
        return fibonacciNumbers[1];
    }
    public static int factR(int n){
        if(n == 1) return 1;
        return n * factR(n-1);
    }
    public static int factI(int n){
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static int gcdR (int a, int b){
        if (b == 0)
            return a;
        else
            return gcdR(b, Math.abs(a - b));
    }
    public static int gcdI (int a, int b){
        while(b != 0){
            int temp = b;
            b = Math.abs(a - b);
            a = temp;
        }
        return a;
    }
    public static int maxElem(int[] arr, int from){
        if(arr.length - from == 1) return arr[from];
        return Math.max(arr[from], maxElem(arr, from + 1));
    }
    public static int numEven(int[] arr, int from) {
        if(from == arr.length) return 0;
        if(arr[from]%2 == 0) return numEven(arr, from+1) + 1;
        return numEven(arr, from+1);
    }
    public static void reverse(int[] arr, int from) {
        if(from == arr.length/2) return;
        int temp = arr[from];
        arr[from] = arr[arr.length - 1 - from];
        arr[arr.length - 1 - from] = temp;
    }
    private static boolean sameBackwards(char[] arr, int index){
        if(index > arr.length/2) return true;
        if(arr[index] != arr[arr.length - 1 - index])
            return false;
        return sameBackwards(arr, index + 1);
    }
    public static boolean isPalindrom(String word) {
        return sameBackwards(word.toLowerCase().toCharArray(), 0);
    }
}

