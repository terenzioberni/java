package com.tnz.business;

import java.io.Serializable;

/**
 * 
 * @author Terenzio
 *
 */
public interface PasswordGenerator extends Serializable {

	/**
	 * 
	 * @param userName input from the user at login time
	 * @param password input from the user at login time
	 * @param user information retreived by the system
	 * @return true if the password is correct
	 */
	String generate(String userName, String password);
}
