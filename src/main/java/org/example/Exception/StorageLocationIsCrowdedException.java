package org.example.Exception;

public class StorageLocationIsCrowdedException extends RuntimeException {
    public StorageLocationIsCrowdedException() {
    }

    public StorageLocationIsCrowdedException(String message) {
        super(message);
    }

    public StorageLocationIsCrowdedException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageLocationIsCrowdedException(Throwable cause) {
        super(cause);
    }

    public StorageLocationIsCrowdedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
