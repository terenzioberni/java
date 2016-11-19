package com.tnz.presentation.std;

import java.util.UUID;

import com.tnz.business.std.LoginException;
import com.tnz.dto.UserDto;
import com.tnz.dto.std.UserDtoImpl;
import com.tnz.presentation.LoginPresenter;
import com.tnz.service.LoginService;

public class LoginPresenterImpl extends ConsoleIOPresenter implements
		LoginPresenter {

	private static final String SESSION_ID_KEY = "#SessionId#";

	/** IOC */
	private LoginService loginService;

	protected LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@Override
	public void Login() {
		Begin();

		UserDto dto = new UserDtoImpl();

		dto.setUserName(read("Enter user name"));
		dto.setPassword(read("Enter password"));

		try {
			UUID sessionId = loginService.Login(dto);
			getPresentationContext().put(SESSION_ID_KEY, sessionId);
		} catch (LoginException e) {
			System.out.println("Invalid account");
		}

		End();
	}

	@Override
	public void Logout() {
		UUID sessionId = (UUID) getPresentationContext().get(SESSION_ID_KEY);
		if (sessionId == null) {
			return;
		}

		loginService.Logout(sessionId);
	}
}
