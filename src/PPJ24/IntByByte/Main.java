package PPJ24.IntByByte;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        int x = 13579;

        try {
            FileOutputStream out = new FileOutputStream("src/ppj24/IntByByte/output.bin");
            out.write((x&0xFF000000)>>24);
            out.write((x&0x00FF0000)>>16);
            out.write((x&0x0000FF00)>>8);
            out.write((x&0x000000FF));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("File created successfully");


        /*try {
            FileOutputStream out = new FileOutputStream("src/ppj24/IntByByte/output.txt");
            String number = Integer.toString(x);
            for (int i = 0; i < number.length(); i++) {
                out.write(number.charAt(i));
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
