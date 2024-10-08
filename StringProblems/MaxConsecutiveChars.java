package StringProblems;

//return starting index, max_count of Maximum consecutive repeating character in string.
//Example: "aabbbbcdAA101aaa" return {2,4} since b char has the max continuous count.
public class MaxConsecutiveChars {
    public static void main(String[] args) {

        String s = "aabbbbcdAA101aaa";

        int [] arr = getMaxPower(s);
        System.out.println("Starting index = " + arr[0] + ", MaxCount= "+ arr[1]);
    }

    private static int[] getMaxPower(String s) {
        int currCount=1, maxCount = 1;
        int startIndex = 0;
        int[] currMaxArray = new int[]{startIndex, maxCount};

        char[] arr = s.toCharArray();

        for (int i=1; i<arr.length; i++) {
            //When current char matches the previous one, increase current Count.
            if(arr[i] == arr[i -1]){
                currCount++;
            } else {   //Otherwise, reset count to 1 & move the startIndex pointer to current index
                currCount = 1;
                startIndex = i;
            }
            //If current count exceeds the max count, update maxCount and store the count & index
            if (currCount > maxCount){
                maxCount = currCount;
                currMaxArray[0] = startIndex;
                currMaxArray[1] = maxCount;
            }
        }
        return currMaxArray;
    }
}
