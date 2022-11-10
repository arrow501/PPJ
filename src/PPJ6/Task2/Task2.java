package PPJ6.Task2;

public class Task2 {
    public static void main(String[] args) {
        int n = 15;
        boolean nIsPrime = true;
        int x = 1;

        if(n%++x == 0 && x <= Math.sqrt(n))
            nIsPrime = false;
        if(n%++x == 0 && x <= Math.sqrt(n))
            nIsPrime = false;
        if(n%++x == 0 && x <= Math.sqrt(n))
            nIsPrime = false;
        if(n%++x == 0 && x <= Math.sqrt(n))
            nIsPrime = false;
        if(n%++x == 0 && x <= Math.sqrt(n))
            nIsPrime = false;
        if(n%++x == 0 && x <= Math.sqrt(n))
            nIsPrime = false;
        if(n%++x == 0 && x <= Math.sqrt(n))
            nIsPrime = false;

        System.out.println(nIsPrime?"Prime":"Not prime");

    }
}
