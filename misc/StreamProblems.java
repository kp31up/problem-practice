package misc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProblems {

    public static void main(String[] args) {

        // ----------------Number operations---------------------------
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double average = nums.stream().mapToInt(Integer::intValue).average().orElse(0D);

        int max = nums.stream().max(Integer::compare).orElse(null);
        int min = nums.stream().min(Integer::compare).orElse(null);

        List<Integer> range = nums.stream().filter(i -> i > 3 && i < 8).collect(Collectors.toList());
        int sumOfOddNums = nums.stream().filter(i -> i % 2 != 0).mapToInt(Integer::intValue).sum();

        int thirdSmallestNum = nums.stream().distinct().sorted().skip(2).findFirst().orElseThrow(() -> new RuntimeException("List size < 3"));

        List<Integer> highestThreeNums = nums.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());

        //Multiplying All the elements of the list by 3 and returning the updated list
        List<Integer> multiplyByThree = nums.stream().map(i -> i*3).toList();

        System.out.println("Number operation: " + highestThreeNums + " " + multiplyByThree);

        //----------------String operations---------------------------
        String str = "sparring";

        boolean isPresent = str.chars().anyMatch(ch -> ch == 'i');
        System.out.println("Is i present in "+ str +"? "+ isPresent);

        List<String> list = Arrays.asList("RED", "grEEn", "white", "Orange", "pink", "Blue", "Brown");

        //.collect(Collectors.toList()) : replaced by toList() in post Java 16 versions.
        List<String> uppercase = list.stream().map(String::toUpperCase).toList();

        //Count of strings starting with B
        long startsWithB = list.stream().filter(s -> s.startsWith("B")).count();

        System.out.println("String operation: " + startsWithB);

        //get the 1st Character of all the Strings present in a List and returning the result in form of a stream.
        list.stream()
                .flatMap(word -> Stream.of(word.charAt(0)))
                .forEach(System.out::println);

        //-----------Find the closest number to a target
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Define the target number
        int target = 25;

        // Find the closest number
        int closestNumber = numbers.stream()
                .min((n1, n2) -> Integer.compare(Math.abs(n1 - target), Math.abs(n2 - target)))
                .orElseThrow(() -> new IllegalArgumentException("List is empty"));

        // Print the closest number
        System.out.println("The closest number to " + target + " is " + closestNumber);
    }
}
