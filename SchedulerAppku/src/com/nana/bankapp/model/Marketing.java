package com.nana.bankapp.model;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class Marketing {

	private String marketingId;

	@NotEmpty(message = "First Name Name No can't be blank")
	private String firstName;

	@NotEmpty(message = "Last Name Name No can't be blank")
	private String lastName;

	@NotEmpty(message = "Place Of Birth Name No can't be blank")
	private String placeOfBirth;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull(message = "Date of birth can't be null")
	private Date dateOfBirth;

	@NotNull(message = "Age of birth can't be null")
	private Integer age;

	@NotEmpty(message = "Address Name No can't be blank")
	private String address;

	@NotEmpty(message = "City Name No can't be blank")
	private String city;

	@NotEmpty(message = "Province Name No can't be blank")
	private String province;

	@NotEmpty(message = "Country Name No can't be blank")
	private String country;

	@NotEmpty(message = "DivisionId Name No can't be blank")
	private String divisionId;

	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	protected String emailAddress;

	public Marketing() {
	}

	public Marketing(String marketingId, String firstName) {
		super();
		this.marketingId = marketingId;
		this.firstName = firstName;
	}

	public Marketing(String marketingId, @NotEmpty(message = "First Name Name No can't be blank") String firstName,
			String lastName, String placeOfBirth, Date dateOfBirth, Integer age, String address, String city,
			String province, String country, String divisionId, String createdBy, Date createdDate, String updatedBy,
			Date updatedDate, String emailAddress) {
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
