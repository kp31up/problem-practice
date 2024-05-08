package StringProblems;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDupChar {

    public static void main(String[] args) {

        String input = "programming";           //output: progamin
        StringBuilder sb = new StringBuilder();

        //Approach 1: O(n^2)
        for(int i=0; i<input.length(); i++) {
            boolean isRepeat = false;
            for (int j=i+1; j<input.length(); j++) {
                if(input.charAt(i) == input.charAt(j)){
                    isRepeat = true;
                    break;
                }
            }
            if (!isRepeat)
                sb.append(input.charAt(i));
        }
        System.out.println("New String: " + sb);

        //Approach 2: O(n)
        sb.delete(0, sb.length());
        char[] arr = input.toCharArray();
        for(int i=0; i<arr.length; i++) {
            int index = input.indexOf(arr[i], i+1);
            if (index == -1)
                sb.append(arr[i]);
        }
        System.out.println("New String: " + sb);
//      -------------------------------------------------------------
        //Correct outputs in below solns.

        //Approach 3
        sb.delete(0, sb.length());
        HashSet<Character> set = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            if (set.add(c)) {
                sb.append(c);
            }
        }
        System.out.println("New String: " + sb);

        //Approach 4:
        sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        System.out.println("New String: " + sb);

        //Approach 5:
        StringBuilder sb1 = new StringBuilder();
        input.chars().distinct().forEach(ch -> sb1.append((char)ch));
        System.out.println("New String: " + sb1);
    }
}
