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

import com.nana.bankapp.model.Remarks;
import com.nana.bankapp.services.RemarksService;
import com.nana.bankapp.util.AuthenticationName;

@Controller
@RequestMapping("/remark")
public class RemarksController {

	@Autowired
	RemarksService ps;
	
	@Autowired
	AuthenticationName authName;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		binder.registerCustomEditor(Date.class, "createdDate", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(Date.class, "updatedDate", new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping("/add")
	public String newRemarks(Model model) {
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		model.addAttribute("remarks", new Remarks());
		return "remarks_add_form";
	}

	/*
	@GetMapping("/list")
	public String listRemarks(Model model) {
		List<Remarks> remarks = ps.getRemarks();
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		model.addAttribute("remarks", remarks);
		return "remarks_list";
	} */

	@GetMapping("/edit")
	public String updateRemarks(@RequestParam("remarksId") String remarksId, Model model) {
		Remarks remarks = ps.getRemarks(remarksId);
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);		
		model.addAttribute("remarks", remarks);
		return "remarks_edit_form";
	}

	@GetMapping("/delete")
	public String deleteRemarks(@RequestParam("remarksId") String remarksId, Model model) {
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		ps.deleteRemarks(remarksId);
		return "redirect:/remark/list";
	}

	@RequestMapping(value = "/saveremarks", method = RequestMethod.POST)
	public String saveRemarks(@Valid @ModelAttribute("remarks") Remarks remarks, BindingResult result, Model model) {
		String name = authName.getLoginName();				
		
		if (result.hasErrors()) {
			model.addAttribute("username", name);
			return "remarks_add_form";
		} else {
			model.addAttribute("username", name);
			ps.saveRemarks(remarks);
			return "redirect:/remark/list";
		}
	}

	@RequestMapping(value = "/editremarks", method = RequestMethod.POST)
	public String editRemarks(@Valid @ModelAttribute("remarks") Remarks remarks, BindingResult result, Model model) {
		String name = authName.getLoginName();	
		
		if (result.hasErrors()) {
			model.addAttribute("username", name);
			return "remarks_edit_form";
		} else {
			model.addAttribute("username", name);
			ps.editRemarks(remarks);
			return "redirect:/remark/list?edit=true";
		}
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model, Integer offset, Integer maxResults, @RequestParam(required=false) boolean edit) {
		String name = authName.getLoginName();
		
		if (edit) {
			model.addAttribute("remarks", ps.pageRemarksList(offset, maxResults, true));
		} else {
			model.addAttribute("remarks", ps.pageRemarksList(offset, maxResults, false));
		}
		
		model.addAttribute("username", name);
		model.addAttribute("count", ps.count());
		model.addAttribute("offset", offset);
		return "remarks_list";
	}

}
