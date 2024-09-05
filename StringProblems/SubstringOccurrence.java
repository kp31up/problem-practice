package StringProblems;

public class SubstringOccurrence {

    public static void main(String[] args) {
        String mainString = "hello hello hello";
        String subString = "hello";

        int count = countOccurrences(mainString, subString);
        System.out.println("The substring '" + subString + "' occurs " + count + " times in the main string.");
    }

    public static int countOccurrences(String mainString, String subString) {
        int count = 0;
        int index = 0;

        // Loop through the main string to find all occurrences of the substring
        while (( mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length(); // Move the index forward to continue searching
        }

        return count;
    }
}
