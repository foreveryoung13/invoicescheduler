package com.nana.bankapp.model;

import java.util.UUID;

public class Term {

	protected UUID termId;
	protected String termName;

	public Term() {
	}

	public Term(UUID termId, String termName) {
		super();
		this.termId = termId;
		this.termName = termName;
	}

	public UUID getTermId() {
		return termId;
	}

	public void setTermId(UUID termId) {
		this.termId = termId;
	}

	public String getTermName() {
		return termName;
	}

	public void setTermName(String termName) {
		this.termName = termName;
	}

}
