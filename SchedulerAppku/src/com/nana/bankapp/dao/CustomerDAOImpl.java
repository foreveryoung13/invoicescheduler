package com.nana.bankapp.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nana.bankapp.entity.CustomerEntity;
import com.nana.bankapp.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveCustomer(Customer customer) {
		boolean saveFlag = true;
		CustomerEntity ce = new CustomerEntity();
		ce.setCustomerId(UUID.randomUUID().toString());
		ce.setCustomerName(customer.getCustomerName());
		ce.setAddress(customer.getAddress());
		ce.setCity(customer.getCity());
		ce.setProvince(customer.getProvince());
		ce.setCountry(customer.getCountry());
		ce.setFaxNumber(customer.getFaxNumber());
		ce.setPhoneNumber(customer.getPhoneNumber());
		ce.setPostalCode(customer.getPostalCode());
		ce.setCreatedBy("User");
		ce.setCreatedDate(new Date());
		ce.setUpdatedBy(null);
		ce.setUpdatedDate(null);
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(ce);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public boolean editCustomer(Customer customer) {
		boolean saveFlag = true;
		CustomerEntity ce = new CustomerEntity();
		ce.setCustomerId(customer.getCustomerId());
		ce.setCustomerName(customer.getCustomerName());
		ce.setAddress(customer.getAddress());
		ce.setCity(customer.getCity());
		ce.setProvince(customer.getProvince());
		ce.setCountry(customer.getCountry());
		ce.setFaxNumber(customer.getFaxNumber());
		ce.setPhoneNumber(customer.getPhoneNumber());
		ce.setPostalCode(customer.getPostalCode());
		ce.setCreatedBy(customer.getCreatedBy());
		ce.setCreatedDate(customer.getCreatedDate());
		ce.setUpdatedBy("User");
		ce.setUpdatedDate(new Date());
		
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.update(ce);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public List<Customer> getCustomers() {
		List<Customer> list = new ArrayList<Customer>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<CustomerEntity> query = session.createQuery("FROM CustomerEntity", CustomerEntity.class);
			List<CustomerEntity> rcustomers = query.getResultList();

			for (int i = 0; i < rcustomers.size(); i++) {
				CustomerEntity customerEntity = (CustomerEntity) rcustomers.get(i);
				Customer ce = new Customer();
				ce.setCustomerId(customerEntity.getCustomerId());
				ce.setCustomerName(customerEntity.getCustomerName());
				ce.setAddress(customerEntity.getAddress());
				ce.setCity(customerEntity.getCity());
				ce.setProvince(customerEntity.getProvince());
				ce.setCountry(customerEntity.getCountry());
				ce.setFaxNumber(customerEntity.getFaxNumber());
				ce.setPhoneNumber(customerEntity.getPhoneNumber());
				ce.setPostalCode(customerEntity.getPostalCode());
				ce.setCreatedBy(customerEntity.getCreatedBy());
				ce.setCreatedDate(customerEntity.getCreatedDate());
				ce.setUpdatedBy(customerEntity.getUpdatedBy());
				ce.setUpdatedDate(customerEntity.getUpdatedDate());
				list.add(ce);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Customer> pageCustomerList(Integer offset, Integer maxResults, boolean condition) {
		List<Customer> list = new ArrayList<Customer>();
		String querySql = "FROM CustomerEntity ORDER BY createdDate DESC";
		if (condition) {
			querySql = "FROM CustomerEntity ORDER BY updatedDate DESC";
		}
		
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<CustomerEntity> query = session.createQuery(querySql, CustomerEntity.class);
			query.setFirstResult(offset != null ? offset : 0);
			query.setMaxResults(maxResults != null ? maxResults : 10);

			List<CustomerEntity> customers = query.getResultList();

			if (customers != null) {
				for (int i = 0; i < customers.size(); i++) {
					CustomerEntity customerEntity = (CustomerEntity) customers.get(i);
					Customer ce = new Customer();
					ce.setCustomerId(customerEntity.getCustomerId());
					ce.setCustomerName(customerEntity.getCustomerName());
					ce.setAddress(customerEntity.getAddress());
					ce.setCity(customerEntity.getCity());
					ce.setProvince(customerEntity.getProvince());
					ce.setCountry(customerEntity.getCountry());
					ce.setFaxNumber(customerEntity.getFaxNumber());
					ce.setPhoneNumber(customerEntity.getPhoneNumber());
					ce.setPostalCode(customerEntity.getPostalCode());
					ce.setCreatedBy(customerEntity.getCreatedBy());
					ce.setCreatedDate(customerEntity.getCreatedDate());
					ce.setUpdatedBy(customerEntity.getUpdatedBy());
					ce.setUpdatedDate(customerEntity.getUpdatedDate());
					list.add(ce);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Customer getCustomer(String customerId) {
		Customer cu = new Customer();
		try {
			Session session = sessionFactory.getCurrentSession();
			CustomerEntity ce = (CustomerEntity) session.load(CustomerEntity.class, customerId);
			cu.setCustomerId(ce.getCustomerId());
			cu.setCustomerName(ce.getCustomerName());
			cu.setAddress(ce.getAddress());
			cu.setCity(ce.getCity());
			cu.setProvince(ce.getProvince());
			cu.setCountry(ce.getCountry());
			cu.setFaxNumber(ce.getFaxNumber());
			cu.setPhoneNumber(ce.getPhoneNumber());
			cu.setPostalCode(ce.getPostalCode());
			cu.setCreatedBy(ce.getCreatedBy());
			cu.setCreatedDate(ce.getCreatedDate());
			cu.setUpdatedBy(ce.getUpdatedBy());
			cu.setUpdatedDate(ce.getUpdatedDate());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cu;
	}

	@Override
	public boolean deleteCustomer(String customerId) {
		boolean deleteFlag = true;
		try {
			Session session = sessionFactory.getCurrentSession();
			CustomerEntity ce = (CustomerEntity) session.load(CustomerEntity.class, customerId);
			session.delete(ce);
		} catch (Exception e) {
			e.printStackTrace();
			deleteFlag = false;
		}
		return deleteFlag;
	}

	@Override
	public Long count() {
		Session session = sessionFactory.getCurrentSession();
		Long rowCount = null;
		try {
			Criteria criteria = session.createCriteria(CustomerEntity.class).setProjection(Projections.rowCount());
			List result = criteria.list();

			if (!result.isEmpty()) {
				rowCount = (Long) result.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}

}
