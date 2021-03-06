package com.nana.bankapp.services;

import java.util.List;

import com.nana.bankapp.model.Email;

public interface EmailService {

	public boolean saveEmail(Email email);
	public boolean editEmail(Email email);
	public List<Email> getEmail();
	public List<Email> pageEmailList(Integer offset, Integer maxResults, boolean condition);
	public Email getEmail(String emaiId);
	public boolean deleteEmail(String emaiId);
	public Long count();
}