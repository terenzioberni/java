package com.tnz.dal.std;

import java.util.Date;
import java.util.UUID;

import com.tnz.dal.SessionDao;
import com.tnz.model.Session;
import com.tnz.model.std.SessionImpl;

public class SessionDaoImpl implements SessionDao {

	@Override
	public Session create(String userName) {
		SessionImpl session = new SessionImpl();
		
		session.setSessionId(UUID.randomUUID());
		session.setUserName(userName);
		session.setLoginDate(new Date(System.currentTimeMillis()));
		
		return session;
	}
}
