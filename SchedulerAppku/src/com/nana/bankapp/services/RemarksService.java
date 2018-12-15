package com.nana.bankapp.services;

import java.util.List;
import java.util.UUID;

import com.nana.bankapp.model.Remarks;

public interface RemarksService {

	public boolean saveRemarks(Remarks remarks);
	public boolean editRemarks(Remarks remarks);
	public List<Remarks> getRemarks();
	public Remarks getRemarks(UUID remarksId);
	public boolean deleteRemarks(UUID remarksId);
	
}