package com.nana.bankapp.dao;

import java.util.List;

import com.nana.bankapp.model.Customer;

public interface CustomerDAO {

	public boolean saveCustomer(Customer customer);
	public boolean editCustomer(Customer customer);
	public List<Customer> getCustomers();
	public List<Customer> pageCustomerList(Integer offset, Integer maxResults, boolean condition);
	public Customer getCustomer(String customerId);
	public boolean deleteCustomer(String customerId);
	public Long count();
}