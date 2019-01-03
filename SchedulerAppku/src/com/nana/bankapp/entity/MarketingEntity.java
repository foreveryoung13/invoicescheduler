package com.nana.bankapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_marketing")
public class MarketingEntity {

	@Id
	@Column(name = "MARKETING_ID")
	protected String marketingId;

	@Column(name = "FIRST_NAME")
	protected String firstName;

	@Column(name = "LAST_NAME")
	protected String lastName;

	@Column(name = "PLACE_OF_BIRTH")
	protected String placeOfBirth;

	@Column(name = "DATE_OF_BIRTH")
	protected Date dateOfBirth;

	@Column(name = "AGE")
	protected Integer age;

	@Column(name = "ADDRESS")
	protected String address;

	@Column(name = "CITY")
	protected String city;

	@Column(name = "PROVINCE")
	protected String province;

	@Column(name = "COUNTRY")
	protected String country;

	@Column(name = "DIVISION_ID")
	protected String divisionId;

	@Column(name = "CREATED_BY")
	protected String createdBy;

	@Column(name = "CREATED_DATE")
	protected Date createdDate;

	@Column(name = "UPDATED_BY")
	protected String updatedBy;

	@Column(name = "UPDATED_DATE")
	protected Date updatedDate;

	@Column(name = "EMAIL_ADDRESS")
	protected String emailAddress;

	public MarketingEntity() {
	}

	public MarketingEntity(String marketingId, String firstName, String lastName, String placeOfBirth, Date dateOfBirth,
			Integer age, String address, String city, String province, String country, String divisionId,
			String createdBy, Date createdDate, String updatedBy, Date updatedDate, String emailAddress) {
		super();
		this.marketingId = marketingId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.placeOfBirth = placeOfBirth;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.address = address;
		this.city = city;
		this.province = province;
		this.country = country;
		this.divisionId = divisionId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.emailAddress = emailAddress;
	}

	public String getMarketingId() {
		return marketingId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public Integer getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getProvince() {
		return province;
	}

	public String getCountry() {
		return country;
	}

	public String getDivisionId() {
		return divisionId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setMarketingId(String marketingId) {
		this.marketingId = marketingId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
