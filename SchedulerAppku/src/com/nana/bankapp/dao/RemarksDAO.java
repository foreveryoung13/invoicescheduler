package com.nana.bankapp.dao;

import java.util.List;
import java.util.UUID;

import com.nana.bankapp.model.Remarks;

public interface RemarksDAO {

	public boolean saveRemarks(Remarks remarks);
	public boolean editRemarks(Remarks remarks);
	public List<Remarks> getRemarks();
	public Remarks getRemarks(UUID remarksId);
	public boolean deleteRemarks(UUID remarksId);

}