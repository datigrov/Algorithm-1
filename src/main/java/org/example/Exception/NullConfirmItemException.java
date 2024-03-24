package org.example.Exception;

public class NullConfirmItemException extends RuntimeException {
    public NullConfirmItemException() {
    }

    public NullConfirmItemException(String message) {
        super(message);
    }

    public NullConfirmItemException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullConfirmItemException(Throwable cause) {
        super(cause);
    }

    public NullConfirmItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
