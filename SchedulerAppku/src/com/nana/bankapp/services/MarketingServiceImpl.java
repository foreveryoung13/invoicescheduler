package com.nana.bankapp.services;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nana.bankapp.dao.MarketingDAO;
import com.nana.bankapp.model.Marketing;

@Service
public class MarketingServiceImpl implements MarketingService {

	@Autowired
	MarketingDAO marketingDAO;

	@Override
	@Transactional
	public boolean saveMarketing(Marketing marketing) {
		return marketingDAO.saveMarketing(marketing);
	}

	@Override
	@Transactional
	public boolean editMarketing(Marketing marketing) {
		return marketingDAO.editMarketing(marketing);
	}

	@Override
	@Transactional
	public List<Marketing> getMarketings() {
		return marketingDAO.getMarketings();
	}

	@Override
	@Transactional
	public Marketing getMarketing(UUID marketingId) {
		return marketingDAO.getMarketing(marketingId);
	}

	@Override
	@Transactional
	public boolean deleteMarketing(UUID marketingId) {
		return marketingDAO.deleteMarketing(marketingId);
	}

}
