package com.tnz.model;

import java.util.Set;

public interface UserGroup extends Entity {

	String getCode();

	void setCode(String code);

	String getDescription();

	void setDescription(String description);
	
	Set<User> getUsers();
	
	void setUsers(Set<User> users);
}
