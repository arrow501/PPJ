package PPJ21.StackExceptions;

public class StackFullException extends RuntimeException {
    public StackFullException(String message) {
        super(message);
    }
}