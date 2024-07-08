package misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();

        //Sum of cube of all number from 1 to n
        System.out.println("Summation of n^3 = " + sumOfSeries(input));

        //Factorial of n
        System.out.println("Factorial of n = " + findFactorial(input));

        //Print series of factorial
        List<Long> series = factorialSeries(input);
        series.forEach(num -> System.out.print(num + " "));

        sc.close();
    }
    static long sumOfSeries(long n) {
        long sum;
        if(n ==1) {
            return 1;
        }
        sum = sumOfSeries(n-1) + (long)(Math.pow(n, 3));
        return sum;
    }

    static long findFactorial(long num) {
        long fact;
        if (num == 0) {
            return 1;
        }
        fact = num * findFactorial(num -1);
        return fact;
    }

    static ArrayList<Long> factorialSeries(long num) {
        ArrayList<Long> listFact = new ArrayList<>();
        addFactorial(num, listFact);
        return listFact;
    }

    static long addFactorial(long num, ArrayList<Long> list) {
        long fact;
        if (num == 0) {
            return 1;
        }
        fact = num * addFactorial(num -1, list);
        list.add(fact);
        return fact;
    }

}
