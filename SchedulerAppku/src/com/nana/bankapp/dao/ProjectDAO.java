package com.nana.bankapp.dao;

import java.util.List;
import java.util.UUID;

import com.nana.bankapp.model.Project;

public interface ProjectDAO {

	public boolean saveProject(Project project);
	public boolean editProject(Project project);
	public List<Project> getProjects();
	public Project getProject(UUID projectId);
	public boolean deleteProject(UUID projectId);

}