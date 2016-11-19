package com.tnz.business.std;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.tnz.business.SessionManager;
import com.tnz.dal.SessionDao;
import com.tnz.model.Session;

public class SessionManagerImpl implements SessionManager {

	/** Status */
	private Map<UUID, Session> sessions;

	/** IOC */
	private SessionDao sessionDao;

	protected SessionDao getSessionDao() {
		return this.sessionDao;
	}

	public void setSessionDao(SessionDao sessionDao) {
		this.sessionDao = sessionDao;
	}

	/** Constructor */
	public SessionManagerImpl() {
		sessions = new HashMap<UUID, Session>();
	}

	@Override
	public UUID createSession(String userName) {
		Session session = sessionDao.create(userName);

		sessions.put(session.getSessionId(), session);

		return session.getSessionId();
	}

	@Override
	public void removeSession(UUID sessionId) {
		sessions.remove(sessionId);
	}
}
