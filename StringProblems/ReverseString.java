package StringProblems;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String reversedStr = getReversedString(sc.next());
        System.out.println("Reversed String: " + reversedStr);
    }

    static String getReversedString(String str) {
        //Traversing the string characters
//        StringBuilder rev = new StringBuilder();
//        char[] chars = str.toCharArray();
//        for(int i= chars.length-1; i>=0; i-- ) {
//            rev.append(chars[i]);
//        }
//
//        return rev.toString();

        //Using reverse API
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    
    //Two-pointer approach
    static void reverseStr(String str) {
     int n = str.length();
     char []ch = str.toCharArray();
     char temp;
 
     // Swap character starting from two corners
     // i is the left pointer and j is the right pointer
     for (int i=0, j=n-1; i<j; i++,j--) {
         temp = ch[i];
         ch[i] = ch[j];
         ch[j] = temp;
     }
     System.out.println(ch);
    }
}
