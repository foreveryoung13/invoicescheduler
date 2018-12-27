package com.nana.bankapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_user_role")
public class UserRoleEntity {

	@Id
	@Column(name = "USER_ROLE_ID")
	protected String userRoleId;

	@Column(name = "ROLE")
	protected String role;

	public UserRoleEntity() {
	}

	public UserRoleEntity(String userRoleId, String role) {
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
