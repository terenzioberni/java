package com.tnz.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public interface Session extends Serializable {

	public UUID getSessionId();
	
	public String getUserName();
	
	public Date getLoginDate();
}
