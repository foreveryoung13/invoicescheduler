package com.nana.bankapp.model;

public class Project {

	protected String projectId;
	protected String projectName;

	public Project() {

	}

	public Project(String projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
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

}
