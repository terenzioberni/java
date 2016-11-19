package com.tnz.business.std;

import static com.tnz.util.StringUtil.isNullOrEmpty;

import org.springframework.transaction.annotation.Transactional;

import com.tnz.business.PasswordGenerator;
import com.tnz.business.UserUseCase;
import com.tnz.dal.UserDao;
import com.tnz.dto.UserDto;
import com.tnz.model.User;

public class UserUseCaseImpl implements UserUseCase {

	/** IOC */
	private UserDao userDao;
	private PasswordGenerator passwordGenerator;

	public UserDao getUserDao() {
		return this.userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public PasswordGenerator getPasswordGenerator() {
		return this.passwordGenerator;
	}

	public void setPasswordGenerator(PasswordGenerator passwordGenerator) {
		this.passwordGenerator = passwordGenerator;
	}

	@Override
	@Transactional(readOnly = false)
	public void create(UserDto dto) {

		if (isNullOrEmpty(dto.getUserName())) {
			throw UserException.UserNameTooShort();
		}
		if (isNullOrEmpty(dto.getPassword())) {
			throw UserException.PasswordTooShort();
		}

		User user = userDao.findByUserName(dto.getUserName());

		if (user != null) {
			throw UserException.UserAlreadyPresent();
		}

		user = userDao.create();
		String generatePassword = passwordGenerator.generate(dto.getUserName(),
				dto.getPassword());

		user.setUserName(dto.getUserName());
		user.setPassword(generatePassword);

		userDao.save(user);
	}
}
