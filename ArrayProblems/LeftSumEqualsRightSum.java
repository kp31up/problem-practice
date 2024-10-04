package ArrayProblems;

import java.util.Arrays;
import java.util.List;

// From a given list of integers find the index at which the sum of left elements = sum of right elements.
public class LeftSumEqualsRightSum {

    public static void main(String[] args) {
        //1,2,3,9,4,2 and 1,2,-2
        List<Integer> list = Arrays.asList(1,2,3,9,4,2);
        int n = list.size();
        int[] left = new int[n];
        int[] right = new int[n];

        int sum=0;
        for (int i=0; i< n; i++) {
            left[i] = sum;
            sum += list.get(i);
        }
        System.out.println(Arrays.toString(left));

        sum = 0;
        for (int i=n-1; i>0; i--) {
            right[i] = sum;
            sum += list.get(i);
        }
        System.out.println(Arrays.toString(right));

        for(int i=0; i< left.length; i++){
            if( left[i] == right[i]) {
                System.out.print("Index: "+ i);
            }
        }
    }
}
