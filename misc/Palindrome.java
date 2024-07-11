package misc;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int original = sc.nextInt();
        boolean isPalin = original == isPalindrome(original);
        System.out.println("Is it a palindrome?  : " + isPalin);
    }
    public static int isPalindrome(int x) {
        int pd = 0;
        while(x > 0){
            int digit = x%10;
            pd = pd*10 + digit;
            x = x/10;
        }
        return pd;
    }
}
