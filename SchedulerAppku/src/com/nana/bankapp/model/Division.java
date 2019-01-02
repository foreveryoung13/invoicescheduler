package com.nana.bankapp.model;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

public class Division {

	private String divisionId;
	
	@NotEmpty(message = "Division Name can't be blank")
	private String divisionName;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;

	public Division() {
	}

	public Division(String divisionId, String divisionName) {
		this.divisionId = divisionId;
		this.divisionName = divisionName;
	}

	public Division(String divisionId, String divisionName, String createdBy, Date createdDate, String updatedBy,
			Date updatedDate) {
		super();
		this.divisionId = divisionId;
		this.divisionName = divisionName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public String getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
