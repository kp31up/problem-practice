package exceptions;

import linkedList.SinglyLinearLL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class TestExceptions {

    static Logger log = Logger.getLogger(SinglyLinearLL.class.getName());

    public static void main(String[] args) {
        try {
            String str = readInput();
            log.info("String: "+ str);

            int no = Integer.parseInt(readInput());
            log.info("Integer: " + no);
        } catch (Exception e) {
            log.severe(e.getMessage());
        }
    }

    public static String readInput() throws CustomGlobalException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        try {
            return bfr.readLine();
        } catch (IOException e) {
            throw new CustomGlobalException("Exception caused due to: ", e);
        }
    }
}
