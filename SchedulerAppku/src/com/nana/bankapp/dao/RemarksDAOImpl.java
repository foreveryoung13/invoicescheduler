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

import com.nana.bankapp.entity.RemarksEntity;
import com.nana.bankapp.model.Remarks;

@Repository
public class RemarksDAOImpl implements RemarksDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveRemarks(Remarks remarks) {
		boolean saveFlag = true;
		RemarksEntity re = new RemarksEntity();
		re.setRemarksId(UUID.randomUUID().toString());
		re.setRemarksName(remarks.getRemarksName());
		re.setCreatedBy("User");
		re.setCreatedDate(new Date());
		re.setUpdatedBy(null);
		re.setUpdatedDate(null);
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(re);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public boolean editRemarks(Remarks remarks) {
		boolean saveFlag = true;
		RemarksEntity pe = new RemarksEntity();
		pe.setRemarksId(remarks.getRemarksId());
		pe.setRemarksName(remarks.getRemarksName());
		pe.setCreatedBy(remarks.getCreatedBy());
		pe.setCreatedDate(remarks.getCreatedDate());
		pe.setUpdatedBy("User");
		pe.setUpdatedDate(new Date());
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
	public List<Remarks> getRemarks() {
		List<Remarks> list = new ArrayList<Remarks>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<RemarksEntity> query = session.createQuery("FROM RemarksEntity", RemarksEntity.class);
			List<RemarksEntity> remarks = query.getResultList();

			for (int i = 0; i < remarks.size(); i++) {
				RemarksEntity remarksEntity = (RemarksEntity) remarks.get(i);
				Remarks re = new Remarks();
				re.setRemarksId(remarksEntity.getRemarksId());
				re.setRemarksName(remarksEntity.getRemarksName());
				re.setCreatedBy(remarksEntity.getCreatedBy());
				re.setCreatedDate(remarksEntity.getCreatedDate());
				re.setUpdatedBy(remarksEntity.getUpdatedBy());
				re.setUpdatedDate(remarksEntity.getUpdatedDate());
				list.add(re);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Remarks> pageRemarksList(Integer offset, Integer maxResults, boolean condition) {
		List<Remarks> list = new ArrayList<Remarks>();
		String querySql = "FROM RemarksEntity ORDER BY createdDate DESC";
		
		if (condition) {
			querySql = "FROM RemarksEntity ORDER BY updatedDate DESC";
		}
		
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<RemarksEntity> query = session.createQuery(querySql, RemarksEntity.class);
			query.setFirstResult(offset != null ? offset : 0);
			query.setMaxResults(maxResults != null ? maxResults : 10);

			List<RemarksEntity> rRemarks = query.getResultList();

			if (rRemarks != null) {
				for (int i = 0; i < rRemarks.size(); i++) {
					RemarksEntity pe = (RemarksEntity) rRemarks.get(i);
					Remarks pro = new Remarks();
					pro.setRemarksId(pe.getRemarksId());
					pro.setRemarksName(pe.getRemarksName());
					pro.setCreatedBy(pe.getCreatedBy());
					pro.setCreatedDate(pe.getCreatedDate());
					pro.setUpdatedBy(pe.getUpdatedBy());
					pro.setUpdatedDate(pe.getUpdatedDate());
					list.add(pro);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Remarks getRemarks(String remarksId) {
		Remarks rem = new Remarks();
		try {
			Session session = sessionFactory.getCurrentSession();
			RemarksEntity re = (RemarksEntity) session.load(RemarksEntity.class, remarksId);
			rem.setRemarksId(re.getRemarksId());
			rem.setRemarksName(re.getRemarksName());
			rem.setCreatedBy(re.getCreatedBy());
			rem.setCreatedDate(re.getCreatedDate());
			rem.setUpdatedBy(re.getUpdatedBy());
			rem.setUpdatedDate(re.getUpdatedDate());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rem;
	}

	@Override
	public boolean deleteRemarks(String remarksId) {
		boolean deleteFlag = true;
		try {
			Session session = sessionFactory.getCurrentSession();
			RemarksEntity ce = (RemarksEntity) session.load(RemarksEntity.class, remarksId);
			session.delete(ce);
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
			Criteria criteria = session.createCriteria(RemarksEntity.class).setProjection(Projections.rowCount());
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
