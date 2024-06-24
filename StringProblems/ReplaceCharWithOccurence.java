package problems.StringProblems;

import java.util.Scanner;
import java.util.stream.Collectors;

public class ReplaceCharWithOccurence {

    public static void main(String[] args) {
        String str = "occurence";
        System.out.print("Enter the char: ");
        Scanner sc = new Scanner(System.in);
        char targetChar = sc.next().charAt(0);
        
        if(str.indexOf(targetChar) == -1) {
            System.out.printf("String '%s' doesn't contain the character %c \n", str, targetChar);
        }
      //Brute force method
        StringBuilder sb = new StringBuilder(str);
        int count = 1;
        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                sb.replace(i, i+1, String.valueOf(count++));
            }
        }
        System.out.println("Final string: "+ sb);
    }
}
