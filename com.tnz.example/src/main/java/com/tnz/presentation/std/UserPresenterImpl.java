package com.tnz.presentation.std;

import com.tnz.business.std.UserException;
import com.tnz.dto.UserDto;
import com.tnz.dto.std.UserDtoImpl;
import com.tnz.presentation.UserPresenter;
import com.tnz.service.UserService;

public class UserPresenterImpl extends ConsoleIOPresenter implements
		UserPresenter {

	/** IOC */
	private UserService userService;

	protected UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void createUser() {

		Begin();

		UserDto dto = new UserDtoImpl();

		dto.setUserName(read("Enter user name"));
		dto.setPassword(read("Enter password"));
		try {
			userService.create(dto);
			
			End();
		} catch (UserException e) {
			if (e.isPasswordTooShort()) {
				System.out.println("Please retry and enter a longer password");
			}
			if (e.isUserNameTooShort()) {
				System.out.println("Prease retry and enter a long user name");
			}
			if (e.isUserAlreadyPresent()) {
				System.out.println("Please change user name and retry");
			}
		}
	}
}
