package ArrayProblems;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {12, 11, 40, 12, 5, 6, 5, 12, 11};
        int n = arr.length;
        printReverse(arr, n);

        System.out.println(Arrays.toString(getReversedBySwap(arr, n)));

        int[] arrEven = {35, 1, 56, 36, 6, 1, 21, 13, 73, 2};
        getReversedByRecursion(arrEven, 0, arrEven.length-1);
        System.out.println(Arrays.toString(arrEven));
    }

    //Space = O(n), time = O(n)
    public static void printReverse(int[] arr, int n) {
        int[] rev = new int[n];
        for (int i=n-1; i>=0; i--) {
            rev[n-i-1] = arr[i];
        }
        System.out.println(Arrays.toString(rev));
    }

    //SWAP: Space = O(1), time = O(n)
    static int[] getReversedBySwap(int[] arr, int n) {
        int temp;
        for (int i=0, j=n-1; i<j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    //RECURSION: Space = O(1), time = O(n)
    static void getReversedByRecursion(int[] arr, int l, int r) {
        if (l == r || l > r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        getReversedByRecursion(arr, l+1, r-1);
    }
}
