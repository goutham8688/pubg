package com.cg.lunch.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.lunch.constant.Constant;
import com.cg.lunch.exception.EmailException;
import com.cg.lunch.exception.NoLunchFoundException;
import com.cg.lunch.exception.RecordAlreadyExistException;


public class UserExceptionHandler {

	@ExceptionHandler(NoLunchFoundException.class)
	public ResponseEntity<Object> handleNonExistingEmployee(NoLunchFoundException exception) {
		return new ResponseEntity<>(Constant.PLEASE_ENTER_VALID_USERNAME_PASSWORD, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(RecordAlreadyExistException.class)
	public ResponseEntity<Object> handleNonExistingUser(RecordAlreadyExistException exception) {
		return new ResponseEntity<>("Record already exist!", HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(EmailException.class)
	public ResponseEntity<Object> handleNonExistingUser(EmailException exception) {
		return new ResponseEntity<>("Please Enter Valid Email!", HttpStatus.NOT_FOUND);
	}
}
