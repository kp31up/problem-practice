package exceptions;

public class CustomGlobalException extends Exception {

    public CustomGlobalException(String message, Exception ex) {
        super(message, ex.getCause());
    }

    public CustomGlobalException(String message) {
        super(message);
    }
}
