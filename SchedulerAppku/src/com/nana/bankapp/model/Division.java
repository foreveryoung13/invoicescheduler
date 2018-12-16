package com.nana.bankapp.model;

import java.util.UUID;

public class Division {

	private UUID divisionId;
	private String divisionName;

	public Division() {
	}

	public Division(UUID divisionId, String divisionName) {
		super();
		this.divisionId = divisionId;
		this.divisionName = divisionName;
	}

	public UUID getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(UUID divisionId) {
		this.divisionId = divisionId;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

}
