package com.nana.bankapp.services;

import java.util.List;
import java.util.UUID;

import com.nana.bankapp.model.Customer;

public interface CustomerService {

	public boolean saveCustomer(Customer customer);
	public boolean editCustomer(Customer customer);
	public List<Customer> getCustomers();
	public Customer getCustomer(UUID customer_id);
	public boolean deleteCustomer(UUID customer_id);
	
}