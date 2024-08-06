package StringProblems;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over a lazy dog";

        boolean isPangram = isStringAPangram(str);
        System.out.println("Is string a Pangram? " + isPangram);
    }

    private static boolean isStringAPangram(String str) {
        Set<Character> set = new HashSet<>();

        for (char ch : (str.toLowerCase()).toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                set.add(ch);
        }
        if (set.size() == 26)
            return true;
        else
            return false;
    }


}
