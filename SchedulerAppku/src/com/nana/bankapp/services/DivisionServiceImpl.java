package com.nana.bankapp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nana.bankapp.dao.DivisionDAO;
import com.nana.bankapp.model.Division;

@Service
public class DivisionServiceImpl implements DivisionService {

	@Autowired
	DivisionDAO rdivisionDAO;

	@Override
	@Transactional
	public boolean saveDivision(Division rdivision) {
		return rdivisionDAO.saveDivision(rdivision);
	}

	@Override
	@Transactional
	public boolean editDivision(Division rdivision) {
		return rdivisionDAO.editDivision(rdivision);
	}

	@Override
	@Transactional
	public List<Division> getDivision() {
		return rdivisionDAO.getDivision();
	}

	@Override
	@Transactional
	public List<Division> pageDivisionList(Integer offset, Integer maxResults, boolean condition) {
		return rdivisionDAO.pageDivisionList(offset, maxResults, condition);
	}

	@Override
	@Transactional
	public Division getDivision(String divisionId) {
		return rdivisionDAO.getDivision(divisionId);
	}

	@Override
	@Transactional
	public boolean deleteDivision(String divisionId) {
		return rdivisionDAO.deleteDivision(divisionId);
	}

	@Override
	@Transactional
	public Long count() {
		return rdivisionDAO.count();
	}

}
