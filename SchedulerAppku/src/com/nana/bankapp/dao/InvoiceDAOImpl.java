package com.nana.bankapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nana.bankapp.entity.InvoiceEntity;
import com.nana.bankapp.model.Invoice;

@Repository
public class InvoiceDAOImpl implements InvoiceDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveInvoice(Invoice invoice) {
		boolean saveFlag = true;
		InvoiceEntity me = new InvoiceEntity();
		me.setInvoiceId(UUID.randomUUID().toString());
		me.setCustomerId(invoice.getCustomerId());
		me.setProjectId(invoice.getProjectId());
		me.setRemarksId(invoice.getRemarksId());
		me.setNoPo(invoice.getNoPo());
		me.setMarketingId(invoice.getMarketingId());
		me.setNoInvoice(invoice.getNoInvoice());
		me.setNoPajak(invoice.getNoPajak());
		me.setTanggalInvoice(invoice.getTanggalInvoice());
		me.setTanggalTt(invoice.getTanggalTt());
		me.setTermId(invoice.getTermId());
		me.setTanggalTempo(invoice.getTanggalTempo());
		me.setPiutangUsaha(invoice.getPiutangUsaha());
		me.setDpp(invoice.getDpp());
		me.setPpn(invoice.getPpn());
		me.setPph(invoice.getPph());
		me.setUangMasuk(invoice.getUangMasuk());
		me.setTanggalLunas(invoice.getTanggalLunas());
		me.setCreatedBy(invoice.getCreatedBy());
		me.setCreatedDate(invoice.getCreatedDate());
		me.setUpdatedBy(invoice.getUpdatedBy());
		me.setUpdatedDate(invoice.getUpdatedDate());
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(me);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public boolean editInvoice(Invoice invoice) {
		boolean saveFlag = true;
		InvoiceEntity me = new InvoiceEntity();
		me.setInvoiceId(invoice.getInvoiceId());
		me.setCustomerId(invoice.getCustomerId());
		me.setProjectId(invoice.getProjectId());
		me.setRemarksId(invoice.getRemarksId());
		me.setNoPo(invoice.getNoPo());
		me.setMarketingId(invoice.getMarketingId());
		me.setNoInvoice(invoice.getNoInvoice());
		me.setNoPajak(invoice.getNoPajak());
		me.setTanggalInvoice(invoice.getTanggalInvoice());
		me.setTanggalTt(invoice.getTanggalTt());
		me.setTermId(invoice.getTermId());
		me.setTanggalTempo(invoice.getTanggalTempo());
		me.setPiutangUsaha(invoice.getPiutangUsaha());
		me.setDpp(invoice.getDpp());
		me.setPpn(invoice.getPpn());
		me.setPph(invoice.getPph());
		me.setUangMasuk(invoice.getUangMasuk());
		me.setTanggalLunas(invoice.getTanggalLunas());
		me.setCreatedBy(invoice.getCreatedBy());
		me.setCreatedDate(invoice.getCreatedDate());
		me.setUpdatedBy(invoice.getUpdatedBy());
		me.setUpdatedDate(invoice.getUpdatedDate());
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.update(me);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public List<Invoice> getInvoices() {
		List<Invoice> list = new ArrayList<Invoice>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<InvoiceEntity> query = session.createQuery("FROM InvoiceEntity", InvoiceEntity.class);
			List<InvoiceEntity> invoices = query.getResultList();
			for (int i = 0; i < invoices.size(); i++) {
				InvoiceEntity invoice = (InvoiceEntity) invoices.get(i);
				Invoice me = new Invoice();
				me.setInvoiceId(invoice.getInvoiceId());
				me.setCustomerId(invoice.getCustomerId());
				me.setProjectId(invoice.getProjectId());
				me.setRemarksId(invoice.getRemarksId());
				me.setNoPo(invoice.getNoPo());
				me.setMarketingId(invoice.getMarketingId());
				me.setNoInvoice(invoice.getNoInvoice());
				me.setNoPajak(invoice.getNoPajak());
				me.setTanggalInvoice(invoice.getTanggalInvoice());
				me.setTanggalTt(invoice.getTanggalTt());
				me.setTermId(invoice.getTermId());
				me.setTanggalTempo(invoice.getTanggalTempo());
				me.setPiutangUsaha(invoice.getPiutangUsaha());
				me.setDpp(invoice.getDpp());
				me.setPpn(invoice.getPpn());
				me.setPph(invoice.getPph());
				me.setUangMasuk(invoice.getUangMasuk());
				me.setTanggalLunas(invoice.getTanggalLunas());
				me.setCreatedBy(invoice.getCreatedBy());
				me.setCreatedDate(invoice.getCreatedDate());
				me.setUpdatedBy(invoice.getUpdatedBy());
				me.setUpdatedDate(invoice.getUpdatedDate());
				list.add(me);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Invoice> pageInvoiceList(Integer offset, Integer maxResults) {
		List<Invoice> list = new ArrayList<Invoice>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<InvoiceEntity> query = session.createQuery("FROM InvoiceEntity", InvoiceEntity.class);
			query.setFirstResult(offset != null ? offset : 0);
			query.setMaxResults(maxResults != null ? maxResults : 10);

			List<InvoiceEntity> invoices = query.getResultList();

			if (invoices != null) {
				for (int i = 0; i < invoices.size(); i++) {
					InvoiceEntity invoice = (InvoiceEntity) invoices.get(i);
					Invoice me = new Invoice();
					me.setInvoiceId(invoice.getInvoiceId());
					me.setCustomerId(invoice.getCustomerId());
					me.setProjectId(invoice.getProjectId());
					me.setRemarksId(invoice.getRemarksId());
					me.setNoPo(invoice.getNoPo());
					me.setMarketingId(invoice.getMarketingId());
					me.setNoInvoice(invoice.getNoInvoice());
					me.setNoPajak(invoice.getNoPajak());
					me.setTanggalInvoice(invoice.getTanggalInvoice());
					me.setTanggalTt(invoice.getTanggalTt());
					me.setTermId(invoice.getTermId());
					me.setTanggalTempo(invoice.getTanggalTempo());
					me.setPiutangUsaha(invoice.getPiutangUsaha());
					me.setDpp(invoice.getDpp());
					me.setPpn(invoice.getPpn());
					me.setPph(invoice.getPph());
					me.setUangMasuk(invoice.getUangMasuk());
					me.setTanggalLunas(invoice.getTanggalLunas());
					me.setCreatedBy(invoice.getCreatedBy());
					me.setCreatedDate(invoice.getCreatedDate());
					me.setUpdatedBy(invoice.getUpdatedBy());
					me.setUpdatedDate(invoice.getUpdatedDate());
					list.add(me);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Invoice getInvoice(String InvoiceId) {
		Invoice me = new Invoice();
		try {
			Session session = sessionFactory.getCurrentSession();
			InvoiceEntity invoice = (InvoiceEntity) session.load(InvoiceEntity.class, InvoiceId);
			me.setInvoiceId(invoice.getInvoiceId());
			me.setCustomerId(invoice.getCustomerId());
			me.setProjectId(invoice.getProjectId());
			me.setRemarksId(invoice.getRemarksId());
			me.setNoPo(invoice.getNoPo());
			me.setMarketingId(invoice.getMarketingId());
			me.setNoInvoice(invoice.getNoInvoice());
			me.setNoPajak(invoice.getNoPajak());
			me.setTanggalInvoice(invoice.getTanggalInvoice());
			me.setTanggalTt(invoice.getTanggalTt());
			me.setTermId(invoice.getTermId());
			me.setTanggalTempo(invoice.getTanggalTempo());
			me.setPiutangUsaha(invoice.getPiutangUsaha());
			me.setDpp(invoice.getDpp());
			me.setPpn(invoice.getPpn());
			me.setPph(invoice.getPph());
			me.setUangMasuk(invoice.getUangMasuk());
			me.setTanggalLunas(invoice.getTanggalLunas());
			me.setCreatedBy(invoice.getCreatedBy());
			me.setCreatedDate(invoice.getCreatedDate());
			me.setUpdatedBy(invoice.getUpdatedBy());
			me.setUpdatedDate(invoice.getUpdatedDate());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return me;
	}

	@Override
	public boolean deleteInvoice(String invoiceId) {
		boolean deleteFlag = true;
		try {
			Session session = sessionFactory.getCurrentSession();
			InvoiceEntity me = (InvoiceEntity) session.load(InvoiceEntity.class, invoiceId);
			session.delete(me);
		} catch (Exception e) {
			e.printStackTrace();
			deleteFlag = false;
		}
		return deleteFlag;
	}

	@Override
	public Long count() {
		Session session = sessionFactory.getCurrentSession();
		Long rowCount = null;
		try {
			Criteria criteria = session.createCriteria(InvoiceEntity.class).setProjection(Projections.rowCount());
			List result = criteria.list();

			if (!result.isEmpty()) {
				rowCount = (Long) result.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}

}
