package ArrayProblems;

import java.util.*;
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

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("One three", 13);
        map.put("One eight", 18);
        map.put("two two", 22);

        List<Integer> al = getEvenInt(map);

        System.out.println("The even list: " + al);
    }

    // finding the no from map even and greater than ten
    public static List<Integer> getEvenInt(Map<String, Integer> map) {
        List<Integer> list = new ArrayList<>();
        for (int n: map.values()) {
            if (n > 10 && (n%2 == 0)) {
                list.add(n);
            }
        }
        return list;
    }
}
