package PPJ8;

public class Task7 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input as many numbers as you'd like, Enter 0 to halt.");
        double sum = 0;
        int count = 0;
        double user_input;
        do {
            user_input = scanner.nextDouble();
            sum += user_input;
            count++;
        } while(user_input != 0);
        System.out.println(
                "You've entered " + count + (
                        count==1
                                ?" number."
                                :" numbers and their sum is " + sum +".")
        );
        scanner.close();
    }
}
