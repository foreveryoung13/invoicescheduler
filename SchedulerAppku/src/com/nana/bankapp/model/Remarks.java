package com.nana.bankapp.model;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

public class Remarks {

	protected String remarksId;
	
	@NotEmpty(message = "Remarks Name can't be blank")
	protected String remarksName;
	protected String createdBy;
	protected Date createdDate;
	protected String updatedBy;
	protected Date updatedDate;

	public Remarks() {
	}

	public Remarks(String remarksId, String remarksName) {
		super();
		this.remarksId = remarksId;
		this.remarksName = remarksName;
	}

	public Remarks(String remarksId, String remarksName, String createdBy, Date createdDate, String updatedBy,
			Date updatedDate) {
		super();
		this.remarksId = remarksId;
		this.remarksName = remarksName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
