package PPJ24.Task1;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("src/ppj24/readTest.txt");
            int i = input.read();
            while (i != -1) {
                System.out.print((char)i);
                i = input.read();
            }
            input.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
