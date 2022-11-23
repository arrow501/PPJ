package PPJ13;

import java.util.Arrays;

public class Task4 {
    static Integer[] tab = {null,null, null};
    public static void main(String[] args) {
        
        read();
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
        String input = in.nextLine();
        
        System.out.println(input.split(" ")[1]);
        return input;
    }
    private static void add(){

    }

}
