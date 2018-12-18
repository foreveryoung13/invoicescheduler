package com.nana.bankapp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nana.bankapp.dao.TermDAO;
import com.nana.bankapp.model.Term;

@Service
public class TermServiceImpl implements TermService {

	@Autowired
	TermDAO termDAO;

	@Override
	@Transactional
	public boolean saveTerm(Term term) {
		return termDAO.saveTerm(term);
	}

	@Override
	@Transactional
	public boolean editTerm(Term term) {
		return termDAO.editTerm(term);
	}

	@Override
	@Transactional
	public List<Term> getTerm() {
		return termDAO.getTerm();
	}

	@Override
	@Transactional
	public Term getTerm(String termId) {
		return termDAO.getTerm(termId);
	}

	@Override
	@Transactional
	public boolean deleteTerm(String termId) {
		return termDAO.deleteTerm(termId);
	}

}
