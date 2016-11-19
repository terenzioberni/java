package com.tnz.service;

import java.util.UUID;

import com.tnz.dto.UserDto;

public interface LoginService {

	UUID Login(UserDto dto);
	
	void Logout(UUID sessionId);
}
