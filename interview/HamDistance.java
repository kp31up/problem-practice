package interview;

import java.util.Scanner;

/*
Given two strings of equal length, their Hamming distance is the number of indices where the characters in the two strings differ. For example, the strings abcd and dbca differ at their first and last positions, so their Hamming distance is 2.

Given a string s of length n and an integer k, find the sum of Hamming distances between all pairs of consecutive substrings of length k. Consecutive substrings begin at adjacent characters. For example, consecutive pairs of substrings of length 3 in abcde are (abc, bcd) and (bcd, cde).
Example

Given n = 5 k = 2 and s = abccc, the consecutive substrings of length 2 along with their hamming distances are -

ab and bc = 2
bc and cc = 1
cc and CC = 0

The sum of Hamming distances is 2 + 1 + 0 = 3 so return 3.

Complete the function getHamming DistSum in the editor below.

The function getHamming DistSum has the following parameters:

string s: a string

int k: the length of the substrings

        Return

int: the sum of the Hamming distances of consecutive substrings

Constraints:
        • 1 <= n <=2^ * 10^ 5

        • 1 <= k <= n
 */

public class HamDistance {

    static int getHammingDist(String s, int k) {
//       brute force approach
//       int sum = 0;
//        for (int i = 0; i <= s.length() - k - 1; i++) {
//            sum += hammingDistance(s.substring(i, i + k), s.substring(i + 1, i + k + 1));
//        }
        int diff = hammingDistance(s.substring(0, k), s.substring(1, k + 1));
        int sum = diff;

        // Slide the window and update diff
        for (int i = 1; i <= s.length() - k - 1; i++) {
            // Subtract the Hamming distance of the outgoing character
            diff -= s.charAt(i - 1) == s.charAt(i) ? 0 : 1;
            // Add the Hamming distance of the incoming character
            diff += s.charAt(i + k - 1) == s.charAt(i + k) ? 0 : 1;
            // Accumulate diff
            sum += diff;
        }
       return sum;
    }

    private static int hammingDistance(String s1, String s2) {
        int distance = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        int hamDist = getHammingDist(sc.next(), 2);
        System.out.println(hamDist);
    }
}
