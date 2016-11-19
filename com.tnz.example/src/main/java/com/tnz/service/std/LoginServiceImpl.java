package com.tnz.service.std;

import java.io.Serializable;
import java.util.UUID;

import com.tnz.business.LoginUseCase;
import com.tnz.dto.UserDto;
import com.tnz.service.LoginService;

public class LoginServiceImpl implements LoginService, Serializable {

	/** IOC */
	private LoginUseCase loginUseCase;
	
	protected LoginUseCase getLoginUseCase() {
		return this.loginUseCase;
	}
	
	public void setLoginUseCase(LoginUseCase loginUseCase) {
		this.loginUseCase = loginUseCase;
	}
	
	@Override
	public UUID Login(UserDto dto) {
		return loginUseCase.login(dto);
	}
	
	@Override
	public void Logout(UUID sessionId) {
		loginUseCase.logout(sessionId);
	}
}
