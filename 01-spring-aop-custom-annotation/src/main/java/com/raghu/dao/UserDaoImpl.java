package com.raghu.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raghu.bean.ConvertToJson;
import com.raghu.entity.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public int createUser(User user) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Integer userId = (Integer) session.save(user);
		tx.commit();
		session.close();
		return userId;
	}

	@ConvertToJson
	public List<User> getAllUsers() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		List<User> list = criteria.list();
		session.close();
		return list;
	}

}
