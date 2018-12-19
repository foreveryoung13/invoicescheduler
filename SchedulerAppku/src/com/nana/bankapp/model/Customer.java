package com.nana.bankapp.model;

public class Customer {

	protected String customerId;
	protected String customerName;
	protected String address;
	protected String city;
	protected String province;
	protected String country;
	protected String faxNumber;
	protected String phoneNumber;
	protected String postalCode;

	public Customer() {
	}

	public Customer(String customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public Customer(String customerId, String customerName, String address, String city, String province,
			String country, String faxNumber, String phoneNumber, String postalCode) {
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
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
