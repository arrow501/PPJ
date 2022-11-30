package PPJ15;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        char[] ala = "Ala ma kota".toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : ala) {
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else{
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            System.out.println("Znak \'" + entry.getKey() + "\' występuje " + entry.getValue() + (entry.getValue()==1?" raz.":" razy."));
        }
    }
}
