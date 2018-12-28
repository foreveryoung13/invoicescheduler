package com.nana.bankapp.services;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nana.bankapp.dao.CustomerDAO;
import com.nana.bankapp.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customerDAO;

	@Override
	@Transactional
	public boolean saveCustomer(Customer customer) {
		return customerDAO.saveCustomer(customer);
	}

	@Override
	@Transactional
	public boolean editCustomer(Customer customer) {
		return customerDAO.editCustomer(customer);
	}

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public List<Customer> pageCustomerList(Integer offset, Integer maxResults) {
		return customerDAO.pageCustomerList(offset, maxResults);
	}

	@Override
	@Transactional
	public Customer getCustomer(String customerId) {
		return customerDAO.getCustomer(customerId);
	}

	@Override
	@Transactional
	public boolean deleteCustomer(String customerId) {
		return customerDAO.deleteCustomer(customerId);
	}

	@Override
	@Transactional
	public Long count() {
		return customerDAO.count();
	}

}
