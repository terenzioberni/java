package com.tnz.dal.hibernate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.tnz.dal.UserDao;
import com.tnz.model.User;

/**
 * 
 * @author terenzio
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext.xml",
		"classpath*:testContext.xml" })
@Transactional
public class UserDaoImplTest extends
		AbstractTransactionalJUnit4SpringContextTests {

	@Test
	public void testCount() {

		UserDao dao = (UserDao) applicationContext.getBean("userDao");

		long cnt = dao.count();

		Assert.assertEquals(0, cnt);
	}

	/**
	 * 
	 */
	@Test
	public void testSave() {
		UserDao dao = (UserDao) applicationContext.getBean("userDao");

		User user = dao.create();
		user.setUserName("TestUserName");
		user.setPassword("UserPassword");

		long cnt = dao.count();
		Assert.assertEquals(0, cnt);

		dao.save(user);

		cnt = dao.count();
		Assert.assertEquals(1, cnt);
	}

	/**
	 * 
	 */
	@Test(expected = Exception.class)
	public void testDuplicateSave() {
		UserDao dao = (UserDao) applicationContext.getBean("userDao");

		User user = dao.create();
		user.setUserName("TestUserName");
		user.setPassword("UserPassword");

		long cnt = dao.count();
		Assert.assertEquals(0, cnt);

		dao.save(user);

		cnt = dao.count();
		Assert.assertEquals(1, cnt);

		User dupl = dao.create();
		dupl.setUserName(user.getUserName());
		dupl.setPassword("AnotherPassword");

		dao.save(dupl);
		// the flush to the db forces the UK constraint violation
		dao.flush();
	}

	/**
	 * 
	 */
	@Test
	public void testFindByUserName() {

		UserDao dao = (UserDao) applicationContext.getBean("userDao");

		String userName = "TestUserName";
		String wrongName = "WrongUserName";

		User user = dao.findByUserName(userName);
		Assert.assertNull(user);
		user = dao.findByUserName(wrongName);
		Assert.assertNull(user);

		// create and save a new user
		User x = dao.create();
		x.setUserName(userName);
		x.setPassword("Password");

		Assert.assertNull(x.getId());
		dao.save(x);
		Assert.assertNotNull(x.getId());

		user = dao.findByUserName(userName);
		Assert.assertNotNull(user);
		Assert.assertEquals(x.getId(), user.getId());
		user = dao.findByUserName(wrongName);
		Assert.assertNull(user);
	}
}
