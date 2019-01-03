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

import com.nana.bankapp.entity.MarketingEntity;
import com.nana.bankapp.model.Marketing;

@Repository
public class MarketingDAOImpl implements MarketingDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveMarketing(Marketing marketing) {
		boolean saveFlag = true;
		MarketingEntity me = new MarketingEntity();
		me.setMarketingId(UUID.randomUUID().toString());
		me.setFirstName(marketing.getFirstName());
		me.setLastName(marketing.getLastName());
		me.setPlaceOfBirth(marketing.getPlaceOfBirth());
		me.setDateOfBirth(marketing.getDateOfBirth());
		me.setAge(marketing.getAge());
		me.setAddress(marketing.getAddress());
		me.setCity(marketing.getCity());
		me.setProvince(marketing.getProvince());
		me.setCountry(marketing.getCountry());
		me.setDivisionId(marketing.getDivisionId());
		me.setCreatedBy("User");
		me.setCreatedDate(new Date());
		me.setUpdatedBy(null);
		me.setUpdatedDate(null);
		me.setEmailAddress(marketing.getEmailAddress());
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(me);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public boolean editMarketing(Marketing marketing) {
		boolean saveFlag = true;
		MarketingEntity me = new MarketingEntity();
		me.setMarketingId(marketing.getMarketingId());
		me.setFirstName(marketing.getFirstName());
		me.setLastName(marketing.getLastName());
		me.setPlaceOfBirth(marketing.getPlaceOfBirth());
		me.setDateOfBirth(marketing.getDateOfBirth());
		me.setAge(marketing.getAge());
		me.setAddress(marketing.getAddress());
		me.setCity(marketing.getCity());
		me.setProvince(marketing.getProvince());
		me.setCountry(marketing.getCountry());
		me.setDivisionId(marketing.getDivisionId());
		me.setCreatedBy(marketing.getCreatedBy());
		me.setCreatedDate(marketing.getCreatedDate());
		me.setUpdatedBy("User");
		me.setUpdatedDate(new Date());
		me.setEmailAddress(marketing.getEmailAddress());
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.update(me);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public List<Marketing> getMarketings() {
		List<Marketing> list = new ArrayList<Marketing>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<MarketingEntity> query = session.createQuery("FROM MarketingEntity", MarketingEntity.class);
			List<MarketingEntity> marketings = query.getResultList();
			for (int i = 0; i < marketings.size(); i++) {
				MarketingEntity marketing = (MarketingEntity) marketings.get(i);
				Marketing me = new Marketing();
				me.setMarketingId(marketing.getMarketingId());
				me.setFirstName(marketing.getFirstName());
				me.setLastName(marketing.getLastName());
				me.setPlaceOfBirth(marketing.getPlaceOfBirth());
				me.setDateOfBirth(marketing.getDateOfBirth());
				me.setAge(marketing.getAge());
				me.setAddress(marketing.getAddress());
				me.setCity(marketing.getCity());
				me.setProvince(marketing.getProvince());
				me.setCountry(marketing.getCountry());
				me.setDivisionId(marketing.getDivisionId());
				me.setCreatedBy(marketing.getCreatedBy());
				me.setCreatedDate(marketing.getCreatedDate());
				me.setUpdatedBy(marketing.getUpdatedBy());
				me.setUpdatedDate(marketing.getUpdatedDate());
				me.setEmailAddress(marketing.getEmailAddress());
				list.add(me);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Marketing> pageMarketingList(Integer offset, Integer maxResults, boolean condition) {
		List<Marketing> list = new ArrayList<Marketing>();
		String querySql = "FROM MarketingEntity ORDER BY createdDate DESC";
		
		if (condition) {
			querySql = "FROM MarketingEntity ORDER BY updatedDate DESC";
		}
		
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<MarketingEntity> query = session.createQuery(querySql, MarketingEntity.class);
			query.setFirstResult(offset != null ? offset : 0);
			query.setMaxResults(maxResults != null ? maxResults : 10);

			List<MarketingEntity> rMarketing = query.getResultList();

			if (rMarketing != null) {
				for (int i = 0; i < rMarketing.size(); i++) {
					MarketingEntity marketing = (MarketingEntity) rMarketing.get(i);
					Marketing me = new Marketing();
					me.setMarketingId(marketing.getMarketingId());
					me.setFirstName(marketing.getFirstName());
					me.setLastName(marketing.getLastName());
					me.setPlaceOfBirth(marketing.getPlaceOfBirth());
					me.setDateOfBirth(marketing.getDateOfBirth());
					me.setAge(marketing.getAge());
					me.setAddress(marketing.getAddress());
					me.setCity(marketing.getCity());
					me.setProvince(marketing.getProvince());
					me.setCountry(marketing.getCountry());
					me.setDivisionId(marketing.getDivisionId());
					me.setCreatedBy(marketing.getCreatedBy());
					me.setCreatedDate(marketing.getCreatedDate());
					me.setUpdatedBy(marketing.getUpdatedBy());
					me.setUpdatedDate(marketing.getUpdatedDate());
					me.setEmailAddress(marketing.getEmailAddress());
					list.add(me);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Marketing getMarketing(String marketingId) {
		Marketing me = new Marketing();
		try {
			Session session = sessionFactory.getCurrentSession();
			MarketingEntity marketing = (MarketingEntity) session.load(MarketingEntity.class, marketingId);
			me.setMarketingId(marketing.getMarketingId());
			me.setFirstName(marketing.getFirstName());
			me.setLastName(marketing.getLastName());
			me.setPlaceOfBirth(marketing.getPlaceOfBirth());
			me.setDateOfBirth(marketing.getDateOfBirth());
			me.setAge(marketing.getAge());
			me.setAddress(marketing.getAddress());
			me.setCity(marketing.getCity());
			me.setProvince(marketing.getProvince());
			me.setCountry(marketing.getCountry());
			me.setDivisionId(marketing.getDivisionId());
			me.setCreatedBy(marketing.getCreatedBy());
			me.setCreatedDate(marketing.getCreatedDate());
			me.setUpdatedBy(marketing.getUpdatedBy());
			me.setUpdatedDate(marketing.getUpdatedDate());
			me.setEmailAddress(marketing.getEmailAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return me;
	}

	@Override
	public boolean deleteMarketing(String marketingId) {
		boolean deleteFlag = true;
		try {
			Session session = sessionFactory.getCurrentSession();
			MarketingEntity me = (MarketingEntity) session.load(MarketingEntity.class, marketingId);
			session.delete(me);
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
			Criteria criteria = session.createCriteria(MarketingEntity.class).setProjection(Projections.rowCount());
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
