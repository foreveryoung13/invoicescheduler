package com.nana.bankapp.model;

import java.util.UUID;

public class Remarks {

	protected UUID remarksId;
	protected String remarksName;

	public Remarks() {
	}

	public Remarks(UUID remarksId, String remarksName) {
		super();
		this.remarksId = remarksId;
		this.remarksName = remarksName;
	}

	public UUID getRemarksId() {
		return remarksId;
	}

	public void setRemarksId(UUID remarksId) {
		this.remarksId = remarksId;
	}

	public String getRemarksName() {
		return remarksName;
	}

	public void setRemarksName(String remarksName) {
		this.remarksName = remarksName;
	}

}
