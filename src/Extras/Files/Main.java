package Extras.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    private static boolean exit = false;
    public static ArrayList<String> lines = new ArrayList<String>();;

    public static void main(String[] args) {
        File file = new File("src\\Extras\\Files\\text.txt");
        lines = read(file);
        // lines = formatLines();
        while (!exit) {
            // Input input = getUserInput();
        }
        save(file);

    }

    private static String getUserInput() {
        return null;
    }

    private static ArrayList<String> formatLines() {
        ArrayList<String> formatted = new ArrayList<String>();
        String text = getMergedLines();
        String[] words = text.split(" ");

        final int LineCharacterLimit = 80;
        StringBuffer line = new StringBuffer(LineCharacterLimit);
        int characterCount = 0;

        for (String word : words) {
            if (characterCount + word.length() > LineCharacterLimit) {
                line.append(word);
                formatted.add(line.toString());

                characterCount += word.length();
                line.delete(0, characterCount);
                characterCount = 0;
            } else {
                line.append(word + " ");
                characterCount += word.length() + 1;
            }
        }
        return formatted;
    }

    private static String getMergedLines() {
        return lines.stream().collect(Collectors.joining("\n"));
    }

    private static void save(File file) {
        String text = getMergedLines();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(text, 0, text.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static ArrayList<String> read(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            ArrayList<String> lines = new ArrayList<String>();

            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + ":\t" + line);
                lineNumber++;
                lines.add(line);
            }
            return lines;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return new ArrayList<String>();
        }
    }
}
