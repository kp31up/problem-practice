package StringProblems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();           // Imp testcase: 1534236469
        long num;
        if (x<0) {
            x = Math.abs(x);
            num = -revNum(x);
        } else {
            num = revNum(x);
        }
        System.out.println("reversed = " + num);
    }

    public static long revNum(long x) {
        long num = 0;
        long divisor = 10L;
        while(x > 0) {
            num = num*divisor + x%divisor;
            x = x/10;
        }
        return num;
    }

    ////////// Using string
    public int reversed(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    ///////// Using Stack
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (
                    rev > Integer.MAX_VALUE / 10 ||
                            (rev == Integer.MAX_VALUE / 10 && pop > 7)
            ) return 0;
            if (
                    rev < Integer.MIN_VALUE / 10 ||
                            (rev == Integer.MIN_VALUE / 10 && pop < -8)
            ) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
