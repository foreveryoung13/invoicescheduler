package com.nana.bankapp.services;

import java.util.List;
import java.util.UUID;

import com.nana.bankapp.model.Email;

public interface EmailService {

	public boolean saveEmail(Email email);
	public boolean editEmail(Email email);
	public List<Email> getEmail();
	public Email getEmail(UUID emaiId);
	public boolean deleteEmail(UUID emaiId);

}