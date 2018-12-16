package com.nana.bankapp.dao;

import java.util.List;
import java.util.UUID;

import com.nana.bankapp.model.Division;

public interface DivisionDAO {

	public boolean saveDivision(Division division);
	public boolean editDivision(Division division);
	public List<Division> getDivision();
	public Division getDivision(UUID divisionId);
	public boolean deleteDivision(UUID divisionId);

}