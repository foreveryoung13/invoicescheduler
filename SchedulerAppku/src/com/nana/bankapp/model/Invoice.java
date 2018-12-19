package com.nana.bankapp.model;

import java.math.BigDecimal;
import java.util.Date;

public class Invoice {

	protected String invoiceId;
	protected String customerId;
	protected String projectId;
	protected String remarksId;
	protected String noPo;
	protected String marketingId;
	protected String noInvoice;
	protected String noPajak;
	protected Date tanggalInvoice;
	protected Date tanggalTt;
	protected String termId;
	protected Date tanggalTempo;
	protected BigDecimal piutangUsaha;
	protected BigDecimal dpp;
	protected BigDecimal ppn;
	protected BigDecimal pph;
	protected BigDecimal uangMasuk;
	protected Date tanggalLunas;
	protected String createdBy;
	protected Date createdDate;
	protected String updatedBy;
	protected Date updatedDate;

	public Invoice() {
	}

	public Invoice(String invoiceId, String customerId, String projectId, String remarksId, String noPo,
			String marketingId, String noInvoice, String noPajak, Date tanggalInvoice, Date tanggalTt, String termId,
			Date tanggalTempo, BigDecimal piutangUsaha, BigDecimal dpp, BigDecimal ppn, BigDecimal pph,
			BigDecimal uangMasuk, Date tanggalLunas, String createdBy, Date createdDate, String updatedBy,
			Date updatedDate) {
		super();
		this.invoiceId = invoiceId;
		this.customerId = customerId;
		this.projectId = projectId;
		this.remarksId = remarksId;
		this.noPo = noPo;
		this.marketingId = marketingId;
		this.noInvoice = noInvoice;
		this.noPajak = noPajak;
		this.tanggalInvoice = tanggalInvoice;
		this.tanggalTt = tanggalTt;
		this.termId = termId;
		this.tanggalTempo = tanggalTempo;
		this.piutangUsaha = piutangUsaha;
		this.dpp = dpp;
		this.ppn = ppn;
		this.pph = pph;
		this.uangMasuk = uangMasuk;
		this.tanggalLunas = tanggalLunas;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getRemarksId() {
		return remarksId;
	}

	public void setRemarksId(String remarksId) {
		this.remarksId = remarksId;
	}

	public String getNoPo() {
		return noPo;
	}

	public void setNoPo(String noPo) {
		this.noPo = noPo;
	}

	public String getMarketingId() {
		return marketingId;
	}

	public void setMarketingId(String marketingId) {
		this.marketingId = marketingId;
	}

	public String getNoInvoice() {
		return noInvoice;
	}

	public void setNoInvoice(String noInvoice) {
		this.noInvoice = noInvoice;
	}

	public String getNoPajak() {
		return noPajak;
	}

	public void setNoPajak(String noPajak) {
		this.noPajak = noPajak;
	}

	public Date getTanggalInvoice() {
		return tanggalInvoice;
	}

	public void setTanggalInvoice(Date tanggalInvoice) {
		this.tanggalInvoice = tanggalInvoice;
	}

	public Date getTanggalTt() {
		return tanggalTt;
	}

	public void setTanggalTt(Date tanggalTt) {
		this.tanggalTt = tanggalTt;
	}

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public Date getTanggalTempo() {
		return tanggalTempo;
	}

	public void setTanggalTempo(Date tanggalTempo) {
		this.tanggalTempo = tanggalTempo;
	}

	public BigDecimal getPiutangUsaha() {
		return piutangUsaha;
	}

	public void setPiutangUsaha(BigDecimal piutangUsaha) {
		this.piutangUsaha = piutangUsaha;
	}

	public BigDecimal getDpp() {
		return dpp;
	}

	public void setDpp(BigDecimal dpp) {
		this.dpp = dpp;
	}

	public BigDecimal getPpn() {
		return ppn;
	}

	public void setPpn(BigDecimal ppn) {
		this.ppn = ppn;
	}

	public BigDecimal getPph() {
		return pph;
	}

	public void setPph(BigDecimal pph) {
		this.pph = pph;
	}

	public BigDecimal getUangMasuk() {
		return uangMasuk;
	}

	public void setUangMasuk(BigDecimal uangMasuk) {
		this.uangMasuk = uangMasuk;
	}

	public Date getTanggalLunas() {
		return tanggalLunas;
	}

	public void setTanggalLunas(Date tanggalLunas) {
		this.tanggalLunas = tanggalLunas;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
