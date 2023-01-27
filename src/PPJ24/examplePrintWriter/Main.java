package PPJ24.examplePrintWriter;


import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try {
            //PrintWriter writer = new PrintWriter("src/ppj24/writeTestPW.txt");
            PrintWriter writer = new PrintWriter(new FileOutputStream("src/ppj24/writeTestPW.txt", true));
            writer.print("Line one");
            writer.println(" more of line one");
            writer.println("Line two");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("File created successfully");

    }
}
