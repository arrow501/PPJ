package PPJ10;

public class Task2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        {
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i * (i + 1);
            }
            long sum_formula = n * (n + 1) * (n + 2) / 3;
            if (sum == sum_formula)
                System.out.println("Formula is correct");
            else
                System.out.println("Formula isn't correct");
        }
        // Equation 2
        {
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i * i * (i % 2 == 0 ? -1 : 1); // Even terms are negative
            }
            long sum_formula = (int) (Math.pow(-1, n - 1)) * n * (n + 1) / 2;
            if (sum == sum_formula)
                System.out.println("Formula is correct");
            else
                System.out.println("Formula isn't correct");
        }
    }
}