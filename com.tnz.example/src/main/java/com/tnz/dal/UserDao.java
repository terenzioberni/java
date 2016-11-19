package com.tnz.dal;

import com.tnz.model.User;

/**
 * 
 * @author terenzio
 *
 */
public interface UserDao {
	
	User create();

	User findByUserName(String userName);
	
	void save(User user);
	
	long count();
	
	void flush();
}
