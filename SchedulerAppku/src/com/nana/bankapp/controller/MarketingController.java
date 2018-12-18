package com.nana.bankapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.nana.bankapp.editor.DivisionEditor;
import com.nana.bankapp.model.Division;
import com.nana.bankapp.model.Marketing;
import com.nana.bankapp.services.DivisionService;
import com.nana.bankapp.services.MarketingService;

@Controller
@RequestMapping("/marketings")
public class MarketingController {

	@Autowired
	MarketingService ms;

	@Autowired
	DivisionService ds;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Division.class, new DivisionEditor());
	}

	@RequestMapping("/add")
	public String newMarketing(Model model) {
		List<Division> divlist = ds.getDivision();
		model.addAttribute("divlist", divlist);
		model.addAttribute("marketing", new Marketing());
		return "marketing_add_form";
	}

	@GetMapping("/list")
	public String listMarketings(Model model) {
		List<Marketing> marketing = ms.getMarketings();
		model.addAttribute("marketing", marketing);
		return "marketing_list";
	}

	@GetMapping("/edit")
	public String updateMarketing(@RequestParam("marketingId") String marketingId, Model model) {
		Marketing marketing = ms.getMarketing(marketingId);
		model.addAttribute("marketing", marketing);
		return "marketing_edit_form";
	}

	@GetMapping("/delete")
	public String deleteMarketing(@RequestParam("marketingId") String marketingId, Model model) {
		ms.deleteMarketing(marketingId);
		return "redirect:/marketings/list";
	}

	@RequestMapping(value = "/savemarketing", method = RequestMethod.POST)
	public String saveAccount(@Valid @ModelAttribute("marketing") Marketing marketing, BindingResult result) {
		if (result.hasErrors()) {
			return "marketing_add_form";
		} else {
			ms.saveMarketing(marketing);
			return "redirect:/marketings/list";
		}
	}

	@RequestMapping(value = "/editmarketing", method = RequestMethod.POST)
	public String editMarketing(@Valid @ModelAttribute("marketing") Marketing marketing, BindingResult result) {
		if (result.hasErrors()) {
			return "marketing_edit_form";
		} else {
			ms.editMarketing(marketing);
			return "redirect:/marketings/list";
		}
	}

}
