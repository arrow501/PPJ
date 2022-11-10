package PPJ10;

public class Task3 {
    public static void main(String[] args) {
        // input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        boolean validation = false;
        int lower, upper; //bounds
        
        do{
            System.out.println("Input lower bound of range as integer, thats <100:");
            lower = scanner.nextInt();
            System.out.println("Input upper bound of range as integer, thats <100");
            upper = scanner.nextInt();
            if(upper < lower)
                System.out.println("Upper bound has to be GREATER than lower bound!"); 
            else if (upper >= 100 && lower >= 100)
                System.out.println("Both bounds have to be SMALLER than 100!");
            else
                validation = true;

        } while(validation == false);
        scanner.close();
        // /input
        
        int random;
        int counter = 0;
        boolean isInRange = false;
        while(!isInRange){
            random = (int) (Math.random()*100);
            if(random>upper || random < lower){
                counter++;
                System.out.println("Wylosowana liczba to " + random + 
                ", znajduje się ona poza przedziałem [" + lower + ", " + upper + "].");
            } else {
              isInRange = true;
              System.out.println("Wylosowana liczba " + random + " znajduje się w przedziale.\r\n" +
                "Nieudane próby: " + counter);  
            }
        }


    }
}
