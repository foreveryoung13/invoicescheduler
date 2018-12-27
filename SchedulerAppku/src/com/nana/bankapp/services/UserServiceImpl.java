package com.nana.bankapp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nana.bankapp.dao.UserDAO;
import com.nana.bankapp.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;

	@Override
	@Transactional
	public boolean saveUser(User user) {
		return userDAO.saveUser(user);
	}

	@Override
	@Transactional
	public boolean editUser(User user) {
		return userDAO.editUser(user);
	}

	@Override
	@Transactional
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	@Override
	@Transactional
	public User getUser(String userId) {
		return userDAO.getUser(userId);
	}

	@Override
	@Transactional
	public boolean deleteUser(String userId) {
		return userDAO.deleteUser(userId);
	}

}
