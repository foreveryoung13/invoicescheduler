package com.nana.bankapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nana.bankapp.model.Account;
import com.nana.bankapp.services.AccountService;
import com.nana.bankapp.util.AuthenticationName;

@Controller
@RequestMapping("/account")
public class AccountContoller {

	@Autowired
	AccountService accountService;

	@Autowired
	AuthenticationName authName;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String viewAccount(Model model) {
		String name = authName.getLoginName();

		model.addAttribute("username", name);
		return "findAccount";
	}

	@RequestMapping("/new")
	public String newAccount(Model model) {
		String name = authName.getLoginName();

		model.addAttribute("username", name);
		model.addAttribute("account", new Account());
		return "account_add_form";
	}

	@RequestMapping("/showAccount")
	public String showAccount() {
		return "showAccount";
	}

	@RequestMapping(value = "/saveAccount", method = RequestMethod.POST)
	public String saveAccount(@Valid @ModelAttribute("account") Account account, BindingResult result, Model model) {
		String name = authName.getLoginName();

		if (result.hasErrors()) {
			model.addAttribute("username", name);
			return "account_add_form";
		} else {
			model.addAttribute("username", name);
			accountService.saveAccount(account);
			return "redirect:/account/list";
		}
	}

	@GetMapping("/list")
	public String listAccounts(Model model) {
		List<Account> accounts = accountService.getAccounts();
		String name = authName.getLoginName();

		model.addAttribute("username", name);
		model.addAttribute("accounts", accounts);
		return "listAccounts";
	}

	@GetMapping("/edit")
	public String updateAccount(@RequestParam("accountNo") int accountNo, Model model) {
		String name = authName.getLoginName();
		Account account = accountService.getAccount(new Integer(accountNo));

		model.addAttribute("username", name);
		model.addAttribute("account", account);
		return "account_add_form";
	}

	@GetMapping("/delete")
	public String deleteAccount(@RequestParam("accountNo") int accountNo, Model model) {
		String name = authName.getLoginName();

		model.addAttribute("username", name);
		accountService.deleteAccount(accountNo);
		return "redirect:/account/list";
	}

}
