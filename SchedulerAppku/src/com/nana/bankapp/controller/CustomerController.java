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

import com.nana.bankapp.model.Customer;
import com.nana.bankapp.services.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService cs;

	@RequestMapping("/newcustomer")
	public String newCustomer(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer_add_form";
	}

	@RequestMapping(value = "/savecustomer", method = RequestMethod.POST)
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		if (result.hasErrors()) {
			return "customer_add_form";
		} else {
			cs.saveCustomer(customer);
			return "redirect:/customer_list";
		}
	}

	@RequestMapping(value = "/editcustomer", method = RequestMethod.POST)
	public String editCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		if (result.hasErrors()) {
			return "customer_edit_form";
		} else {
			cs.editCustomer(customer);
			return "redirect:/customer_list";
		}
	}

	@GetMapping("/customer_list")
	public String listCustomers(Model model) {
		List<Customer> customer = cs.getCustomers();
		model.addAttribute("customer", customer);
		return "customer_list";
	}

	@GetMapping("/customeredit")
	public String updateCustomer(@RequestParam("customerId") UUID customer_id, Model model) {
		Customer customer = cs.getCustomer(customer_id);
		model.addAttribute("customer", customer);
		return "customer_edit_form";
	}

	@GetMapping("/customerdelete")
	public String deleteCustomer(@RequestParam("customerId") UUID customer_id, Model model) {
		cs.deleteCustomer(customer_id);
		return "redirect:/customer_list";
	}

}
