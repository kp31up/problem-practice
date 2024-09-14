package StringProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

//Find uncommon characters of the two strings. Given strings 'str1' and 'str2'. Return a string of distinct characters which are
// present in either of them but not both.The strings contain only lowercase characters and can contain duplicates.
public class UncommonCharacters {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "geeksquiz";

        System.out.println("Uncommon character string: "+ getUncommonChars(s1, s2));
        System.out.println("Uncommon character string: "+ usingAtoZArray(s1, s2));
    }
    //Better approach
    private static String usingAtoZArray(String s1, String s2) {
        int[] arr = new int[26];

        Arrays.fill(arr, 0);
        for(char c: s1.toCharArray()) {
            arr[c-'a'] = 1;
        }

        for(char c: s2.toCharArray()) {
            if (arr[c - 'a'] == 1 || arr[c - 'a'] == -1){
                arr[c - 'a'] = -1;
            } else {
                arr[c - 'a'] = 2;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<arr.length; i++){
            if(arr[i] == 1 || arr[i] == 2){
                sb.append((char)(i+'a'));
            }
        }
        if (sb.length() == 0){
            return "-1";
        }
        return sb.toString();
    }

    private static String getUncommonChars(String s1, String s2) {
        //To sort and add the elements
        TreeSet<Character> tree= new TreeSet<>();
        //To find chars which are present in s2 and not s1.
        getDistinct(s1, s2, tree);
        //To find chars which are present in s1 and not s2.
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
