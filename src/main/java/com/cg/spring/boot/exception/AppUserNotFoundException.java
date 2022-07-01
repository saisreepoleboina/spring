package com.cg.spring.boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * UserNotFoundException is used to handle exceptions on user.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AppUserNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Create UserNotFoundException object without error message
	 */
	public AppUserNotFoundException() {
		super();
	}
	
	/**
	 * Create UserNotFoundException object with error message
	 */
	public AppUserNotFoundException(String errMsg) {
		super(errMsg);
	}
	
	
}


