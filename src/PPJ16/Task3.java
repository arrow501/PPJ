package PPJ16;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(621));
        System.out.println(isArmstrongNumber(371));
    }
    public static boolean isArmstrongNumber(int number) {
        int[] digits = Task2.splitToDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += pow(digit, digits.length);
        }
        return (sum == number);
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
