package com.nana.bankapp.controller;

import java.util.List;

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

import com.nana.bankapp.model.Customer;
import com.nana.bankapp.services.CustomerService;
import com.nana.bankapp.util.AuthenticationName;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService cs;
	
	@Autowired
	AuthenticationName authName;
	
	@RequestMapping("/add")
	public String newCustomer(Model model) {
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		model.addAttribute("customer", new Customer());
		return "customer_add_form";
	}

	@GetMapping("/list")
	public String listCustomers(Model model) {
		List<Customer> customer = cs.getCustomers();
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		model.addAttribute("customer", customer);
		return "customer_list";
	}

	@GetMapping("/edit")
	public String updateCustomer(@RequestParam("customerId") String customerId, Model model) {
		Customer customer = cs.getCustomer(customerId);
		String name = authName.getLoginName();
		model.addAttribute("username", name);
		model.addAttribute("customer", customer);
		return "customer_edit_form";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") String customerId, Model model) {
		String name = authName.getLoginName();
		model.addAttribute("username", name);		
		cs.deleteCustomer(customerId);
		return "redirect:/customer/list";
	}

	@RequestMapping(value = "/savecustomer", method = RequestMethod.POST)
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, Model model) {
		String name = authName.getLoginName();
		if (result.hasErrors()) {
			model.addAttribute("username", name);
			return "customer_add_form";
		} else {
			model.addAttribute("username", name);
			cs.saveCustomer(customer);
			return "redirect:/customer/list";
		}
	}

	@RequestMapping(value = "/editcustomer", method = RequestMethod.POST)
	public String editCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, Model model) {
		String name = authName.getLoginName();
		if (result.hasErrors()) {
			model.addAttribute("username", name);
			return "customer_edit_form";
		} else {
			model.addAttribute("username", name);
			cs.editCustomer(customer);
			return "redirect:/customer/list";
		}
	}

}
