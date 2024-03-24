package org.example.Exception;

public class UnacceptableIndexException extends RuntimeException {
    public UnacceptableIndexException() {
    }

    public UnacceptableIndexException(String message) {
        super(message);
    }

    public UnacceptableIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnacceptableIndexException(Throwable cause) {
        super(cause);
    }

    public UnacceptableIndexException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
