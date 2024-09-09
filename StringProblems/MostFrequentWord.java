package StringProblems;

import java.util.*;
import java.util.stream.Collectors;

public class MostFrequentWord {

    public static String mostFrequentWord(String a, String b) {
        // Write your code here.
        String[] arrA = a.split("\\s");
        String[] arrB = b.split("\\s");
        //Identify words not present in String b.
        Map<String, Integer> mapA = new HashMap<>();
        Set<String> setB = new HashSet<>();

        for(String j: arrB){
            setB.add(j);
        }
        int count;
        for(String i: arrA){
            if(setB.contains(i)){
                continue;
            }
            count = 1;
            if(mapA.containsKey(i)){
                mapA.put(i, (mapA.get(i))+1);
            }else{
                mapA.put(i, count);
            }
        }
        if(mapA.size() == 0){
            return "-1";
        }
        //Find most frequent of those words
        int max = mapA.values().stream().max(Integer::compare).orElse(0);
        List<String> list = mapA.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        //Find the lexicographically smallest if count is equal for more than one word
        return list.stream().min(String::compareTo).orElse("-1");
    }

    public static void main(String[] args) {
        // Test cases
        String A = "coding ninjas coding ninjas";
        String B = "data structures and algorithms";
        System.out.println(mostFrequentWord(A, B));  // Output: "coding"

        String A2 = "hello world hello world hello";
        String B2 = "world";
        System.out.println(mostFrequentWord(A2, B2));  // Output: "hello"

        String A3 = "apple apple orange";
        String B3 = "banana";
        System.out.println(mostFrequentWord(A3, B3));  // Output: "e"
    }
}
