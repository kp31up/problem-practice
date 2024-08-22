package StringProblems;

import java.util.Arrays;

//Given a string, count the number of words in it. The words are separated by the following characters: space (‘ ‘)
//or new line (‘\n’) or tab (‘\t’) or a combination of these.
public class WordCount {
    static int countWords(String s)
    {
        // code here
        if (s == null || s.isEmpty()) {
            return 0;
        }
        s = s.trim();

        String[] arr = s.split("\\s+");
        System.out.println(Arrays.toString(arr));

        return arr.length;
//        char[] arr = s.toCharArray();
//        int count = 1;
//        for(char ch: arr){
//            if(ch == ' ' || ch == '\t' || ch == '\n'){
//                count++;
//            }
//        }
//        return count;

    }
    public static void main(String[] args){
        String s = "\n m a\typ ";
        System.out.println(countWords(s));
    }
}
