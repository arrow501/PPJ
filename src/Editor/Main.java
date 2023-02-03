package Editor;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src\\Editor\\Main.java");
        String line = null;

        try {
            // Open the file for reading
            BufferedReader reader = new BufferedReader(new FileReader(file));

            // Read the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file
            reader.close();

            // Open the file for writing
            FileWriter writer = new FileWriter(file, true);

            // Write to the file
            writer.write("This is a new line added by the file editor.");

            // Close the file
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
