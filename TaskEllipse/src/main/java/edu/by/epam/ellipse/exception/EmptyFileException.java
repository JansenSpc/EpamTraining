package edu.by.epam.ellipse.exception;

public class EmptyFileException extends Exception {
    public EmptyFileException() {

    }

    public EmptyFileException(String message) {
        super(message);
    }

    public EmptyFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyFileException(Throwable cause) {
        super(cause);
    }
}
