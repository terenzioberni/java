package com.tnz.dto;

import java.io.Serializable;

public interface UserDto extends Serializable {

	String getUserName();

	void setUserName(String userName);

	String getPassword();

	void setPassword(String password);
}
