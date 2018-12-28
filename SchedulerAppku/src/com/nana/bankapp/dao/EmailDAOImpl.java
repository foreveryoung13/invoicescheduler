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

import com.nana.bankapp.entity.EmailEntity;
import com.nana.bankapp.model.Email;

@Repository
public class EmailDAOImpl implements EmailDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveEmail(Email email) {
		boolean saveFlag = true;
		EmailEntity ee = new EmailEntity();
		ee.setEmailId(UUID.randomUUID().toString());
		ee.setSender(email.getSender());
		ee.setRecipients(email.getRecipients());
		ee.setSubject(email.getSubject());
		ee.setHeader(email.getHeader());
		ee.setFooter(email.getFooter());
		ee.setContent(email.getContent());
		ee.setCreatedBy("User");
		ee.setCreatedDate(new Date());
		ee.setUpdatedBy(null);
		ee.setUpdatedDate(null);
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(ee);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public boolean editEmail(Email email) {
		boolean saveFlag = true;
		EmailEntity ee = new EmailEntity();
		ee.setEmailId(email.getEmailId());
		ee.setSender(email.getSender());
		ee.setRecipients(email.getRecipients());
		ee.setSubject(email.getSubject());
		ee.setHeader(email.getHeader());
		ee.setFooter(email.getFooter());
		ee.setContent(email.getContent());
		ee.setCreatedBy(email.getCreatedBy());
		ee.setCreatedDate(email.getCreatedDate());
		ee.setUpdatedBy("User");
		ee.setUpdatedDate(new Date());
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.update(ee);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public List<Email> getEmail() {
		List<Email> list = new ArrayList<Email>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<EmailEntity> query = session.createQuery("FROM EmailEntity", EmailEntity.class);
			List<EmailEntity> remails = query.getResultList();

			for (int i = 0; i < remails.size(); i++) {
				EmailEntity ee = (EmailEntity) remails.get(i);
				Email email = new Email();
				email.setEmailId(ee.getEmailId());
				email.setSender(ee.getSender());
				email.setRecipients(ee.getRecipients());
				email.setSubject(ee.getSubject());
				email.setHeader(ee.getHeader());
				email.setFooter(ee.getFooter());
				email.setContent(ee.getContent());
				email.setCreatedBy(ee.getCreatedBy());
				email.setCreatedDate(ee.getCreatedDate());
				email.setUpdatedBy(ee.getUpdatedBy());
				email.setUpdatedDate(ee.getUpdatedDate());
				list.add(email);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Email> pageEmailList(Integer offset, Integer maxResults, boolean condition) {
		List<Email> list = new ArrayList<Email>();
		String querySql = "FROM EmailEntity ORDER BY createdDate DESC";
		
		if (condition) {
			querySql = "FROM EmailEntity ORDER BY updatedDate DESC";
		}
		
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<EmailEntity> query = session.createQuery(querySql, EmailEntity.class);
			query.setFirstResult(offset != null ? offset : 0);
			query.setMaxResults(maxResults != null ? maxResults : 10);

			List<EmailEntity> rEmail = query.getResultList();

			if (rEmail != null) {
				for (int i = 0; i < rEmail.size(); i++) {
					EmailEntity ee = (EmailEntity) rEmail.get(i);
					Email email = new Email();
					email.setEmailId(ee.getEmailId());
					email.setSender(ee.getSender());
					email.setRecipients(ee.getRecipients());
					email.setSubject(ee.getSubject());
					email.setHeader(ee.getHeader());
					email.setFooter(ee.getFooter());
					email.setContent(ee.getContent());
					email.setCreatedBy(ee.getCreatedBy());
					email.setCreatedDate(ee.getCreatedDate());
					email.setUpdatedBy(ee.getUpdatedBy());
					email.setUpdatedDate(ee.getUpdatedDate());
					list.add(email);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Email getEmail(String emailId) {
		Email email = new Email();

		try {
			Session session = sessionFactory.getCurrentSession();
			EmailEntity ee = (EmailEntity) session.load(EmailEntity.class, emailId);
			email.setEmailId(ee.getEmailId());
			email.setSender(ee.getSender());
			email.setRecipients(ee.getRecipients());
			email.setSubject(ee.getSubject());
			email.setHeader(ee.getHeader());
			email.setFooter(ee.getFooter());
			email.setContent(ee.getContent());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return email;
	}

	@Override
	public boolean deleteEmail(String emailId) {
		boolean deleteFlag = true;
		try {
			Session session = sessionFactory.getCurrentSession();
			EmailEntity ee = (EmailEntity) session.load(EmailEntity.class, emailId);
			session.delete(ee);
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
			Criteria criteria = session.createCriteria(EmailEntity.class).setProjection(Projections.rowCount());
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
