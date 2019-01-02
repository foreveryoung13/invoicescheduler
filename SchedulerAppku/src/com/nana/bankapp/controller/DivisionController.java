package com.nana.bankapp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
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
import com.nana.bankapp.services.DivisionService;
import com.nana.bankapp.util.AuthenticationName;

@Controller
@RequestMapping("/division")
public class DivisionController {

	@Autowired
	DivisionService ds;

	@Autowired
	AuthenticationName authName;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		binder.registerCustomEditor(Date.class, "createdDate", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(Date.class, "updatedDate", new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping("/add")
	public String newRcustomer(Model model) {
		String name = authName.getLoginName();

		model.addAttribute("username", name);
		model.addAttribute("division", new Division());
		return "division_add_form";
	}

	/*
	@GetMapping("/list")
	public String listDivision(Model model) {
		String name = authName.getLoginName();
		List<Division> division = ds.getDivision();

		model.addAttribute("username", name);
		model.addAttribute("division", division);
		return "division_list";
	} */

	@GetMapping("/edit")
	public String updateDivision(@RequestParam("divisionId") String divisionId, Model model) {
		Division division = ds.getDivision(divisionId);
		String name = authName.getLoginName();

		model.addAttribute("username", name);
		model.addAttribute("division", division);
		return "division_edit_form";
	}

	@GetMapping("/delete")
	public String deleteDivision(@RequestParam("divisionId") String divisionId, Model model) {
		String name = authName.getLoginName();
		model.addAttribute("username", name);

		ds.deleteDivision(divisionId);
		return "redirect:/division/list";
	}

	@RequestMapping(value = "/savedivision", method = RequestMethod.POST)
	public String saveDivision(@Valid @ModelAttribute("division") Division division, BindingResult result,
			Model model) {
		String name = authName.getLoginName();

		if (result.hasErrors()) {
			model.addAttribute("username", name);
			return "division_add_form";
		} else {
			model.addAttribute("username", name);
			ds.saveDivision(division);
			return "redirect:/division/list";
		}
	}

	@RequestMapping(value = "/editdivision", method = RequestMethod.POST)
	public String editDivision(@Valid @ModelAttribute("division") Division division, BindingResult result,
			Model model) {
		String name = authName.getLoginName();

		if (result.hasErrors()) {
			model.addAttribute("username", name);
			return "division_edit_form";
		} else {
			model.addAttribute("username", name);
			ds.editDivision(division);
			return "redirect:/division/list?edit=true";
		}
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model, Integer offset, Integer maxResults, @RequestParam(required=false) boolean edit) {
		String name = authName.getLoginName();
		
		if (edit) {
			model.addAttribute("division", ds.pageDivisionList(offset, maxResults, true));
		} else {
			model.addAttribute("division", ds.pageDivisionList(offset, maxResults, false));
		}
		
		model.addAttribute("username", name);
		model.addAttribute("count", ds.count());
		model.addAttribute("offset", offset);
		return "division_list";
	}

}
