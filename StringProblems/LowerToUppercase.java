package StringProblems;

//convert a small-cased string to all capital case without using in built function in java
public class LowerToUppercase {

    public static void main(String[] args) {
        String str = "lavender";
        StringBuilder sb = new StringBuilder();

        //A-Z: 65-90 & a-z: 97-122
        for(int i=0; i<str.length(); i++) {
            char ch= (char) (str.charAt(i)-32);
            sb.append(ch);

        }
        System.out.println(sb);
    }
}
