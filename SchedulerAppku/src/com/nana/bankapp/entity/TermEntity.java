package com.nana.bankapp.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_term")
public class TermEntity {

	@Id
	@Column(name = "TERM_ID")
	protected UUID termId;
	
	@Column(name = "TERM_NAME")
	protected String termName;

	public TermEntity() {
	}

	public TermEntity(UUID termId, String termName) {
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
