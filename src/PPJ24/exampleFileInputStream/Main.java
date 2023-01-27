package PPJ24.exampleFileInputStream;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static private Map<Character, Integer> charCount = new HashMap<Character, Integer>();
    public static void main(String args[]){
        try {
            FileInputStream file = new FileInputStream("ppj24/readTest.txt");
            int i = file.read();
            while (i != -1) {
                logChar(i);
                i = file.read();
            }
            file.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        for(Map.Entry<Character, Integer> entry: charCount.entrySet()){
            System.out.println(entry.getKey() + " shows up " + entry.getValue() + " times");
        }

    }
    static private void logChar(char x){
        if(charCount.containsKey(x)){
            charCount.replace(x, charCount.get(x) + 1);
        } else {
            charCount.put(x, 1);
        }
    }
    static private void logChar(int x){
        logChar((char) x);
    }
}
