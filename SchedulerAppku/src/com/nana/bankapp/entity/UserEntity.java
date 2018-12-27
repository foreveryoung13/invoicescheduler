package com.nana.bankapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_user")
public class UserEntity {

	@Id
	@Column(name = "USER_ID")
	protected String userId;
	
	@Column(name = "USER_NAME")
	protected String userName;
	
	@Column(name = "PASSWORD")
	protected String password;
	
	@Column(name = "USER_ROLE_ID")
	protected String userRoleId;

	public UserEntity() {
	}

	public UserEntity(String userId, String userName, String password, String userRoleId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userRoleId = userRoleId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(String userRoleId) {
		this.userRoleId = userRoleId;
	}

}
