package ArrayProblems;

//Given a sorted and rotated array of n distinct elements, the task is to find the index of given element in the array.
// If target element is not present in the array, return -1.
public class RotatedArraySearch {
    private static int searchIndex(int[] arr, int target) {
        int l=0, r = arr.length-1;

        while (l <= r) {
            int mid = (l+r)/2;
            // Case 1: If the middle element is the target
            if (target == arr[mid])
                return mid;
            // Case 2: Left half is sorted
            if (arr[l] <= arr[mid]) {
                // If the target is in the sorted left half
                if (target >= arr[l] && target < arr[mid])
                    r = mid - 1;
                else
                    l = mid + 1;
            }
            // Case 3: Right half is sorted
            else {
                // If the target is in the sorted right half
                if (target > arr[mid] && target <= arr[r])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr1 = { 4, 5, 6, 7, 0, 1, 2, 3};
        int target1 = 2;
        int result1 = searchIndex(arr1, target1);
        System.out.println(result1); // Output: 4

        int[] arr2 = { 4, 5, 6, 7, 0, 1, 2 };
        int target2 = 3;
        int result2 = searchIndex(arr2, target2);
        System.out.println(result2); // Output: -1
    }
}
