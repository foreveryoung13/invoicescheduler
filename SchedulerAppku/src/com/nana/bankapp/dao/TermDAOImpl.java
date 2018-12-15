package com.nana.bankapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nana.bankapp.entity.TermEntity;
import com.nana.bankapp.model.Term;

@Repository
public class TermDAOImpl implements TermDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveTerm(Term term) {
		boolean saveFlag = true;
		TermEntity te = new TermEntity();
		te.setTermId(UUID.randomUUID());
		te.setTermName(term.getTermName());
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(te);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public boolean editTerm(Term term) {
		boolean saveFlag = true;
		TermEntity te = new TermEntity();
		te.setTermId(term.getTermId());
		te.setTermName(term.getTermName());
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.update(te);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public List<Term> getTerm() {
		List<Term> list = new ArrayList<Term>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<TermEntity> query = session.createQuery("FROM TermEntity", TermEntity.class);
			List<TermEntity> terms = query.getResultList();

			for (int i = 0; i < terms.size(); i++) {
				TermEntity termEntity = (TermEntity) terms.get(i);
				Term te = new Term();
				te.setTermId(termEntity.getTermId());
				te.setTermName(termEntity.getTermName());
				list.add(te);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Term getTerm(UUID termId) {
		Term term = new Term();
		try {
			Session session = sessionFactory.getCurrentSession();
			TermEntity te = (TermEntity) session.load(TermEntity.class, termId);
			term.setTermId(te.getTermId());
			term.setTermName(te.getTermName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return term;
	}

	@Override
	public boolean deleteTerm(UUID termId) {
		boolean deleteFlag = true;
		try {
			Session session = sessionFactory.getCurrentSession();
			TermEntity ce = (TermEntity) session.load(TermEntity.class, termId);
			session.delete(ce);
		} catch (Exception e) {
			e.printStackTrace();
			deleteFlag = false;
		}
		return deleteFlag;
	}

}
