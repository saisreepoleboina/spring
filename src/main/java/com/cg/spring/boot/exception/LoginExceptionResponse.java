package com.cg.spring.boot.exception;

public class LoginExceptionResponse {
	private String loginName;

	public LoginExceptionResponse(String loginName) {
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

