package org.example.Exception;

public class IndexIsNotFoundException extends RuntimeException {
    public IndexIsNotFoundException() {
    }

    public IndexIsNotFoundException(String message) {
        super(message);
    }

    public IndexIsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndexIsNotFoundException(Throwable cause) {
        super(cause);
    }

    public IndexIsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
