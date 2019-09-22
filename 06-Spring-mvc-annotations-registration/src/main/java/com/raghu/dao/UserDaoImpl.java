package com.raghu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.raghu.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int registerUser(User user) {
		String sql = "insert into User_Details values(?,?,?,?)";
		int count = jdbcTemplate.update(sql, user.getUserId(), user.getName(), user.getEmail(), user.getMobile());
		return count;
	}

}
