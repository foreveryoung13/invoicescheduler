package com.nana.bankapp.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_project")
public class ProjectEntity {

	@Id
	@Column(name = "PROJECT_ID")
	protected UUID projectId;
	
	@Column(name = "PROJECT_NAME")
	protected String projectName;

	public ProjectEntity() {

	}

	public ProjectEntity(UUID projectId, String projectName) {
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
