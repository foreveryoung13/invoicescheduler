package com.nana.bankapp.services;

import java.util.List;
import java.util.UUID;

import com.nana.bankapp.model.Division;

public interface DivisionService {

	public boolean saveDivision(Division division);
	public boolean editDivision(Division division);
	public List<Division> getDivision();
	public Division getDivision(String divisionId);
	public boolean deleteDivision(String divisionId);

}