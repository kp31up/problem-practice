package ArrayProblems;

import java.util.Arrays;

// Given an integer array nums, return an array answer such that answer[i] is equal to
// the product of all the elements of nums except nums[i].
public class ProductOfElements {

    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};

        System.out.println(Arrays.toString(productOfElementsExceptItself(arr)));
    }

    static int[] productOfElementsExceptItself(int[] arr) {
        int n = arr.length;

        // Base case
        if (n == 1) {
            return arr;
        }

        int i, temp = 1;

        /* Allocate memory for the product array */
        int[] prod = new int[n];

        /* Initialize the product array as 1 */
        for (int j = 0; j < n; j++)
            prod[j] = 1;

        /* In this loop, temp variable contains product of elements on left side excluding arr[i] */
        for (i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= arr[i];
        }

        /* Initialize temp to 1 for product on right side */
        temp = 1;

        /* In this loop, temp variable contains product of elements on right side excluding arr[i] */
        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }

        return prod;
    }
}
