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

import com.nana.bankapp.model.Division;
import com.nana.bankapp.services.DivisionService;

@Controller
public class DivisionController {

	@Autowired
	DivisionService ds;

	@RequestMapping("/newdivision")
	public String newRcustomer(Model model) {
		model.addAttribute("division", new Division());
		return "division_add_form";
	}

	@RequestMapping(value = "/savedivision", method = RequestMethod.POST)
	public String saveDivision(@Valid @ModelAttribute("division") Division division, BindingResult result) {
		if (result.hasErrors()) {
			return "division_add_form";
		} else {
			ds.saveDivision(division);
			return "redirect:/division_list";
		}
	}

	@RequestMapping(value = "/editdivision", method = RequestMethod.POST)
	public String editDivision(@Valid @ModelAttribute("division") Division division, BindingResult result) {
		if (result.hasErrors()) {
			return "division_edit_form";
		} else {
			ds.editDivision(division);
			return "redirect:/division_list";
		}
	}

	@GetMapping("/division_list")
	public String listDivision(Model model) {
		List<Division> division = ds.getDivision();
		model.addAttribute("division", division);
		return "division_list";
	}

	@GetMapping("/divisionedit")
	public String updateDivision(@RequestParam("divisionId") UUID divisionId, Model model) {
		Division division = ds.getDivision(divisionId);
		model.addAttribute("division", division);
		return "division_edit_form";
	}

	@GetMapping("/divisiondelete")
	public String deleteDivision(@RequestParam("divisionId") UUID divisionId, Model model) {
		ds.deleteDivision(divisionId);
		return "redirect:/division_list";
	}

}
