package com.nana.bankapp.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
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

import com.nana.bankapp.model.Division;
import com.nana.bankapp.model.Marketing;
import com.nana.bankapp.services.DivisionService;
import com.nana.bankapp.services.MarketingService;
import com.nana.bankapp.util.AuthenticationName;

@Controller
@RequestMapping("/marketings")
public class MarketingController {

	@Autowired
	MarketingService ms;

	@Autowired
	DivisionService ds;
	
	@Autowired
	AuthenticationName authName;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		SimpleDateFormat dob = new SimpleDateFormat("dd/MM/yyyy"); 
		
		binder.registerCustomEditor(Date.class, "createdDate", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(Date.class, "updatedDate", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(Date.class, "dateOfBirth", new CustomDateEditor(dob, true, 10));
		
	}
	
	@ModelAttribute("divlist")
	public List<Division> renderDivisionList() {
		List<Division> divlist = ds.getDivision();
		ArrayList<Division> div = new ArrayList<Division>();

		if (divlist.size() > 0) {
			for (Division d : divlist) {
				div.add(new Division(d.getDivisionId(), d.getDivisionName()));
			}
		}
		return div;
	}

	@RequestMapping("/add")
	public String newMarketing(Model model) {
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		model.addAttribute("marketing", new Marketing());
		return "marketing_add_form";
	}

	/*
	@GetMapping("/list")
	public String listMarketings(Model model) {
		List<Marketing> marketing = ms.getMarketings();
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		model.addAttribute("marketing", marketing);
		return "marketing_list";
	}*/

	@GetMapping("/edit")
	public String updateMarketing(@RequestParam("marketingId") String marketingId, Model model) {
		Marketing marketing = ms.getMarketing(marketingId);
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		model.addAttribute("marketing", marketing);
		return "marketing_edit_form";
	}

	@GetMapping("/delete")
	public String deleteMarketing(@RequestParam("marketingId") String marketingId, Model model) {
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		ms.deleteMarketing(marketingId);
		return "redirect:/marketings/list";
	}

	@RequestMapping(value = "/savemarketing", method = RequestMethod.POST)
	public String saveMarketing(@Valid @ModelAttribute("marketing") Marketing marketing, BindingResult result, Model model) {
		String name = authName.getLoginName();
				
		if (result.hasErrors()) {
			model.addAttribute("username", name);
			return "marketing_add_form";
		} else {
			model.addAttribute("username", name);
			ms.saveMarketing(marketing);
			return "redirect:/marketings/list";
		}
	}

	@RequestMapping(value = "/editmarketing", method = RequestMethod.POST)
	public String editMarketing(@Valid @ModelAttribute("marketing") Marketing marketing, BindingResult result, Model model) {
		String name = authName.getLoginName();
		
		if (result.hasErrors()) {
			model.addAttribute("username", name);
			return "marketing_edit_form";
		} else {
			model.addAttribute("username", name);
			ms.editMarketing(marketing);
			return "redirect:/marketings/list?edit=true";
		}
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model, Integer offset, Integer maxResults, @RequestParam(required=false) boolean edit) {
		String name = authName.getLoginName();
		
		if (edit) {
			model.addAttribute("marketing", ms.pageMarketingList(offset, maxResults, true));
		} else {
			model.addAttribute("marketing", ms.pageMarketingList(offset, maxResults, false));
		}
		
		model.addAttribute("username", name);
		model.addAttribute("count", ms.count());
		model.addAttribute("offset", offset);
		return "marketing_list";
	}

}
