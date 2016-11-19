package com.tnz.business.std;

public class UserException extends BusinessException {

	private static String EXCEPITON_PREFIX = "UserException_";
	private static String USERNAME_TOO_SHORT = EXCEPITON_PREFIX
			+ "UserNameTooShort";
	private static String PASSWORD_TOO_SHORT = EXCEPITON_PREFIX
			+ "PasswordTooShort";

	private static String USER_ALREADY_PRESENT = EXCEPITON_PREFIX
			+ "UserAlreadyPresent";

	private UserException(String code) {
		super(code);
	}

	public static final UserException UserNameTooShort() {
		return new UserException(USERNAME_TOO_SHORT);
	}

	public static final UserException PasswordTooShort() {
		return new UserException(PASSWORD_TOO_SHORT);
	}

	public static final UserException UserAlreadyPresent() {
		return new UserException(USER_ALREADY_PRESENT);
	}

	public boolean isUserNameTooShort() {
		return isCode(USERNAME_TOO_SHORT);
	}

	public boolean isPasswordTooShort() {
		return isCode(PASSWORD_TOO_SHORT);
	}

	public boolean isUserAlreadyPresent() {
		return isCode(USER_ALREADY_PRESENT);
	}
}
