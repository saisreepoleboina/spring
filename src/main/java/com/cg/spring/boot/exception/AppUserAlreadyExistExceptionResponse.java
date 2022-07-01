package com.cg.spring.boot.exception;

/**
 *	 UserAlreadyExistException is used to handle exceptions on user.
 */
public class AppUserAlreadyExistExceptionResponse {
	
	private String loginName;

	public AppUserAlreadyExistExceptionResponse(String loginName) {
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
