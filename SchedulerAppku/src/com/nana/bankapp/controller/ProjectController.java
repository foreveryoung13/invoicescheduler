package com.nana.bankapp.controller;

import java.util.List;

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

@Controller
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	ProjectService ps;

	@RequestMapping("/add")
	public String newProject(Model model) {
		model.addAttribute("project", new Project());
		return "project_add_form";
	}

	@GetMapping("/list")
	public String listProjects(Model model) {
		List<Project> project = ps.getProjects();
		model.addAttribute("project", project);
		return "project_list";
	}

	@GetMapping("/edit")
	public String updateProject(@RequestParam("projectId") String projectId, Model model) {
		Project project = ps.getProject(projectId);
		model.addAttribute("project", project);
		return "project_edit_form";
	}

	@GetMapping("/delete")
	public String deleteProject(@RequestParam("projectId") String projectId, Model model) {
		ps.deleteProject(projectId);
		return "redirect:/project/list";
	}

	@RequestMapping(value = "/saveproject", method = RequestMethod.POST)
	public String saveProject(@Valid @ModelAttribute("project") Project project, BindingResult result) {
		if (result.hasErrors()) {
			return "project_add_form";
		} else {
			ps.saveProject(project);
			return "redirect:/project/list";
		}
	}

	@RequestMapping(value = "/editproject", method = RequestMethod.POST)
	public String editProject(@Valid @ModelAttribute("project") Project project, BindingResult result) {
		if (result.hasErrors()) {
			return "project_edit_form";
		} else {
			ps.editProject(project);
			return "redirect:/project/list";
		}
	}

}
