package com.nana.bankapp.dao;

import java.util.List;
import java.util.UUID;

import com.nana.bankapp.model.Term;

public interface TermDAO {

	public boolean saveTerm(Term term);
	public boolean editTerm(Term term);
	public List<Term> getTerm();
	public Term getTerm(UUID termId);
	public boolean deleteTerm(UUID termId);

}