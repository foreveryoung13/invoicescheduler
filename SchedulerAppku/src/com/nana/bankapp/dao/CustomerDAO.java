package com.nana.bankapp.dao;

import java.util.List;
import java.util.UUID;

import com.nana.bankapp.model.Customer;

public interface CustomerDAO {

	public boolean saveCustomer(Customer customer);
	public boolean editCustomer(Customer customer);
	public List<Customer> getCustomers();
	public Customer getCustomer(UUID customerId);
	public boolean deleteCustomer(UUID customerId);

}