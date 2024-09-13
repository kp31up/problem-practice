package StringProblems;

import java.util.HashSet;
import java.util.TreeSet;

//Find uncommon characters of the two strings. Given strings 'str1' and 'str2'. Return a string of characters which are
// present in either of them but not both.The strings contain only lowercase characters and can contain duplicates.
public class UncommonCharacters {
    public static void main(String[] args) {
        String s1 = "kohlik";
        String s2 = "dhonid";

        System.out.println("Uncommon character string: "+ getUncommonChars(s1, s2));
    }

    private static String getUncommonChars(String s1, String s2) {

        TreeSet<Character> tree= new TreeSet<>();

        getDistinct(s1, s2, tree);

        getDistinct(s2, s1, tree);

        StringBuilder sb = new StringBuilder();
        for(char c: tree){
            sb.append(c);
        }

        if (tree.isEmpty()){
            return "-1";
        }
        return sb.toString();
    }

    private static void getDistinct(String s1, String s2, TreeSet<Character> tree) {
        HashSet<Character> set1 = new HashSet<>();
        for(char c : s1.toCharArray()){
            set1.add(c);
        }
        for (char c: s2.toCharArray()) {
            if (!set1.contains(c)){
                tree.add(c);
            }
        }
    }
}
