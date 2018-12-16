package com.nana.bankapp.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_division")
public class DivisionEntity {

	@Id
	@Column(name = "division_id")
	private UUID divisionId;

	@Column(name = "division_name")
	private String divisionName;

	public DivisionEntity() {
	}

	public UUID getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(UUID divisionId) {
		this.divisionId = divisionId;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

}
