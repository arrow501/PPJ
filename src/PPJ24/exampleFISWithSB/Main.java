package PPJ24.exampleFISWithSB;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/ppj24/readTest.txt");
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = fis.read()) != -1) {
                sb.append((char)c);
            }
            System.out.println(sb.toString());
            fis.close();
        } catch (Exception e) {
            System.err.println("Error: file reading failed");
        }
    }
}
