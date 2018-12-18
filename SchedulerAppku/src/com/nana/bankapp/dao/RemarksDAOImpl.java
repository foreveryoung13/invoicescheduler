package com.nana.bankapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
				list.add(re);
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

}
