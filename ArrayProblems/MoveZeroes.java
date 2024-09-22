package ArrayProblems;

import java.util.Arrays;

//Moved all the 0’s to the end of an array, and the rest of the elements retain the order at the start.
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {4, 0, 3, 2, 5};
        System.out.println(Arrays.toString(shiftZeroes(arr, arr.length)));
        int[] arr2 = {0, 0, 0, 2};
        System.out.println(Arrays.toString(shiftZeroes(arr2, arr2.length)));
    }
    //Two pointer approach
    private static int[] shiftZeroes(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return arr;
        }
        // find the first element with 0 value
        int l=-1;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                l = i;
                break;
            }
        }
        // return arr if no element = 0
        if(l== -1) {
            return arr;
        }
        // l: pointing to first zero element, r: l+1.
        // If r: non-zero element, swap it with l, and increment l.
        // Move the r pointer to the right till non-zero value is found, swap it with l, and increment l.
        int temp;
        for(int r=l+1; r<n; r++){
            if (arr[r] != 0) {
                temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
            }
        }
        return arr;
    }
}
