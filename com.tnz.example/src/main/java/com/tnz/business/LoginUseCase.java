package com.tnz.business;

import java.io.Serializable;
import java.util.UUID;

import com.tnz.dto.UserDto;

public interface LoginUseCase extends Serializable {

	UUID login(UserDto dto);

	void logout(UUID sessionId);
}
