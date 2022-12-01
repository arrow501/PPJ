package PPJ14;

public class Task2 {
    static int[] rolls = new int[0];
    private static java.util.Scanner in = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        roll(2);
        show();
        boolean exit = false;
        do{
            char command = read();
            switch(command){
                case 'r' -> roll(1);
                case 's' -> show();
                case 'e' -> exit = true;
                default -> System.out.print("Unknown command.");
            }
        } while(!exit);
        in.close();
    }

    private static void roll(int nOfDice) {
        int[] newRolls = new int[rolls.length + nOfDice];
        for (int i = 0; i < rolls.length; i++) {
            newRolls[i] = rolls[i];
        }
        for (int i = 0; i < nOfDice; i++) {
            newRolls[i + rolls.length] = (int) (Math.random() * 6 + 1); // 1 - 6
        }
        rolls = newRolls;
        System.out.println(nOfDice + (nOfDice == 1 ? " die has" : " dice have") + " been rolled.");
    }
    private static void show(){
        System.out.print("Rolls: " );
        for (int value : rolls) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
    private static char read() {
        System.out.println("Type 's' to show all rolls, 'r' to roll additional die or 'e' to exit");
        try {
            return in.next().charAt(0);
        } catch (Exception e) {
            System.out.print("Incorrect input. Try again.");
            return read();
        }
    }
}
