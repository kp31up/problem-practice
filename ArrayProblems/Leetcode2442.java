package ArrayProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Leetcode2442 {

    public static int countDistinctIntegers(int nums[]) {
        List<Integer> integerList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        for(int i: integerList) {
            
        }
        System.out.println(integerList);
        return 6;
    }
}
