package StringProblems;

import java.util.HashSet;

//Find uncommon characters of the two strings. Given strings 'str1' and 'str2'. Return a string of characters which are
// present in either of them but not both.The strings contain only lowercase characters and can contain duplicates.
public class UncommonCharacters {
    public static void main(String[] args) {
        String s1 = "Kohli";
        String s2 = "Dhoni";

        System.out.println("Uncommon character string: "+ getUncommonChars(s1, s2));
    }

    private static String getUncommonChars(String s1, String s2) {
        StringBuilder sb = new StringBuilder();

        getDitinct(s1, s2, sb);

        getDitinct(s2, s1, sb);

        return sb.toString();
    }

    private static void getDitinct(String s1, String s2, StringBuilder sb) {
        HashSet<Character> set1 = new HashSet<>();
        for(char c : s1.toCharArray()){
            set1.add(c);
        }
        for (char c: s2.toCharArray()) {
            if (!set1.contains(c)){
                sb.append(c);
            }
        }
    }
}
