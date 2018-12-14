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

import com.nana.bankapp.model.Marketing;
import com.nana.bankapp.services.MarketingService;

@Controller
public class MarketingController {

	@Autowired
	MarketingService ms;

	@RequestMapping("/newmarketing")
	public String newMarketing(Model model) {
		model.addAttribute("marketing", new Marketing());
		return "marketing_add_form";
	}

	@RequestMapping(value = "/savemarketing", method = RequestMethod.POST)
	public String saveAccount(@Valid @ModelAttribute("marketing") Marketing marketing, BindingResult result) {
		if (result.hasErrors()) {
			return "marketing_add_form";
		} else {
			ms.saveMarketing(marketing);
			return "redirect:/marketing_list";
		}
	}

	@RequestMapping(value = "/editmarketing", method = RequestMethod.POST)
	public String editMarketing(@Valid @ModelAttribute("marketing") Marketing marketing, BindingResult result) {
		if (result.hasErrors()) {
			return "marketing_edit_form";
		} else {
			ms.editMarketing(marketing);
			return "redirect:/marketing_list";
		}
	}

	@GetMapping("/marketing_list")
	public String listMarketings(Model model) {
		List<Marketing> marketing = ms.getMarketings();
		model.addAttribute("marketing", marketing);
		return "marketing_list";
	}

	@GetMapping("/marketingedit")
	public String updateMarketing(@RequestParam("marketingId") UUID marketingId, Model model) {
		Marketing marketing = ms.getMarketing(marketingId);
		model.addAttribute("marketing", marketing);
		return "marketing_edit_form";
	}

	@GetMapping("/marketingdelete")
	public String deleteMarketing(@RequestParam("marketingId") UUID marketingId, Model model) {
		ms.deleteMarketing(marketingId);
		return "redirect:/marketing_list";
	}

}
