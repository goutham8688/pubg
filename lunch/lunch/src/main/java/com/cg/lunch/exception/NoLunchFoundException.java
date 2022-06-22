package com.cg.lunch.exception;

@SuppressWarnings("serial")
public class NoLunchFoundException extends RuntimeException{

	public NoLunchFoundException() {
		super();
	}

	public NoLunchFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoLunchFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoLunchFoundException(String message) {
		super(message);
	}

	public NoLunchFoundException(Throwable cause) {
		super(cause);
	}

	
}
