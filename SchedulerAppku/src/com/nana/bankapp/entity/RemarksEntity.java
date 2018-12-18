package com.nana.bankapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_remarks")
public class RemarksEntity {

	@Id
	@Column(name = "REMARKS_ID")
	protected String remarksId;

	@Column(name = "REMARKS_NAME")
	protected String remarksName;

	public RemarksEntity() {
	}

	public RemarksEntity(String remarksId, String remarksName) {
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
