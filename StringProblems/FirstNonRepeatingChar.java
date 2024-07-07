package problems.StringProblems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        String str = "aabcdbecfdef";

        Character ch = getReqChar(str);

        System.out.print("The first non-repeating char: " + ((ch != null) ? ch : "NONE"));

    }
    static Character getReqChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int count;
        for(int i=0; i<str.length(); i++) {
            char key = str.charAt(i);
            if(map.containsKey(key)) {
                count = map.get(key);
                map.put(key, count + 1);
            } else {
                map.put(key, 1);
            }
        }
        for(int j=0; j<str.length(); j++) {
            char key = str.charAt(j);
            if (map.get(key) == 1) {
                return key;
            }
        }
        return null;
    }
}
