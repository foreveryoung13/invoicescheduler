package com.nana.bankapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
				list.add(me);
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

}
