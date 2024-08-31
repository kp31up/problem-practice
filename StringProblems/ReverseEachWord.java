package StringProblems;

public class ReverseEachWord {

    static String getReversedWords(String sent) {
        String[] strArr = sent.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str: strArr) {
            sb.append(reversed(str)).append(" ");
        }
        return sb.toString().trim();
    }

    //Method to reverse a string
    static String reversed(String s) {
        char[] arr = s.toCharArray();
        char temp;
        for (int left=0, right=s.length()-1; left<right; left++, right--) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        return String.valueOf(arr);
    }

    //Reverse Each Word In Given String
    public static void main(String[] args) {
        String sent = "He has a plant";

        System.out.println(getReversedWords(sent));
    }
}
