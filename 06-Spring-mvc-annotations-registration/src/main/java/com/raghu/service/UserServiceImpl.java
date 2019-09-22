package com.raghu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.raghu.dao.UserDao;
import com.raghu.model.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDAO;

	public String registerUser(User user) {
		String status = "User Registration is failure";
		try {
			int count = userDAO.registerUser(user);
			if (count > 0) {
				status = "User Registration is Success";
			}
		} catch (DataAccessException de) {
			status = "Unable to process Your Request!Please Try Again";
		}
		return status;
	}
}
