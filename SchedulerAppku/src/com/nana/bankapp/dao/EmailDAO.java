package com.nana.bankapp.dao;

import java.util.List;

import com.nana.bankapp.model.Email;

public interface EmailDAO {

	public boolean saveEmail(Email email);
	public boolean editEmail(Email email);
	public List<Email> getEmail();
	public List<Email> pageEmailList(Integer offset, Integer maxResults);
	public Email getEmail(String emaiId);
	public boolean deleteEmail(String emaiId);
	public Long count();

}