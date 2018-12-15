package com.nana.bankapp.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_remarks")
public class RemarksEntity {

	@Id
	@Column(name = "REMARKS_ID")
	protected UUID remarksId;
	
	@Column(name = "REMARKS_NAME")
	protected String remarksName;

	public RemarksEntity() {
	}

	public RemarksEntity(UUID remarksId, String remarksName) {
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
