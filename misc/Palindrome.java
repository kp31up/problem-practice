package misc;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int original = sc.nextInt();
        boolean isPalin = original == isNumberPalindrome(original);
        System.out.println("Is the number a palindrome?  : " + isPalin);


        System.out.print("Enter string: ");
        int check = isStringPalindrome(sc.next());
        System.out.println("Is the string a palindrome?  : " + ((check == 1)? "True" : "False"));

        sc.close();
    }
    public static int isNumberPalindrome(int x) {
        int pd = 0;
        while(x > 0){
            int digit = x%10;
            pd = pd*10 + digit;
            x = x/10;
        }
        return pd;
    }
    // can also be used for number palindrome by using String.valueOf() method
    static int isStringPalindrome(String s) {
        int len = s.length();
        int isP = 1;
        for (int i=0, j=len-1; i<=j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                isP = 0;
            }
        }
        return isP;
    }
}
