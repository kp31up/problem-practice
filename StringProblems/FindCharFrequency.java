package StringProblems;

import java.util.Scanner;

public class FindCharFrequency {

        public static void main(String[] args) {
            String input = "abracadabra";
            System.out.println("Select an alphabet from: " + input);

            Scanner sc = new Scanner(System.in);
            char targetChar = sc.next().charAt(0);

            //Solution 1
            long count = input.toLowerCase().chars()
                    .filter(ch -> ch == targetChar)
                    .count();

            System.out.println("The character '" + targetChar + "' is repeated " + count + " times in the string.");

            //Solution 2
            int cnt = 0;
            for(char c: input.toCharArray()) {
                if(c == targetChar)
                    cnt++;
            }
            System.out.println("Count of alphabet = " + cnt);
        }

}
