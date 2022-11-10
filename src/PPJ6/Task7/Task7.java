package PPJ6.Task7;

public class Task7 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        
        if (num1 > 0 && num2 > 0)
            System.out.println(num1 - num2);
        else
            System.out.println(num1 + num2);
    }
}
