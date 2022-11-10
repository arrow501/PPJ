package PPJ7.Task2;

public class Task2 {
    public static void main(String[] args) {
        double current = Math.random();
        double last;
        double secondLast;

        if (current > 0.2)
            System.out.println("Last value is > 0.2");
        else
            System.out.println("Last value is not > 0.2");
        {
//            secondLast = last;
            last = current;
            current = Math.random();
            if (current > 0.2 && last > 0.2)
                System.out.println("Last 2 all are > 0.2");
            else
                System.out.println("Not all of last 2 are >0.2");
        }
        {
            secondLast = last;
            last = current;
            current = Math.random();
            if (current > 0.2 && last > 0.2 && secondLast > 0.2)
                System.out.println("Last 3 all are > 0.2");
            else
                System.out.println("Not all of last 3 are >0.2");
        }
        {
            secondLast = last;
            last = current;
            current = Math.random();
            if (current > 0.2 && last > 0.2 && secondLast > 0.2)
                System.out.println("Last 3 all are > 0.2");
            else
                System.out.println("Not all of last 3 are >0.2");
        }
        {
            secondLast = last;
            last = current;
            current = Math.random();
            if (current > 0.2 && last > 0.2 && secondLast > 0.2)
                System.out.println("Last 3 all are > 0.2");
            else
                System.out.println("Not all of last 3 are >0.2");
        }

    }
}
