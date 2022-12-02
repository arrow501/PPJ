package PPJ16;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(splitToDigits(621)));
    }
    public static int[] splitToDigits(int number){
        if(number < 0) return new int[0];
        if(number == 0) return new int[]{0};
        int[] digits = new int[(int)(Math.floor(Math.log10(number)) + 1)];
        int currentIndex = digits.length - 1;
        while (number >= 1){
            digits[currentIndex--] = number%10;
            number /= 10;
        }
        return digits;
    }
}
