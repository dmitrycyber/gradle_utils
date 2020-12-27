package lib.exception;

public class NotNumberException extends RuntimeException {

    public NotNumberException() {
        super();
    }

    public NotNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotNumberException(Throwable cause) {
        super(cause);
    }
}
