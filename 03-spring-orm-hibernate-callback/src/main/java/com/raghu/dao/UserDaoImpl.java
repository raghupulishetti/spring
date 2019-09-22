package com.raghu.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.raghu.entity.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public int deleteUser(final int userId) {
		int count = hibernateTemplate.execute(new HibernateCallback<Integer>() {
			public Integer doInHibernate(Session session) {
				String hql = "delete from com.raghu.entity.User as u where u.userId=:userId1";
				Query query = session.createQuery(hql);
				query.setParameter("userId1", userId);
				int count1 = query.executeUpdate();
				return count1;
			}// end of doInHibernate
		});// end of AIC and execute

		return count;
	}

	public List<User> getAllUsers() {
		List<User> list = hibernateTemplate.execute(new HibernateCallback<List<User>>() {
			public List<User> doInHibernate(Session session) {
				Criteria criteria = session.createCriteria(User.class);
				List<User> list = criteria.list();
				return list;
			}// end of doInHibernate
		});// end of AIC and execute
		return list;
	}

	public int createUser(final User user) {
		int count = hibernateTemplate.execute(new HibernateCallback<Integer>() {
			public Integer doInHibernate(Session session) {
				String sql = "insert into User values(?,?,?,?,?)";
				SQLQuery query = session.createSQLQuery(sql);
				query.setParameter(0, user.getUserId());
				query.setParameter(1, user.getFirstName());
				query.setParameter(2, user.getLastName());
				query.setParameter(3, user.getEmail());
				query.setParameter(4, user.getMobile());
				int count = query.executeUpdate();
				return count;
			}
		});
		return count;
	}

}
