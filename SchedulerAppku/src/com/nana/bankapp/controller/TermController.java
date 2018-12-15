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

import com.nana.bankapp.model.Term;
import com.nana.bankapp.services.TermService;

@Controller
public class TermController {

	@Autowired
	TermService ps;

	@RequestMapping("/newterm")
	public String newTerm(Model model) {
		model.addAttribute("term", new Term());
		return "term_add_form";
	}

	@RequestMapping(value = "/saveterm", method = RequestMethod.POST)
	public String saveTerm(@Valid @ModelAttribute("term") Term term, BindingResult result) {
		if (result.hasErrors()) {
			return "term_add_form";
		} else {
			ps.saveTerm(term);
			return "redirect:/term_list";
		}
	}

	@RequestMapping(value = "/editterm", method = RequestMethod.POST)
	public String editTerm(@Valid @ModelAttribute("term") Term term, BindingResult result) {
		if (result.hasErrors()) {
			return "term_edit_form";
		} else {
			ps.editTerm(term);
			return "redirect:/term_list";
		}
	}

	@GetMapping("/term_list")
	public String listTerm(Model model) {
		List<Term> term = ps.getTerm();
		model.addAttribute("term", term);
		return "term_list";
	}

	@GetMapping("/termedit")
	public String updateTerm(@RequestParam("termId") UUID termId, Model model) {
		Term term = ps.getTerm(termId);
		model.addAttribute("term", term);
		return "term_edit_form";
	}

	@GetMapping("/termdelete")
	public String deleteTerm(@RequestParam("termId") UUID termId, Model model) {
		ps.deleteTerm(termId);
		return "redirect:/term_list";
	}

}
