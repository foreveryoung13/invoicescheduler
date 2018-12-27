package com.nana.bankapp.services;

import java.util.List;

import com.nana.bankapp.model.User;

public interface UserService {

	public boolean saveUser(User user);
	public boolean editUser(User user);
	public List<User> getUsers();
	public User getUser(String userId);
	public boolean deleteUser(String userId);
	
}