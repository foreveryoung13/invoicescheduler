package com.nana.bankapp.services;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nana.bankapp.dao.ProjectDAO;
import com.nana.bankapp.model.Project;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectDAO projectDAO;

	@Override
	@Transactional
	public boolean saveProject(Project project) {
		return projectDAO.saveProject(project);
	}

	@Override
	@Transactional
	public boolean editProject(Project project) {
		return projectDAO.editProject(project);
	}

	@Override
	@Transactional
	public List<Project> getProjects() {
		return projectDAO.getProjects();
	}

	@Override
	@Transactional
	public List<Project> pageProjectList(Integer offset, Integer maxResults) {
		return projectDAO.pageProjectList(offset, maxResults);
	}

	@Override
	@Transactional
	public Project getProject(String projectId) {
		return projectDAO.getProject(projectId);
	}

	@Override
	@Transactional
	public boolean deleteProject(String projectId) {
		return projectDAO.deleteProject(projectId);
	}

	@Override
	@Transactional
	public Long count() {
		return projectDAO.count();
	}

}
