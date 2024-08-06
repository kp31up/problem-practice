package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr =  new int[]{1,2,3,4,5,6,7};
        int n = arr.length;
        System.out.println("Input array: " + Arrays.toString(arr));

        System.out.println("Enter no. of position to rotate by: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        k = k % n;      //when k > length of array

        printCopy(arr, k, n);
        rotateLeft(arr, k, n);
    }

    //Space complexity: O(1)
    private static void rotateLeft(int[] arr, int k, int n) {
        // reverse first k elements
        reverseArray(arr, 0, k-1);
        System.out.println("reverse first k elements array: " + Arrays.toString(arr));

        // reverse last n-k elements
        reverseArray(arr, k, n-1);
        System.out.println("reverse first n-k elements array: " + Arrays.toString(arr));

        // reverse all elements
        reverseArray(arr, 0, n-1);
        System.out.println("Left rotated array: " + Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int l, int r) {
        if (l==r || l>r)
            return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArray(arr, l+1, r-1);
    }

    //Space complexity: O(n)
    private static void printCopy(int[] arr, int k, int n) {
        if (n == 0)
            return;
        int[] copy = Arrays.copyOf(arr, n);

        for (int i=0; i<arr.length; i++) {
            if (i <= n - k - 1)
                copy[i + k] = arr[i];
            else
                copy[i + k - n] = arr[i];
        }
        System.out.println("Right rotated array: " + Arrays.toString(copy));
    }
}
