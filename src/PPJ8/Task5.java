package PPJ8;

public class Task5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the series multiplier:");
        float wrt = scanner.nextFloat();
        scanner.close();

        for (int i = 1; i <= 10;i++)
            System.out.print(i*wrt + (i==10?"":", "));
    }
}
