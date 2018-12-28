package com.nana.bankapp.entity;

import java.util.Date;

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

	@Column(name = "CREATED_BY")
	protected String createdBy;

	@Column(name = "CREATED_DATE")
	protected Date createdDate;

	@Column(name = "UPDATED_BY")
	protected String updatedBy;

	@Column(name = "UPDATED_DATE")
	protected Date updatedDate;

	public RemarksEntity() {
	}

	public RemarksEntity(String remarksId, String remarksName) {
		super();
		this.remarksId = remarksId;
		this.remarksName = remarksName;
	}

	public RemarksEntity(String remarksId, String remarksName, String createdBy, Date createdDate, String updatedBy,
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
