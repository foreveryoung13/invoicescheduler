package com.nana.bankapp.controller;

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

import com.nana.bankapp.model.Project;
import com.nana.bankapp.services.ProjectService;
import com.nana.bankapp.util.AuthenticationName;

@Controller
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	ProjectService ps;
	
	@Autowired
	AuthenticationName authName;

	@RequestMapping("/add")
	public String newProject(Model model) {
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		model.addAttribute("project", new Project());
		return "project_add_form";
	}

	/*
	@GetMapping("/list")
	public String listProjects(Model model) {
		List<Project> project = ps.getProjects();
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		model.addAttribute("project", project);
		return "project_list";
	}*/

	@GetMapping("/edit")
	public String updateProject(@RequestParam("projectId") String projectId, Model model) {
		Project project = ps.getProject(projectId);
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		model.addAttribute("project", project);
		return "project_edit_form";
	}

	@GetMapping("/delete")
	public String deleteProject(@RequestParam("projectId") String projectId, Model model) {
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		ps.deleteProject(projectId);
		return "redirect:/project/list";
	}

	@RequestMapping(value = "/saveproject", method = RequestMethod.POST)
	public String saveProject(@Valid @ModelAttribute("project") Project project, BindingResult result,  Model model) {
		String name = authName.getLoginName();
		
		if (result.hasErrors()) {
			model.addAttribute("username", name);
			return "project_add_form";
		} else {
			model.addAttribute("username", name);
			ps.saveProject(project);
			return "redirect:/project/list";
		}
	}

	@RequestMapping(value = "/editproject", method = RequestMethod.POST)
	public String editProject(@Valid @ModelAttribute("project") Project project, BindingResult result,  Model model) {
		String name = authName.getLoginName();
		
		if (result.hasErrors()) {
			model.addAttribute("username", name);
			return "project_edit_form";
		} else {
			model.addAttribute("username", name);
			ps.editProject(project);
			return "redirect:/project/list?edit=true";
		}
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model, Integer offset, Integer maxResults, @RequestParam(required=false) boolean edit) {
		String name = authName.getLoginName();
		
		if (edit) {
			model.addAttribute("project", ps.pageProjectList(offset, maxResults, true));
		} else {
			model.addAttribute("project", ps.pageProjectList(offset, maxResults, false));
		}
		
		model.addAttribute("username", name);
		model.addAttribute("count", ps.count());
		model.addAttribute("offset", offset);
		return "project_list";
	}

}
