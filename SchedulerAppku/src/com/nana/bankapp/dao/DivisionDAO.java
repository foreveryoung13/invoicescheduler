package com.nana.bankapp.dao;

import java.util.List;

import com.nana.bankapp.model.Division;

public interface DivisionDAO {

	public boolean saveDivision(Division division);
	public boolean editDivision(Division division);
	public List<Division> getDivision();
	public Division getDivision(String divisionId);
	public boolean deleteDivision(String divisionId);

}