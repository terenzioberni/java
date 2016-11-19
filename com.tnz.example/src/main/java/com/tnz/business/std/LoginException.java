package com.tnz.business.std;

public class LoginException extends BusinessException {

	private static String EXCEPITON_PREFIX = "LoginException_";
	private static String WRONG_USERNAME = EXCEPITON_PREFIX + "WrongUserName";
	private static String WRONG_PASSWORD = EXCEPITON_PREFIX + "WrongPassword";
	
	private LoginException(String code) {
		super(code);
	}
	
	public static final LoginException WrongUserName() {
		return new LoginException(WRONG_USERNAME);
	}
	
	public static final LoginException WrongPassword() {
		return new LoginException(WRONG_PASSWORD);
	}
	
	public boolean isWrongUserName() {
		return isCode(WRONG_USERNAME);
	}
	
	public boolean isWrongPassword() {
		return isCode(WRONG_PASSWORD);
	}
}
