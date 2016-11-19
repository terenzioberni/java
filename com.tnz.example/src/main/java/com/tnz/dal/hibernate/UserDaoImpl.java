package com.tnz.dal.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.tnz.dal.UserDao;
import com.tnz.model.User;
import com.tnz.model.hibernate.UserImpl;

@Transactional
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;
	private Class<UserImpl> entityClass = UserImpl.class;

	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public User create() {
		return new UserImpl();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional(readOnly = true)
	public User findByUserName(String userName) {
		Criteria c = getSession().createCriteria(entityClass);
		c.add(Restrictions.eq("userName", userName));

		List<?> list = c.list();

		if (list.size() == 1) {
			return (User) list.get(0);
		}
		
		return null;
	}

	@Override
	@Transactional(readOnly = false)
	public void save(User user) {
		getSession().saveOrUpdate(user);
	}

	@Override
	@Transactional(readOnly = true)
	public long count() {
		Session s = getSession();
		Criteria c = s.createCriteria(UserImpl.class);
		c.setProjection(Projections.rowCount());

		Object r = c.uniqueResult();

		long result = 0;
		if (r != null && r instanceof Long) {
			result = (Long) r;
		}

		return result;
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void flush() {
		getSession().flush();
	}

}
