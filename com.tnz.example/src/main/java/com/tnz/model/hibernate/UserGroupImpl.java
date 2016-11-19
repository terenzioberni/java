package com.tnz.model.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.tnz.model.User;
import com.tnz.model.UserGroup;

/**
 * 
 * @author Terenzio
 * 
 */
@Entity
@Table(name = "UserGroup")
public class UserGroupImpl extends EntityImpl implements UserGroup {

	private String code;
	private String description;
	private Set<User> users;

	public UserGroupImpl() {
		this.users = new HashSet<>();
	}

	@Column(nullable = false, unique = true)
	@Override
	public String getCode() {
		return code;
	}

	@Override
	public void setCode(String code) {
		this.code = code;
	}

	@Column(nullable = false)
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "userGroups", targetEntity=UserImpl.class)
	@Override
	public Set<User> getUsers() {
		return users;
	}

	@Override
	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
