package com.nana.bankapp.model;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

public class Project {

	protected String projectId;
	
	@NotEmpty(message = "Project Name can't be blank")
	protected String projectName;
	protected String createdBy;
	protected Date createdDate;
	protected String updatedBy;
	protected Date updatedDate;

	public Project() {

	}

	public Project(String projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}

	public Project(String projectId, String projectName, String createdBy, Date createdDate, String updatedBy,
			Date updatedDate) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
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
