package PPJ10;

public class Task1{
    public static void main(String[] args) throws Exception {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char input;
        int direction = 0; // North
        String[] compass = {"North", "East", "South", "West"};

        do {
            input = scanner.next().charAt(0);
            direction = switch (input) {
                case 'A', 'a'-> direction==0?3:direction-1;
                case 'D','d'-> direction==3?0:direction+1;
                case 'Q','q' -> -1;
                default -> throw new Exception("\r\nONLY INPUT: \r\n\t" +
                        "\"A\" to turn left,\r\n\t" +
                        "\"D\" to turn right\r\n\t" +
                        "\"Q\" to quit program.");
            };
            if(direction != -1)
                System.out.println("-> " + input + "\r\n" + compass[direction]);
            else
                System.out.println("Exiting...");
        }while(direction != -1);
        scanner.close();
    }
}
