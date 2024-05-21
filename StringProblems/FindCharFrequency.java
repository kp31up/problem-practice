package StringProblems;

import java.util.Scanner;

public class FindCharFrequency {

        public static void main(String[] args) {
            String input = "abracadabra";
            Scanner sc = new Scanner(System.in);

            char targetChar = sc.next().charAt(0);

            long count = input.toLowerCase().chars()
                    .filter(ch -> ch == targetChar)
                    .count();

            System.out.println("The character '" + targetChar + "' is repeated " + count + " times in the string.");
        }

}
