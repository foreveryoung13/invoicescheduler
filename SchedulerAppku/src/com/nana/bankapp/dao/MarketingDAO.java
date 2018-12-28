package com.nana.bankapp.dao;

import java.util.List;
import com.nana.bankapp.model.Marketing;

public interface MarketingDAO {

	public boolean saveMarketing(Marketing marketing);
	public boolean editMarketing(Marketing marketing);
	public List<Marketing> getMarketings();
	public List<Marketing> pageMarketingList(Integer offset, Integer maxResults);
	public Marketing getMarketing(String marketingId);
	public boolean deleteMarketing(String marketingId);
	public Long count();
}