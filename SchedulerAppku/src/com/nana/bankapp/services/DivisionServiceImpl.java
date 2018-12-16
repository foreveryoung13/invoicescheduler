package com.nana.bankapp.services;

import java.util.List;
import java.util.UUID;

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
	public Division getDivision(UUID divisionId) {
		return rdivisionDAO.getDivision(divisionId);
	}

	@Override
	@Transactional
	public boolean deleteDivision(UUID divisionId) {
		return rdivisionDAO.deleteDivision(divisionId);
	}

}
