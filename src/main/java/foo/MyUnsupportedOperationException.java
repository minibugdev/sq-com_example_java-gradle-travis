package foo;

public class MyUnsupportedOperationException extends Exception {

    public MyUnsupportedOperationException() {
        super();
    }

    public MyUnsupportedOperationException(String message) {
        super(message);
    }

    public MyUnsupportedOperationException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public MyUnsupportedOperationException(Throwable throwable) {
        super(throwable);
    }
}
