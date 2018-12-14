package com.nana.bankapp.model;

import java.util.Date;
import java.util.UUID;

public class Marketing {

	protected UUID marketingId;
	protected String firstName;
	protected String lastName;
	protected String placeOfBirth;
	protected Date dateOfBirth;
	protected Integer age;
	protected String address;
	protected String city;
	protected String province;
	protected String country;

	public Marketing() {
	}

	public Marketing(UUID marketingId, String firstName, String lastName, String placeOfBirth, Date dateOfBirth,
			Integer age, String address, String city, String province, String country) {
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
	}

	public UUID getMarketingId() {
		return marketingId;
	}

	public void setMarketingId(UUID marketingId) {
		this.marketingId = marketingId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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

}
