package com.nana.bankapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nana.bankapp.editor.CustomerEditor;
import com.nana.bankapp.editor.MarketingEditor;
import com.nana.bankapp.editor.ProjectEditor;
import com.nana.bankapp.editor.RemarkEditor;
import com.nana.bankapp.editor.TermEditor;
import com.nana.bankapp.model.Customer;
import com.nana.bankapp.model.Invoice;
import com.nana.bankapp.model.Marketing;
import com.nana.bankapp.model.Project;
import com.nana.bankapp.model.Remarks;
import com.nana.bankapp.model.Term;
import com.nana.bankapp.services.CustomerService;
import com.nana.bankapp.services.MarketingService;
import com.nana.bankapp.services.ProjectService;
import com.nana.bankapp.services.RemarksService;
import com.nana.bankapp.services.TermService;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

	@Autowired
	CustomerService cs;

	@Autowired
	ProjectService ps;

	@Autowired
	RemarksService rs;

	@Autowired
	MarketingService ms;

	@Autowired
	TermService ts;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Customer.class, new CustomerEditor());
		binder.registerCustomEditor(Project.class, new ProjectEditor());
		binder.registerCustomEditor(Remarks.class, new RemarkEditor());
		binder.registerCustomEditor(Term.class, new TermEditor());
		binder.registerCustomEditor(Marketing.class, new MarketingEditor());
	}

	@ModelAttribute("customerlist")
	public List<Customer> renderCustomerList() {
		List<Customer> customerlist = cs.getCustomers();
		ArrayList<Customer> customer = new ArrayList<Customer>();

		if (customerlist.size() > 0) {
			for (Customer c : customerlist) {
				customer.add(new Customer(c.getCustomerId(), c.getCustomerName()));
			}
		}
		return customer;
	}

	@ModelAttribute("projectlist")
	public List<Project> renderProjectList() {
		List<Project> projectlist = ps.getProjects();
		ArrayList<Project> project = new ArrayList<Project>();

		if (projectlist.size() > 0) {
			for (Project p : projectlist) {
				project.add(new Project(p.getProjectId(), p.getProjectName()));
			}
		}
		return project;
	}

	@ModelAttribute("remarklist")
	public List<Remarks> renderRemarkList() {
		List<Remarks> remarklist = rs.getRemarks();
		ArrayList<Remarks> remark = new ArrayList<Remarks>();

		if (remarklist.size() > 0) {
			for (Remarks r : remarklist) {
				remark.add(new Remarks(r.getRemarksId(), r.getRemarksName()));
			}
		}
		return remark;
	}

	@ModelAttribute("marketinglist")
	public List<Marketing> renderMarketingList() {
		List<Marketing> marketinglist = ms.getMarketings();
		ArrayList<Marketing> marketing = new ArrayList<Marketing>();

		if (marketinglist.size() > 0) {
			for (Marketing m : marketinglist) {
				marketing.add(new Marketing(m.getMarketingId(), m.getFirstName()));
			}
		}
		return marketing;
	}

	@ModelAttribute("termlist")
	public List<Term> renderTermList() {
		List<Term> termlist = ts.getTerm();
		ArrayList<Term> term = new ArrayList<Term>();

		if (termlist.size() > 0) {
			for (Term t : termlist) {
				term.add(new Term(t.getTermId(), t.getTermName()));
			}
		}
		return term;
	}

	@RequestMapping("/add")
	public String newInvoice(Model model) {
		model.addAttribute("invoice", new Invoice());
		return "invoice_add_form";
	}
}
