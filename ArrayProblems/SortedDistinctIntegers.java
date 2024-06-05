package ArrayProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortedDistinctIntegers {

    public static void main(String[] args) {
        int[] arr = new int[]{-1,3,-4,0,7,9,-1,3};

        List<Integer> list = Arrays.stream(arr).distinct().sorted().boxed().collect(Collectors.toList());
        System.out.println("Through stream: " + list);

        Set<Integer> set = new TreeSet<>();
        for (int i: arr) {
            set.add(i);
        }
        System.out.println("Final list: " + set);
    }
}
