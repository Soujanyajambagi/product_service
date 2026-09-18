package com.dcl.exception;

import org.springframework.http.HttpStatus;

public class AppException extends RuntimeException{
	
	private HttpStatus httpStatus;
	
	public AppException(String message,HttpStatus httpstatus) {
		super(message);
		this.httpStatus=httpstatus;
	}
	
	public HttpStatus gethttpStatus() {
		return httpStatus;
	}

}
