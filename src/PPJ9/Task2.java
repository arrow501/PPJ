package PPJ9;

public class Task2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double money = scanner.nextFloat();
        scanner.close();
        
        for (double multiplier = 100; multiplier >= 0.01d; multiplier /= 10) {

            int five = 0;
            int two = 0;
            int one = 0;
            while (money >= multiplier * 0.999) { //bc java is stupid
                if (money >= 5 * multiplier) {
                    five++;
                    money -= 5 * multiplier;
                } else if (money >= 2 * multiplier) {
                    two++;
                    money -= 2 * multiplier;
                } else {
                    one++;
                    money -= 1 * multiplier;
                }
            }
            String suffix = multiplier >= 1 ? "zl" : "gr";
            int modifier = (suffix == "gr") ? 100 : 1;
            if (five != 0) System.out.println(five + " * " + 5 * multiplier * modifier + " " + suffix);
            if (two != 0) System.out.println(two + " * " + 2 * multiplier * modifier + " " + suffix);
            if (one != 0) System.out.println(one + " * " + 1 * multiplier * modifier + " " + suffix);

        }
    }
}
