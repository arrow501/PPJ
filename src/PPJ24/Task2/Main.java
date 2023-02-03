package PPJ24.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File numbers = new File("src\\PPJ24\\Task2\\numerki.txt");
        try {
            Scanner scanner = new Scanner(numbers);
            String[] line = scanner.nextLine().split(" ");

            int sum = Arrays.stream(line) // "1", "2", "3"
                    .map(x -> Integer.parseInt(x)) // 1, 2, 3
                    .reduce((a, b) -> a + b).get();

            System.out.println(sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
