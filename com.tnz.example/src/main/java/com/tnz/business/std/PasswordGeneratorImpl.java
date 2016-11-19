package com.tnz.business.std;

import com.tnz.business.PasswordGenerator;

/**
 * Dummy implementation of the PasswordChecker
 * 
 * @author Terenzio
 * 
 */
public class PasswordGeneratorImpl implements PasswordGenerator {

	@Override
	public String generate(String userName, String password) {
		return password;
	}
}
