package com.nana.bankapp.services;

import java.util.List;
import java.util.UUID;

import com.nana.bankapp.model.Term;

public interface TermService {

	public boolean saveTerm(Term term);
	public boolean editTerm(Term term);
	public List<Term> getTerm();
	public Term getTerm(UUID termId);
	public boolean deleteTerm(UUID termId);
	
}