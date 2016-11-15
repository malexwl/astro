package com.atom.bean;

public class WarnError extends RuntimeException {
    public WarnError() {
        super();
    }

    public WarnError(String message) {
        super(message);
    }

    public WarnError(String message, Throwable cause) {
        super(message, cause);
    }

    public WarnError(Throwable cause) {
        super(cause);
    }
}
