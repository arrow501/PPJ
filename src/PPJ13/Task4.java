package PPJ13;

import java.util.Arrays;
import java.util.HashMap;

public class Task4 {
    static Integer[] tab = {null,null, null};
    public static void main(String[] args) {
        input = read();
        number = Integer.parseInt(input.split(" ")[0]);
        command = input.split(" ")[1];
    }

    private static void print() {
        for (Integer number : tab) {
            if (number != null) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }

    private static String read(){
        java.util.Scanner in = new java.util.Scanner(System.in);
        try {
            System.out.println("Input a number followed by a command. Type help for list of commands.");
            String input = in.nextLine();
            in.close();
            if(input == "help"){
                help();
                return read();
            }
            return input;
        } catch (Exception e) {
            System.out.println("Incorrect input.\r\n" + "Example input: 5 add");
            return read();
        }
    }
    private static void exit() {
        print();
        System.exit(0);
    }

    private static void help() {
        // TODO: add help
    }

    private static void add(){

    }
    private static void get(){

    }

}
