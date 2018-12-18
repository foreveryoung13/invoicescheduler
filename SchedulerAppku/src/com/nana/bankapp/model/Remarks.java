package com.nana.bankapp.model;

public class Remarks {

	protected String remarksId;
	protected String remarksName;

	public Remarks() {
	}

	public Remarks(String remarksId, String remarksName) {
		super();
		this.remarksId = remarksId;
		this.remarksName = remarksName;
	}

	public String getRemarksId() {
		return remarksId;
	}

	public void setRemarksId(String remarksId) {
		this.remarksId = remarksId;
	}

	public String getRemarksName() {
		return remarksName;
	}

	public void setRemarksName(String remarksName) {
		this.remarksName = remarksName;
	}

}
