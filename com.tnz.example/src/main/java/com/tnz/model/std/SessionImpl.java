package com.tnz.model.std;

import java.util.Date;
import java.util.UUID;

import com.tnz.model.Session;

public class SessionImpl implements Session {

	private UUID sessionId;
	private String userName;
	private Date loginDate;
	
	@Override
	public UUID getSessionId() {
		return sessionId;
	}
	
	public void setSessionId(UUID sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public Date getLoginDate() {
		return loginDate;
	}
	
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
}
