package PPJ12;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {153, 333, 370, 515, 407, 80};
        for (int number : arr) {
            int [] digits = toDigitArray(number);
            //System.out.println(Arrays.toString(digits));
            int sum = 0;
            for(int digit: digits){
                sum += pow(digit, digits.length);
            }
            //System.out.println(sum);
            if(sum == number)
                System.out.println(number + " jest liczba armstronga");
            else
                System.out.println(number + " nie jest liczba armstronga");
        }
    }
    public static int pow(int x, int exponent){
        if(exponent< 0) return 0;
        int result = 1;
        for (int i = 0; i < exponent ; i++) {
            result *= x;
        }
        return result;
    }
    public static int[] toDigitArray(int number){
        int n_digits = 0;
        int temp_number = number;
        while(temp_number >= 1){
            n_digits += 1;
            temp_number /= 10;
        }

        temp_number = number;
        int[] digits = new int[n_digits];
        for (int i = n_digits - 1; i >= 0; i--) {
            digits[i] = temp_number%10;
            temp_number /= 10;
        }
        return digits;
    }
}
