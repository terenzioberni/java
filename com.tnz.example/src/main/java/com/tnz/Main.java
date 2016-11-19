package com.tnz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tnz.presentation.LoginPresenter;
import com.tnz.presentation.UserPresenter;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = null;

		try {
			context = new ClassPathXmlApplicationContext(
					"applicationContext.xml");

			UserPresenter userPresenter = context.getBean(UserPresenter.class);
			userPresenter.createUser();

			LoginPresenter loginPresenter = context
					.getBean(LoginPresenter.class);

			loginPresenter.Login();
		} finally {
			context.close();
		}
	}
}
