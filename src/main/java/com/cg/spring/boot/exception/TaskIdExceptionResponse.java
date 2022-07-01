package com.cg.spring.boot.exception;

/**
 *	 TaskIdExceptionResponse is used to handle exceptions on user.
 */
public class TaskIdExceptionResponse {
	
	private String loginName;

	public TaskIdExceptionResponse(String loginName) {
		super();
		this.loginName = loginName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}	

}

