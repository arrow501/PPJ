package PPJutils;

public class PPJutils {
    public static boolean isArmstrongNumber(int number) {
        int[] digits = splitToDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += pow(digit, digits.length);
        }
        return (sum == number);
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
    public static int pow(int x, int exponent){
        if(exponent< 0) return 0;
        int result = 1;
        for (int i = 0; i < exponent ; i++) {
            result *= x;
        }
        return result;
    }
}
