package misc;

public class PrintWithoutLoop {

    // Recursive function to print numbers from 1 to n
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        printNumbers(100); // Print numbers from 1 to 100
    }
}
