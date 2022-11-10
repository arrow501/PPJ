package PPJ8;

public class Task2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input three parameters of a quadratic equation (ax^2 + bx + c):");
        double a = scanner.nextDouble(),
                b = scanner.nextDouble(),
                c = scanner.nextDouble();
        scanner.close();
        
        double delta = b*b - 4*a*c;
        if(delta == 0) {
            double root = (Math.sqrt(delta) - b) / (2 * a);
            System.out.println("root = " + root);
        } else if (delta > 0) {
            double root1 = (Math.sqrt(delta) - b) / (2 * a),
                    root2 = (-Math.sqrt(delta) - b) / (2 * a);
            System.out.println("root1 = " + root1 + "/r/nroot2 = " + root2);
        } else {
            System.out.println("Equation has no real solutions");
        }


    }
}
