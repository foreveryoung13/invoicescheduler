package com.nana.bankapp.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationName {

	public String getLoginName() {
		String name = null;
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		name = auth.getName();
		
		return name;
	}
}
