package com.nana.bankapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_term")
public class TermEntity {

	@Id
	@Column(name = "TERM_ID")
	protected String termId;

	@Column(name = "TERM_NAME")
	protected String termName;

	public TermEntity() {
	}

	public TermEntity(String termId, String termName) {
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
