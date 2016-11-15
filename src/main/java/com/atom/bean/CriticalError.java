package com.atom.bean;

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
