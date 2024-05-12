package ArrayProblems;

import java.util.*;
import java.util.stream.Collectors;

//Objective: TO remove all duplicate numbers from an array.
public class RemoveDupNo {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,4,5,4,3};
//        Arrays.sort(arr);

        // Using list: O(n^2)
        boolean flag;
        List<Integer> l1 = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            flag = false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Int repeated= " + arr[j]);
                    flag = true;
                }
            } if(!flag){
                l1.add(arr[i]);
            }
        }
        System.out.println("List: " + l1);

        //Using Set: O(n)
        Set<Integer> set = new HashSet<>();
        for(int i: arr) {
            set.add(i);
        }
        System.out.println("Hashset: "+ set);

        //Using stream:
        List<Integer> list = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
        System.out.println("Stream: " + list);
    }
}
