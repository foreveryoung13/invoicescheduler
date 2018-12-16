package com.nana.bankapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
		de.setDivisionId(UUID.randomUUID());
		de.setDivisionName(division.getDivisionName());

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
				list.add(div);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Division getDivision(UUID divisionId) {
		Division div = new Division();
		try {
			Session session = sessionFactory.getCurrentSession();
			DivisionEntity de = (DivisionEntity) session.load(DivisionEntity.class, divisionId);
			div.setDivisionId(de.getDivisionId());
			div.setDivisionName(de.getDivisionName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return div;
	}

	@Override
	public boolean deleteDivision(UUID divisionId) {
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

}
