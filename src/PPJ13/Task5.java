package PPJ13;
public class Task5 {
    static Integer[] tab = { null, null, null };
    static boolean endProgram = false;
    static int currentIndex = 0;
    static private java.util.Scanner in = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input a number followed by a command. Type help for list of commands.");
        do {
            Input input = read();
            if (input.number > 5 || input.number < -5)
                exit();
            switch (input.command) {
            case "add" -> add(input.number);
            case "get" -> get();
            case "exit" -> exit();
            case "help" -> help();
            default -> System.out.println("Unknown command. Type help for list of commands.");
            }
        } while (!endProgram);
        in.close();
    }

    private static void print() {
        for (Integer number : tab) {
            if (number != null) {
                System.out.print("[" + number + "]");
            }
        }
        System.out.println();
    }

    private static Input read() {
        try {
            String input = in.nextLine();
            if (input.toLowerCase().equals("help")) {
                help();
                return read();
            }
            int number = Integer.parseInt(input.split(" ")[0]);
            String command = input.split(" ")[1];
            return new Input(command, number);
        } catch (Exception e) {
            System.out.println("Incorrect input. Type help for help.");
            return read();
        }
    }

    private static void exit() {
        print();
        endProgram = true;
    }

    private static void help() {
        System.out.println(
            "~~~~ HELP ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n" +
            "Correct input is a number between -5 and 5, followed by a space and name of command. ex:\r\n" +
            "\t5 add\r\n" +
            "Providing a number larger than 5 or smaller than -5 closes the program.\r\n" +
            "Available commands: \r\n" +
            "\tadd: adds number to the vault.\r\n" +
            "\tget: returns number last put into the vault.\r\n" +
            "\texit: end program.\r\n"+
            "\thelp: open this page.\r\n" +
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n" +
            "Input a number followed by a command. Type help for list of commands."
        );
    }

    private static void add(int number) {
        if (currentIndex >= tab.length) expand();
        tab[currentIndex] = number;
        currentIndex++;
        print();
    }

    private static void get() {
        if (currentIndex == 0) {
            System.out.println("No numbers to be returned. Try adding some first");
            return;
        }
        currentIndex--;
        System.out.println("> " + tab[currentIndex]);
        tab[currentIndex] = null;
        print();
    }
    private static void expand(){
        Integer[] newTab = new Integer[tab.length+3];
        for (int i = 0; i < tab.length; i++) {
            newTab[i] = tab[i];
        }
        tab = newTab;
    }
}
