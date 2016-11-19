package com.tnz.model;

import java.util.Set;

/**
 * The user of the application
 * 
 * @author terenzio
 * 
 */
public interface User extends Entity {

	String getUserName();

	void setUserName(String userName);

	String getPassword();

	void setPassword(String password);

	Set<UserGroup> getUserGroups();

	void setUserGroups(Set<UserGroup> userGroups);
}
