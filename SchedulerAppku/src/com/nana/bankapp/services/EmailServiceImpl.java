package com.nana.bankapp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nana.bankapp.dao.EmailDAO;
import com.nana.bankapp.model.Email;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	EmailDAO dao;

	@Override
	@Transactional
	public boolean saveEmail(Email email) {
		return dao.saveEmail(email);
	}

	@Override
	@Transactional
	public boolean editEmail(Email email) {
		return dao.editEmail(email);
	}

	@Override
	@Transactional
	public List<Email> getEmail() {
		return dao.getEmail();
	}

	@Override
	@Transactional
	public List<Email> pageEmailList(Integer offset, Integer maxResults, boolean condition) {
		return dao.pageEmailList(offset, maxResults, condition);
	}

	@Override
	@Transactional
	public Email getEmail(String emailId) {
		return dao.getEmail(emailId);
	}

	@Override
	@Transactional
	public boolean deleteEmail(String emailId) {
		return dao.deleteEmail(emailId);
	}

	@Override
	@Transactional
	public Long count() {
		return dao.count();
	}
}
