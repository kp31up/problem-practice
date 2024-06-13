package misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumber {

    public static  void main(String[] args) {
        int al[] = new int[]{2,55,4,2,47,4};
        System.out.println("The 2nd largest number = " + getSecondLargestNumber(al));
    }

    //Optimal approach: O(n)
    public static int getSecondLargestNumber(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] >secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return (secondLargest == Integer.MIN_VALUE) ? -1: secondLargest;
    }

    // Using stream: O(n logn)
    public static int getNo(int arr[]) {
        List<Integer> list = Arrays.stream(arr).distinct().sorted().boxed().collect(Collectors.toList());
        System.out.println(list);
        if (list.size() == 1) {
            return -1;
        }
        int max = Collections.max(list);
        int maxIndex = list.indexOf(max);

        return (list.get(maxIndex - 1) < max)? list.get(maxIndex - 1) : -1;
    }

    //Brute force: Without sort() method: O(n^2)
    public static int getNumber(int arr[]) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for(int  i=0; i< list.size(); i++) {
            for(int j=i+1; j< list.size(); j++) {
                if(list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        // System.out.println("Sorted list: " + list);
        int maxIndex = list.size()-1;
        for(int k= maxIndex-1 ; k >= 0; k--) {
            if(list.get(k) < list.get(maxIndex)) {
                return list.get(k);
            }
        }
        return -1;
    }
}
