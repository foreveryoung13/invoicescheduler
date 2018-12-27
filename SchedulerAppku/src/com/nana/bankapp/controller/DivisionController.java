package com.nana.bankapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping("/add")
	public String newRcustomer(Model model) {
		String name = authName.getLoginName();

		model.addAttribute("username", name);
		model.addAttribute("division", new Division());
		return "division_add_form";
	}

	@GetMapping("/list")
	public String listDivision(Model model) {
		String name = authName.getLoginName();
		List<Division> division = ds.getDivision();

		model.addAttribute("username", name);
		model.addAttribute("division", division);
		return "division_list";
	}

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
			return "redirect:/division/list";
		}
	}

	@RequestMapping(value = "/list/{pageId}", method = RequestMethod.GET)
	public String paginationDivisionList(@PathVariable int pageId, Model model) {
		
		System.out.println(pageId);

		int total = 5;
		if (pageId == 1) {

		} else {
			pageId = (pageId - 1) * total + 1;
		}

		List<Division> divlist = ds.pageDivisionList(pageId, total);
		
		if (divlist != null) {
			System.out.println(divlist.size());
		} else {
			System.out.println("null");
		}

		model.addAttribute("division", divlist);
		return "division_list";
	}

}
