package com.nana.bankapp.model;

public class UserRole {

	protected String userRoleId;
	protected String role;

	public UserRole() {
	}

	public UserRole(String userRoleId, String role) {
		super();
		this.userRoleId = userRoleId;
		this.role = role;
	}

	public String getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(String userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
