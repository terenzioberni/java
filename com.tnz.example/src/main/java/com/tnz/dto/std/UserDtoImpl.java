package com.tnz.dto.std;

import com.tnz.dto.UserDto;

public class UserDtoImpl implements UserDto {

	private String userName;
	private String password;

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

}
