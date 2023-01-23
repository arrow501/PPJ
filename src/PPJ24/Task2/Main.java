package PPJ24.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("Task2/zad1.txt"));

            while (scanner.hasNextLine()) {
                 Integer sum = Arrays.stream(scanner.nextLine()
                         .split(" "))
                         .map((numberString) -> Integer.parseInt(numberString))
                         .reduce((a,b) -> a+b)
                         .get();
                System.out.println(sum);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
