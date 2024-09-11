package StringProblems;

import java.util.HashSet;
import java.util.Set;

// Given a string 'S' of length 'L', return the length of the longest substring without repeating characters.
public class LongestNonRepeatingSubstring {

    // Sliding window approach.
    public static int getLength(String str) {
        int size = str.length();
        if (str.isEmpty()){
            return 0;
        }
        if (size == 1) {
            return 1;
        }
        int l=0,r=0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        while (r < size){
            while (set.contains(str.charAt(r))){
                set.remove(str.charAt(l));
                l++;
            }
            set.add(str.charAt(r));
            maxLength = Math.max(maxLength, (r-l)+1);
            r++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "entities";
        System.out.println(getLength(s1));
    }
}
