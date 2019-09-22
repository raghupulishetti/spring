package com.raghu.dao;

import java.util.List;

import com.raghu.entity.User;

public interface UserDao {
	public int createUser(final User user);

	public List<User> getAllUsers();

	public int deleteUser(final int userId);
}
