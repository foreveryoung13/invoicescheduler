package com.nana.bankapp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nana.bankapp.dao.InvoiceDAO;
import com.nana.bankapp.model.Invoice;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	InvoiceDAO invoiceDAO;

	@Override
	@Transactional
	public boolean saveInvoice(Invoice invoice) {
		return invoiceDAO.saveInvoice(invoice);
	}

	@Override
	@Transactional
	public boolean editInvoice(Invoice invoice) {
		return invoiceDAO.editInvoice(invoice);
	}

	@Override
	@Transactional
	public List<Invoice> getInvoices() {
		return invoiceDAO.getInvoices();
	}

	@Override
	@Transactional
	public Invoice getInvoice(String invoice) {
		return invoiceDAO.getInvoice(invoice);
	}

	@Override
	@Transactional
	public boolean deleteInvoice(String invoice) {
		return invoiceDAO.deleteInvoice(invoice);
	}

}
