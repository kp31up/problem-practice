package StringProblems;

import java.util.Scanner;

public class RemoveSpecialChars {

    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String newStr = removeCharsFromString(sc.next());
        System.out.println("New String: " + newStr);
    }

    static String removeCharsFromString(String str) {
//        String st = str.replaceAll("[^a-zA-Z0-9]", "");
        String st = str.replaceAll("\\W", "");
        return st;
    }
}
