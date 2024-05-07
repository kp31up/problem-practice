package StringProblems;

import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String reversedStr = getReversedString(sc.next());
        System.out.println("Reversed String: " + reversedStr);
    }

    static String getReversedString(String str) {
        StringBuilder rev = new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i= chars.length-1; i>=0; i-- ) {
            rev.append(chars[i]);
        }

        return rev.toString();
    }
}
