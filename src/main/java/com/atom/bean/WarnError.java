package com.atom.bean;

/**
 * Created by atom on 15.11.16.
 */
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
