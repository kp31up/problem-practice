package StringProblems;

// https://leetcode.com/problems/string-compression/description/
public class CompressString {

    public static void main(String[] args) {
        char[] chars = new char[]{'a', 'b','b', 'c','c','c'};

        String compressedStr = compress(chars);
        System.out.println(compressedStr+" has length = "+ compressedStr.length());

    }

    public static String compress(char[] chars) {
        int charPos = 0;
        int start=0, end=0;

        while (end < chars.length) {
            end += 1;
            while (end < chars.length && chars[start] == chars[end]){
                end++;
            }
            chars[charPos++] = chars[start];
            int count = end-start;
            if(count > 1) {
                String countStr = String.valueOf(count);
                for(char c: countStr.toCharArray()){
                    chars[charPos++] = c;
                }
            }
            start = end;
        }
        return new String(chars);
    }
}
