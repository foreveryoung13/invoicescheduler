package com.nana.bankapp.model;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

public class Customer {

	protected String customerId;

	@NotEmpty(message = "Customer Name No can't be blank")
	protected String customerName;

	@NotEmpty(message = "Addres No can't be blank")
	protected String address;

	@NotEmpty(message = "City No can't be blank")
	protected String city;

	@NotEmpty(message = "Province No can't be blank")
	protected String province;

	@NotEmpty(message = "Account No can't be blank")
	protected String country;

	@NotEmpty(message = "Fax Number No can't be blank")
	protected String faxNumber;

	@NotEmpty(message = "Phone Number No can't be blank")
	protected String phoneNumber;

	@NotEmpty(message = "Postal Code No can't be blank")
	protected String postalCode;
	protected String createdBy;
	protected Date createdDate;
	protected String updatedBy;
	protected Date updatedDate;
	protected String emailAddress;

	public Customer() {
	}

	public Customer(String customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public Customer(String customerId, @NotEmpty(message = "Customer Name No can't be blank") String customerName,
			String address, String city, String province, String country, String faxNumber, String phoneNumber,
			String postalCode, String createdBy, Date createdDate, String updatedBy, Date updatedDate,
			String emailAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.city = city;
		this.province = province;
		this.country = country;
		this.faxNumber = faxNumber;
		this.phoneNumber = phoneNumber;
		this.postalCode = postalCode;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.emailAddress = emailAddress;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
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

	public String getFaxNumber() {
		return faxNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getPostalCode() {
		return postalCode;
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

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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
