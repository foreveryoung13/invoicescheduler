package com.nana.bankapp.services;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nana.bankapp.dao.RemarksDAO;
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
	public Remarks getRemarks(UUID remarksId) {
		return remarksDAO.getRemarks(remarksId);
	}

	@Override
	@Transactional
	public boolean deleteRemarks(UUID remarksId) {
		return remarksDAO.deleteRemarks(remarksId);
	}

}
