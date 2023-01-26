package PPJ24.Task1;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        File textFile = new File("src\\PPJ24\\Task1\\text.txt");
        HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
        try{
            FileInputStream in = new FileInputStream(textFile);

            int inputData;
            while( (inputData = in.read()) != -1){
                Character inputChar = (char) inputData;

                if( characters.containsKey( inputChar)) {
                    int count = characters.get(inputChar) + 1;
                    characters.replace(inputChar, count);
                } else {
                    characters.put(inputChar, 1);
                }
            }
        } catch( Exception e){
            System.out.println("error");
        }

        for( HashMap.Entry<Character,Integer> entry: characters.entrySet()){
            System.out.println( "The character '" + entry.getKey() + "' appears " + entry.getValue() + (entry.getValue()==1?" time":" times."));
        }
    }
}
