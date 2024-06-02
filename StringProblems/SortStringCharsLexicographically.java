package StringProblems;

import java.util.Arrays;

public class SortStringCharsLexicographically {
    public static void main(String[] args) {
        String str = "Democrats";

        String s = str.toLowerCase().chars().sorted().toString();
        System.out.println(s);

        char[] arr = str.toLowerCase().toCharArray();

        System.out.println(arr);
        Arrays.sort(arr);
        System.out.println(arr);
    }
}
