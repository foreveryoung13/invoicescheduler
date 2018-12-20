package com.nana.bankapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application about page.
 */
@Controller
public class AboutController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String home(Model model) {

		return "about";
	}

}
