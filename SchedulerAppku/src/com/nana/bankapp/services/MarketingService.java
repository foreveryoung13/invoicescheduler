package com.nana.bankapp.services;

import java.util.List;

import com.nana.bankapp.model.Marketing;

public interface MarketingService {

	public boolean saveMarketing(Marketing marketing);
	public boolean editMarketing(Marketing marketing);
	public List<Marketing> getMarketings();
	public List<Marketing> pageMarketingList(Integer offset, Integer maxResults, boolean condition);
	public Marketing getMarketing(String marketingId);
	public boolean deleteMarketing(String marketingId);
	public Long count();
	
}