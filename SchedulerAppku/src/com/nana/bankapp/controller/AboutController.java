package com.nana.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nana.bankapp.util.AuthenticationName;

/**
 * Handles requests for the application about page.
 */

@Controller
public class AboutController {

	@Autowired
	AuthenticationName authName;

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String home(Model model) {
		String name = authName.getLoginName();
		model.addAttribute("username", name);
		return "about";
	}

}
