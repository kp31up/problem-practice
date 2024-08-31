package StringProblems;

import static java.lang.String.valueOf;

public class LongestSubstringI {

    //Find Longest Substring Without Repeated Characters
    public static void main(String[] args) {
        String word = "abbefgfecc";

        StringBuilder sb = new StringBuilder(valueOf(word.charAt(0)));
        int maxLen = 0, currLen = 1;
        String longestSubstring = null;
        for(int i=0; i< word.length()-1; i++) {
            if (word.charAt(i) != word.charAt(i+1) ) {
                sb.append(word.charAt(i+1));
                currLen++;
            } else {
                // Resetting the value of 'sb' and length for new unique substring
                sb.replace(0, i+1, valueOf(word.charAt(i+1)));
                currLen = 1;
            }
            //Keeping the track of the longest substring yet found
            if (currLen >= maxLen) {
                longestSubstring = sb.toString();
                maxLen = sb.length();
            }
        }
        System.out.print(longestSubstring);
    }
}
