package com.nana.bankapp.services;

import java.util.List;

import com.nana.bankapp.model.Division;

public interface DivisionService {

	public boolean saveDivision(Division division);
	public boolean editDivision(Division division);
	public List<Division> getDivision();
	public List<Division> pageDivisionList(int start, int maxrows);
	public Division getDivision(String divisionId);
	public boolean deleteDivision(String divisionId);

}