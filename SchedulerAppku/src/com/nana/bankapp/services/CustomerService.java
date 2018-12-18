package com.nana.bankapp.services;

import java.util.List;

import com.nana.bankapp.model.Customer;

public interface CustomerService {

	public boolean saveCustomer(Customer customer);
	public boolean editCustomer(Customer customer);
	public List<Customer> getCustomers();
	public Customer getCustomer(String customer_id);
	public boolean deleteCustomer(String customer_id);
	
}