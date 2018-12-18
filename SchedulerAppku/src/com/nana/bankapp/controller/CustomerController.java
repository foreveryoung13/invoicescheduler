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

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService cs;

	@RequestMapping("/add")
	public String newCustomer(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer_add_form";
	}

	@GetMapping("/list")
	public String listCustomers(Model model) {
		List<Customer> customer = cs.getCustomers();
		model.addAttribute("customer", customer);
		return "customer_list";
	}

	@GetMapping("/edit")
	public String updateCustomer(@RequestParam("customerId") String customerId, Model model) {
		Customer customer = cs.getCustomer(customerId);
		model.addAttribute("customer", customer);
		return "customer_edit_form";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") String customerId, Model model) {
		cs.deleteCustomer(customerId);
		return "redirect:/customer/list";
	}

	@RequestMapping(value = "/savecustomer", method = RequestMethod.POST)
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		if (result.hasErrors()) {
			return "customer_add_form";
		} else {
			cs.saveCustomer(customer);
			return "redirect:/customer/list";
		}
	}

	@RequestMapping(value = "/editcustomer", method = RequestMethod.POST)
	public String editCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		if (result.hasErrors()) {
			return "customer_edit_form";
		} else {
			cs.editCustomer(customer);
			return "redirect:/customer/list";
		}
	}

}
