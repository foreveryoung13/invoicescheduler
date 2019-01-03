package com.nana.bankapp.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.scheduling.annotation.Scheduled;
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

import com.nana.bankapp.customeditor.NoInvoiceEditor;
import com.nana.bankapp.customeditor.NoPoEditor;
import com.nana.bankapp.model.Customer;
import com.nana.bankapp.model.Invoice;
import com.nana.bankapp.model.Marketing;
import com.nana.bankapp.model.Project;
import com.nana.bankapp.model.Remarks;
import com.nana.bankapp.model.Term;
import com.nana.bankapp.services.CustomerService;
import com.nana.bankapp.services.InvoiceService;
import com.nana.bankapp.services.MarketingService;
import com.nana.bankapp.services.ProjectService;
import com.nana.bankapp.services.RemarksService;
import com.nana.bankapp.services.TermService;
import com.nana.bankapp.util.AuthenticationName;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

	@Autowired
	InvoiceService is;

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
	
	@Autowired
	AuthenticationName authName;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dob = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		
		binder.registerCustomEditor(Date.class, "tanggalInvoice", new CustomDateEditor(dob, true, 10));
		binder.registerCustomEditor(Date.class, "tanggalTt", new CustomDateEditor(dob, true, 10));
		binder.registerCustomEditor(Date.class, "tanggalTempo", new CustomDateEditor(dob, true, 10));
		binder.registerCustomEditor(Date.class, "tanggalLunas", new CustomDateEditor(dob, true, 10));
		
		binder.registerCustomEditor(Date.class, "createdDate", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(Date.class, "updatedDate", new CustomDateEditor(dateFormat, false));
		
		binder.registerCustomEditor(String.class, "noPo", new NoPoEditor());
		binder.registerCustomEditor(String.class, "noInvoice", new NoInvoiceEditor());
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
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		model.addAttribute("invoice", new Invoice());
		return "invoice_add_form";
	}

	/*
	@GetMapping("/list")
	public String listInvoice(Model model) {
		List<Invoice> invoice = is.getInvoices();
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		model.addAttribute("invoice", invoice);
		return "invoice_list";
	} */
	
	@GetMapping("/edit")
	public String updateInvoice(@RequestParam("invoiceId") String invoiceId, Model model) {
		String name = authName.getLoginName();
		Invoice invoice = is.getInvoice(invoiceId);
		
		model.addAttribute("username", name);
		model.addAttribute("invoice", invoice);
		return "invoice_edit_form";
	}
	
	@GetMapping("/delete")
	public String deleteInvoice(@RequestParam("invoiceId") String invoiceId, Model model) {
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		is.deleteInvoice(invoiceId);
		return "redirect:/invoice/list";
	}

	
	@RequestMapping(value = "/saveinvoice", method = RequestMethod.POST)
	public String saveInvoice(@Valid @ModelAttribute("invoice") Invoice invoice, BindingResult result, Model model) {
		String name = authName.getLoginName();
		
		if (result.hasErrors()) {
			model.addAttribute("username", name);
			return "invoice_add_form";
		} else {
			model.addAttribute("username", name);
			is.saveInvoice(invoice);
			return "redirect:/invoice/list";
		}
	}
	
	@RequestMapping(value = "/editinvoice", method = RequestMethod.POST)
	public String editInvoice(@Valid @ModelAttribute("invoice") Invoice invoice, BindingResult result, Model model) {
		String name = authName.getLoginName();
		
		if (result.hasErrors()) {
			model.addAttribute("username", name);
			return "invoice_edit_form";
		} else {
			model.addAttribute("username", name);
			is.editInvoice(invoice);
			return "redirect:/invoice/list";
		}
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model, Integer offset, Integer maxResults) {
		String name = authName.getLoginName();
		
		model.addAttribute("username", name);
		model.addAttribute("invoice", is.pageInvoiceList(offset, maxResults));
		model.addAttribute("count", is.count());
		model.addAttribute("offset", offset);
		return "invoice_list";
	}
	
	@Scheduled(fixedDelay = 5000)
	public void run() throws InterruptedException {
		System.out.println("Fixed delay scheduler is running at " + new Date());
		Thread.sleep(3000);
	}

}
