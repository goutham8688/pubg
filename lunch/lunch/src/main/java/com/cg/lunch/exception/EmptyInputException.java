package com.cg.lunch.exception;

import org.springframework.stereotype.Component;

@Component
public class EmptyInputException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errormessage;
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public EmptyInputException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmptyInputException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}	
}
