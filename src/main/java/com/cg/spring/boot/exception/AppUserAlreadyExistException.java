package com.cg.spring.boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *UserAlreadyExistException is used to handle exceptions on user.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AppUserAlreadyExistException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Create UserAlreadyExistException object without error message
	 */
	public AppUserAlreadyExistException() {
		super();
	}
	
	/**
	 * Create UserAlreadyExistException object with error message
	 */
	public AppUserAlreadyExistException(String errMsg) {
		super(errMsg);
	}
	
	
}

