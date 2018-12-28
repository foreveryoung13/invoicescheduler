package com.nana.bankapp.services;

import java.util.List;

import com.nana.bankapp.model.Invoice;

public interface InvoiceService {

	public boolean saveInvoice(Invoice invoice);
	public boolean editInvoice(Invoice invoice);
	public List<Invoice> getInvoices();
	public List<Invoice> pageInvoiceList(Integer offset, Integer maxResults);
	public Invoice getInvoice(String invoiceId);
	public boolean deleteInvoice(String invoiceId);
	public Long count();
	
}