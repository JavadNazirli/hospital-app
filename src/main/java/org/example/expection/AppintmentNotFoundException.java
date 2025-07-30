package org.example.expection;

public class AppintmentNotFoundException extends RuntimeException {
    public AppintmentNotFoundException(String message) {
        super(message);
    }
}
