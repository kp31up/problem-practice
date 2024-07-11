package ArrayProblems;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {12, 11, 40, 12, 5, 6, 5, 12, 11};
        int n = arr.length;
        printReverse(arr, n);


    }

    //Space = O(n), time = O(n)
    public static void printReverse(int[] arr, int n) {
        int[] rev = new int[n];
        for (int i=n-1; i>=0; i--) {
            rev[n-i-1] = arr[i];
        }
        System.out.println(Arrays.toString(rev));
    }
}
