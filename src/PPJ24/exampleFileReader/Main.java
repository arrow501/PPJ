package PPJ24.exampleFileReader;

import java.io.FileReader;

public class Main {
    public static void main(String args[]) {

        System.out.println("Print Data via ExampleFileReader:\n");

        try{
            FileReader fr = new FileReader("src/ppj24/readTest.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
            fr.close();
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
