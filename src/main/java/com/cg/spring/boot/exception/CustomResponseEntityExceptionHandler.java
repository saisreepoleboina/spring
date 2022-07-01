package com.cg.spring.boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler
	public final ResponseEntity<Object> handleTaskIdException(TaskIdException ex, WebRequest request) {

		TaskIdExceptionResponse exceptionResponse = new TaskIdExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}

	
	@ExceptionHandler
	public final ResponseEntity<Object> handleUserNotFoundException(AppUserNotFoundException ex,
			WebRequest request) {

		AppUserNotFoundExceptionResponse exceptionResponse = new AppUserNotFoundExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}


	@ExceptionHandler
	public final ResponseEntity<Object> handleUserAlreadyExistException(AppUserAlreadyExistException ex, WebRequest request){		
		AppUserAlreadyExistExceptionResponse exceptionResponse=new AppUserAlreadyExistExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(exceptionResponse,HttpStatus.BAD_REQUEST);
	}

}
