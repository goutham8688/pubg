package com.cg.lunch.exception;

public class EmailException extends RuntimeException{

	public EmailException() {
		super();

	}

	public EmailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public EmailException(String message, Throwable cause) {
		super(message, cause);

	}

	public EmailException(String message) {
		super(message);

	}

	public EmailException(Throwable cause) {
		super(cause);

	}

}