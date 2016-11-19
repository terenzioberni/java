package com.tnz.model.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.tnz.model.User;
import com.tnz.model.UserGroup;

@Entity
@Table(name = "User")
public class UserImpl extends EntityImpl implements User {

	private String userName;
	private String password;
	private Set<UserGroup> userGroups;

	public UserImpl() {
		userGroups = new HashSet<>();
	}

	@Override
	@Column(nullable = false, unique = true)
	public String getUserName() {
		return userName;
	}

	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	@Column(nullable = false)
	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity=UserGroupImpl.class)
	@JoinTable(name = "User_UserGroup", joinColumns = { @JoinColumn(name = "User_Id") }, inverseJoinColumns = { @JoinColumn(name = "UserGroup_Id") })
	@Override
	public Set<UserGroup> getUserGroups() {
		return userGroups;
	}

	@Override
	public void setUserGroups(Set<UserGroup> userGroups) {
		this.userGroups = userGroups;
	}
}
