package com.nana.bankapp.model;

import java.util.UUID;

public class Project {

	protected UUID projectId;
	protected String projectName;

	public Project() {

	}

	public Project(UUID projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}

	public UUID getProjectId() {
		return projectId;
	}

	public void setProjectId(UUID projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
