package PPJ8;

public class Task3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input points scored (1) and max points (2):");

        float points = scanner.nextFloat(),
                max_points = scanner.nextFloat();
        float percent_scored = points/max_points*100;

        scanner.close();
        
        if(percent_scored >=87.5)
            System.out.println(5);
        else if (percent_scored>=81.25)
            System.out.println(4.5);
        else if (percent_scored >= 75)
            System.out.println(4);
        else if (percent_scored >= 62.6)
            System.out.println(3.5);
        else if (percent_scored >= 50)
            System.out.println(3);
        else
            System.out.println(2);
    }
}
