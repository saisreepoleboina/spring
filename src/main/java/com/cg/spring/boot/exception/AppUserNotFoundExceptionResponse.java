package com.cg.spring.boot.exception;

/**
 *	 UserNotFoundExceptionResponse is used to handle exceptions on user.
 */
public class AppUserNotFoundExceptionResponse {
	
	private String loginName;

	public AppUserNotFoundExceptionResponse(String loginName) {
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

