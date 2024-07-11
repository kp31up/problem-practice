package misc;

import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Logger;

public class BalancedBrackets {
    static Logger log = Logger.getLogger(BalancedBrackets.class.getName());

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sequence = sc.next();
        boolean isValid = checkBraceValidity(sequence.toCharArray());

        if (isValid) {
            log.info("Sequence is VALID!");
        } else
            log.info("Sequence is INVALID!");
        sc.close();
    }

    static boolean checkBraceValidity(char[] charArray) {
        boolean isValid;
        Stack<Character> stack = new Stack<>();
        for (char ch: charArray){
            if (ch == '(' || ch == '[' ||ch == '{') {
                stack.add(ch);
            } else {
                char popped;
                if (!stack.isEmpty()){
                    popped = stack.pop();
                } else
                    return false;
                switch(ch) {
                    case ')':
                        if (popped == '(') {
                            break;
                        } else
                            return false;
                    case ']':
                        if (popped == '[') {
                            break;
                        } else
                            return false;
                    case '}':
                        if (popped == '{') {
                            break;
                        } else
                            return false;
                }
            }
        }
        isValid = stack.isEmpty();

        return isValid;
    }
}
