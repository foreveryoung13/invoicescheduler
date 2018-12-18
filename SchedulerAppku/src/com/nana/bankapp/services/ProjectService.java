package com.nana.bankapp.services;

import java.util.List;

import com.nana.bankapp.model.Project;

public interface ProjectService {

	public boolean saveProject(Project project);
	public boolean editProject(Project project);
	public List<Project> getProjects();
	public Project getProject(String projectId);
	public boolean deleteProject(String projectId);
	
}