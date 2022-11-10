package PPJ8;

public class Task1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input values of three angles (in degrees):");

        int alpha = scanner.nextInt(),
                beta = scanner.nextInt(),
                gamma = scanner.nextInt();
                
        scanner.close();

        if(alpha+beta+gamma == 180) {
            System.out.print("This is a");
            if (alpha < 90 && beta < 90 && gamma < 90)
                System.out.print("n acute");
            System.out.print(" triangle.");
        }
        else
            System.out.println("This isn't a triangle.");
    }
}
