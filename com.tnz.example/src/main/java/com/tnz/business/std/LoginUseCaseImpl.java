package com.tnz.business.std;

import java.util.UUID;

import com.tnz.business.LoginUseCase;
import com.tnz.business.PasswordGenerator;
import com.tnz.business.SessionManager;
import com.tnz.dal.UserDao;
import com.tnz.dto.UserDto;
import com.tnz.model.User;

public class LoginUseCaseImpl implements LoginUseCase {

	/** IOC */
	private UserDao userDao;
	private SessionManager sessionManager;
	private PasswordGenerator passwordGenerator;

	protected UserDao getUserDao() {
		return this.userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	protected SessionManager getSessionManager() {
		return this.getSessionManager();
	}

	public void setSessionManager(SessionManager sessionManager) {
		this.sessionManager = sessionManager;
	}

	protected PasswordGenerator getPasswordGenerator() {
		return passwordGenerator;
	}

	public void setPasswordGenerator(PasswordGenerator passwordGenerator) {
		this.passwordGenerator = passwordGenerator;
	}

	@Override
	public UUID login(UserDto dto) {
		String userName = dto.getUserName();
		String password = dto.getPassword();

		User user = userDao.findByUserName(userName);
		if (user == null) {
			throw LoginException.WrongUserName();
		}

		String generatedPassword = passwordGenerator.generate(userName,
				password);

		if (!generatedPassword.equals(user.getPassword())) {
			throw LoginException.WrongPassword();
		}

		return sessionManager.createSession(userName);
	}

	@Override
	public void logout(UUID sessionId) {
		sessionManager.removeSession(sessionId);
	}
}
