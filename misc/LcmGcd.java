package misc;

import java.util.Arrays;

public class LcmGcd {
    public static void main(String[] args) {
        Long[] arr = lcmAndGcd(120L, 45L);
        Arrays.stream(arr).forEach(element -> System.out.print(element + " "));
    }
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long gcd = getGcd(A, B);

        long lcm = (A*B)/gcd;

        return new Long[]{lcm, gcd};
    }
// the GCD of two numbers remains the same even if the smaller number is subtracted from the larger number.
    static long getGcd(long a, long b) {
        while(a>0 && b>0) {
            if(a > b){
                a = a%b;
            } else{
                b = b%a;
            }
        }
        if(a == 0){
            return b;
        }
        return a;
        /* OR
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;*/
    }
}
