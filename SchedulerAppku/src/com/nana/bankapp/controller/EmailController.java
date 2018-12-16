package com.nana.bankapp.controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nana.bankapp.model.Email;
import com.nana.bankapp.services.EmailService;

@Controller
public class EmailController {

	@Autowired
	EmailService emailService;

	@RequestMapping("/newemail")
	public String newRcustomer(Model model) {
		model.addAttribute("email", new Email());
		return "email_add_form";
	}

	@RequestMapping(value = "/saveemail", method = RequestMethod.POST)
	public String saveEmail(@Valid @ModelAttribute("email") Email email, BindingResult result) {
		if (result.hasErrors()) {
			return "email_add_form";
		} else {
			emailService.saveEmail(email);
			return "redirect:/email_list";
		}
	}
	
	@RequestMapping(value = "/editemail", method = RequestMethod.POST)
	public String editEmail(@Valid @ModelAttribute("email") Email email, BindingResult result) {
		if (result.hasErrors()) {
			return "email_edit_form";
		} else {
			emailService.editEmail(email);
			return "redirect:/email_list";
		}
	}

	@GetMapping("/email_list")
	public String listEmail(Model model) {
		List<Email> email = emailService.getEmail();
		model.addAttribute("email", email);
		return "email_list";
	}

	@GetMapping("/emailedit")
	public String updateEmail(@RequestParam("emailId") UUID emailId, Model model) {
		Email email = emailService.getEmail(emailId);
		model.addAttribute("email", email);
		return "email_edit_form";
	}

	@GetMapping("/emaildelete")
	public String deleteEmail(@RequestParam("emailId") UUID emailId, Model model) {
		emailService.deleteEmail(emailId);
		return "redirect:/email_list";
	}

}
