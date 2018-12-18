package com.nana.bankapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nana.bankapp.entity.ProjectEntity;
import com.nana.bankapp.model.Project;

@Repository
public class ProjectDAOImpl implements ProjectDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveProject(Project project) {
		boolean saveFlag = true;
		ProjectEntity pe = new ProjectEntity();
		pe.setProjectId(UUID.randomUUID().toString());
		pe.setProjectName(project.getProjectName());
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(pe);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public boolean editProject(Project project) {
		boolean saveFlag = true;
		ProjectEntity pe = new ProjectEntity();
		pe.setProjectId(project.getProjectId());
		pe.setProjectName(project.getProjectName());
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.update(pe);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public List<Project> getProjects() {
		List<Project> list = new ArrayList<Project>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<ProjectEntity> query = session.createQuery("FROM ProjectEntity", ProjectEntity.class);
			List<ProjectEntity> projects = query.getResultList();

			for (int i = 0; i < projects.size(); i++) {
				ProjectEntity projectEntity = (ProjectEntity) projects.get(i);
				Project pe = new Project();
				pe.setProjectId(projectEntity.getProjectId());
				pe.setProjectName(projectEntity.getProjectName());
				list.add(pe);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Project getProject(String projectId) {
		Project pr = new Project();
		try {
			Session session = sessionFactory.getCurrentSession();
			ProjectEntity pe = (ProjectEntity) session.load(ProjectEntity.class, projectId);
			pr.setProjectId(pe.getProjectId());
			pr.setProjectName(pe.getProjectName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pr;
	}

	@Override
	public boolean deleteProject(String projectId) {
		boolean deleteFlag = true;
		try {
			Session session = sessionFactory.getCurrentSession();
			ProjectEntity ce = (ProjectEntity) session.load(ProjectEntity.class, projectId);
			session.delete(ce);
		} catch (Exception e) {
			e.printStackTrace();
			deleteFlag = false;
		}
		return deleteFlag;
	}

}
