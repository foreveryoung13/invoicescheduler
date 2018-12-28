package com.nana.bankapp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nana.bankapp.dao.RemarksDAO;
import com.nana.bankapp.model.Remarks;
import com.nana.bankapp.model.Remarks;

@Service
public class RemarksServiceImpl implements RemarksService {

	@Autowired
	RemarksDAO remarksDAO;

	@Override
	@Transactional
	public boolean saveRemarks(Remarks remarks) {
		return remarksDAO.saveRemarks(remarks);
	}

	@Override
	@Transactional
	public boolean editRemarks(Remarks remarks) {
		return remarksDAO.editRemarks(remarks);
	}

	@Override
	@Transactional
	public List<Remarks> getRemarks() {
		return remarksDAO.getRemarks();
	}

	@Override
	@Transactional
	public List<Remarks> pageRemarksList(Integer offset, Integer maxResults, boolean condition) {
		return remarksDAO.pageRemarksList(offset, maxResults, condition);
	}

	@Override
	@Transactional
	public Remarks getRemarks(String remarksId) {
		return remarksDAO.getRemarks(remarksId);
	}

	@Override
	@Transactional
	public boolean deleteRemarks(String remarksId) {
		return remarksDAO.deleteRemarks(remarksId);
	}

	@Override
	@Transactional
	public Long count() {
		return remarksDAO.count();
	}

}
