package PPJ7.Task5;

public class Task5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char ch = scanner.next().charAt(0);
        scanner.close();
        if(Character.isLetter(ch))
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y')
                System.out.println("Znak jest samogłoską");
            else
                System.out.println("Znak jest spółgłoską");
        else
            System.out.println("Znak nie jest literą");
    }
}
