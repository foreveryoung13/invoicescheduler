package com.nana.bankapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nana.bankapp.entity.UserEntity;
import com.nana.bankapp.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveUser(User user) {
		boolean saveFlag = true;

		UserEntity ue = new UserEntity();
		ue.setUserId(UUID.randomUUID().toString());
		ue.setUserName(user.getUserName());
		ue.setPassword(user.getPassword());
		ue.setUserRoleId(user.getUserRoleId());
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(ue);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public boolean editUser(User user) {
		boolean saveFlag = true;

		UserEntity ue = new UserEntity();
		ue.setUserId(UUID.randomUUID().toString());
		ue.setUserName(user.getUserName());
		ue.setPassword(user.getPassword());
		ue.setUserRoleId(user.getUserRoleId());
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.update(ue);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<UserEntity> query = session.createQuery("FROM UserEntity", UserEntity.class);
			List<UserEntity> users = query.getResultList();

			for (int i = 0; i < users.size(); i++) {
				UserEntity userEntity = (UserEntity) users.get(i);
				User te = new User();
				te.setUserId(userEntity.getUserId());
				te.setUserName(userEntity.getUserName());
				te.setPassword(userEntity.getPassword());
				te.setUserRoleId(userEntity.getUserRoleId());
				list.add(te);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public User getUser(String userId) {
		User user = new User();
		try {
			Session session = sessionFactory.getCurrentSession();
			UserEntity ue = (UserEntity) session.load(UserEntity.class, userId);
			user.setUserId(ue.getUserId());
			user.setUserName(ue.getUserName());
			user.setPassword(ue.getPassword());
			user.setUserRoleId(ue.getUserRoleId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean deleteUser(String userId) {
		boolean deleteFlag = true;
		try {
			Session session = sessionFactory.getCurrentSession();
			UserEntity ce = (UserEntity) session.load(UserEntity.class, userId);
			session.delete(ce);
		} catch (Exception e) {
			e.printStackTrace();
			deleteFlag = false;
		}
		return deleteFlag;
	}

}
