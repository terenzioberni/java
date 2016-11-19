package com.tnz.service.std;

import com.tnz.business.UserUseCase;
import com.tnz.dto.UserDto;
import com.tnz.service.UserService;

public class UserServiceImpl implements UserService {

	/** IOC */
	private UserUseCase userUseCase;

	protected UserUseCase getUserUseCase() {
		return userUseCase;
	}

	public void setUserUseCase(UserUseCase userUseCase) {
		this.userUseCase = userUseCase;
	}

	@Override
	public void create(UserDto dto) {
		userUseCase.create(dto);
	}

}
