package com.tnz.business;

import java.io.Serializable;
import java.util.UUID;

public interface SessionManager extends Serializable {
	
	UUID createSession(String userName);
	
	void removeSession(UUID sessionId);
}
