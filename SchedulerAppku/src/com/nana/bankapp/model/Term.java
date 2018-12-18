package com.nana.bankapp.model;

public class Term {

	protected String termId;
	protected String termName;

	public Term() {
	}

	public Term(String termId, String termName) {
		super();
		this.termId = termId;
		this.termName = termName;
	}

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public String getTermName() {
		return termName;
	}

	public void setTermName(String termName) {
		this.termName = termName;
	}

}
