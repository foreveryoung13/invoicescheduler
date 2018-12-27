package com.nana.bankapp.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nana.bankapp.util.AuthenticationName;

@Controller
public class HomeController {

	@Autowired
	AuthenticationName authName;

	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);

		String name = authName.getLoginName();
		model.addAttribute("username", name);

		return "home";
	}

}
