package com.atom.bean;

/**
 * Created by atom on 15.11.16.
 */
public class CriticalError  extends RuntimeException{

    public CriticalError() {
        super();
    }

    public CriticalError(String message) {
        super(message);
    }

    public CriticalError(String message, Throwable cause) {
        super(message, cause);
    }

    public CriticalError(Throwable cause) {
        super(cause);
    }
}
