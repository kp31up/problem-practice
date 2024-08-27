package interview;

public class PalindromeSpecialChar {

    // Check if the string is a palindrome by ignoring the special characters.

    public static void main(String[] args) {
        String str = "A man, a plan, a canal, Panama!";
        String lower = str.toLowerCase();
        System.out.println("String is palindrome?: " + isPalindrome(lower));

    }

    static boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;

        char left, right;

        while (l <= r) {
            left = str.charAt(l);
            right = str.charAt(r);

            if (!isAlphabet(left)) {
                l++;
                continue;
            }
            if (!isAlphabet(right)) {
                r--;
                continue;
            }
            if (left != right) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    static boolean isAlphabet(char ch) {
        // return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
        // OR
        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            return true;
        } else
            return false;
    }
}
