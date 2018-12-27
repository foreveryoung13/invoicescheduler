package com.nana.bankapp.dao;

import java.util.List;

import com.nana.bankapp.model.User;

public interface UserDAO {
	
	public boolean saveUser(User user);
	public boolean editUser(User user);
	public List<User> getUsers();
	public User getUser(String userId);
	public boolean deleteUser(String userId);
	
}
