package PPJ24.exampleFileOutputStream;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        byte data[] = {1,2,3,4,5};
        try {
            //FileOutputStream out = new FileOutputStream("src/ppj24/writeTestFOS.bin");
            FileOutputStream out = new FileOutputStream("src/ppj24/writeTestFOS.bin", true);
            out.write(data);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("File created successfully");

    }
}
