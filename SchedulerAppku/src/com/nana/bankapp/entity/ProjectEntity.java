package com.nana.bankapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_project")
public class ProjectEntity {

	@Id
	@Column(name = "PROJECT_ID")
	protected String projectId;

	@Column(name = "PROJECT_NAME")
	protected String projectName;

	public ProjectEntity() {

	}

	public ProjectEntity(String projectId, String projectName) {
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
