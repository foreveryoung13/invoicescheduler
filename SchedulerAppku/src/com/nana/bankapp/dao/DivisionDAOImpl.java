package com.nana.bankapp.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nana.bankapp.entity.DivisionEntity;
import com.nana.bankapp.model.Division;

@Repository
public class DivisionDAOImpl implements DivisionDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveDivision(Division division) {
		boolean saveFlag = true;

		DivisionEntity de = new DivisionEntity();
		de.setDivisionId(UUID.randomUUID().toString());
		de.setDivisionName(division.getDivisionName());
		de.setCreatedBy("User");
		de.setCreatedDate(new Date());
		de.setUpdatedBy(null);
		de.setUpdatedDate(null);

		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(de);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public boolean editDivision(Division division) {
		boolean saveFlag = true;

		DivisionEntity de = new DivisionEntity();
		de.setDivisionId(division.getDivisionId());
		de.setDivisionName(division.getDivisionName());
		de.setCreatedBy(division.getCreatedBy());
		de.setCreatedDate(division.getCreatedDate());
		de.setUpdatedBy("User");
		de.setUpdatedDate(new Date());

		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.update(de);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public List<Division> getDivision() {
		List<Division> list = new ArrayList<Division>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<DivisionEntity> query = session.createQuery("FROM DivisionEntity", DivisionEntity.class);
			List<DivisionEntity> rdivision = query.getResultList();

			for (int i = 0; i < rdivision.size(); i++) {
				DivisionEntity de = (DivisionEntity) rdivision.get(i);
				Division div = new Division();
				div.setDivisionId(de.getDivisionId());
				div.setDivisionName(de.getDivisionName());
				div.setCreatedBy(de.getCreatedBy());
				div.setCreatedDate(de.getCreatedDate());
				div.setUpdatedBy(de.getUpdatedBy());
				div.setUpdatedDate(de.getUpdatedDate());
				list.add(div);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Division> pageDivisionList(Integer offset, Integer maxResults, boolean condition) {
		List<Division> list = new ArrayList<Division>();
		String querySql = "FROM DivisionEntity ORDER BY createdDate DESC";
		if (condition) {
			querySql = "FROM DivisionEntity ORDER BY updatedDate DESC";
		}
		try {
			Session session = sessionFactory.getCurrentSession();
			
			System.out.println(querySql);
			Query<DivisionEntity> query = session.createQuery(querySql, DivisionEntity.class);
			query.setFirstResult(offset != null ? offset : 0);
			query.setMaxResults(maxResults != null ? maxResults : 10);

			List<DivisionEntity> rdivision = query.getResultList();

			if (rdivision != null) {
				for (int i = 0; i < rdivision.size(); i++) {
					DivisionEntity de = (DivisionEntity) rdivision.get(i);
					Division div = new Division();
					div.setDivisionId(de.getDivisionId());
					div.setDivisionName(de.getDivisionName());
					div.setCreatedBy(de.getCreatedBy());
					div.setCreatedDate(de.getCreatedDate());
					div.setUpdatedBy(de.getUpdatedBy());
					div.setUpdatedDate(de.getUpdatedDate());
					list.add(div);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Division getDivision(String divisionId) {
		Division div = new Division();
		try {
			Session session = sessionFactory.getCurrentSession();
			DivisionEntity de = (DivisionEntity) session.load(DivisionEntity.class, divisionId);
			div.setDivisionId(de.getDivisionId());
			div.setDivisionName(de.getDivisionName());
			div.setCreatedBy(de.getCreatedBy());
			div.setCreatedDate(de.getCreatedDate());
			div.setUpdatedBy(de.getUpdatedBy());
			div.setUpdatedDate(de.getUpdatedDate());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return div;
	}

	@Override
	public boolean deleteDivision(String divisionId) {
		boolean deleteFlag = true;
		try {
			Session session = sessionFactory.getCurrentSession();
			DivisionEntity de = (DivisionEntity) session.load(DivisionEntity.class, divisionId);
			session.delete(de);
		} catch (Exception e) {
			e.printStackTrace();
			deleteFlag = false;
		}
		return deleteFlag;
	}

	@Override
	public Long count() {
		Session session = sessionFactory.getCurrentSession();
		Long rowCount = null;
		try {
			Criteria criteria = session.createCriteria(DivisionEntity.class).setProjection(Projections.rowCount());
			List result = criteria.list();

			if (!result.isEmpty()) {
				rowCount = (Long) result.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}

}
