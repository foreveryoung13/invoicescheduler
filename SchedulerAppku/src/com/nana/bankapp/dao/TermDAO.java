package com.nana.bankapp.dao;

import java.util.List;

import com.nana.bankapp.model.Term;

public interface TermDAO {

	public boolean saveTerm(Term term);
	public boolean editTerm(Term term);
	public List<Term> getTerm();
	public List<Term> pageTermList(Integer offset, Integer maxResults);
	public Term getTerm(String termId);
	public boolean deleteTerm(String termId);
	public Long count();

}