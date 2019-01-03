package com.nana.bankapp.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trx_invoice")
public class InvoiceEntity {

	@Id
	@Column(name = "INVOICE_ID")
	protected String invoiceId;

	@Column(name = "CUSTOMER_ID")
	protected String customerId;

	@Column(name = "PROJECT_ID")
	protected String projectId;

	@Column(name = "REMARKS_ID")
	protected String remarksId;

	@Column(name = "NO_PO")
	protected String noPo;

	@Column(name = "MARKETING_ID")
	protected String marketingId;

	@Column(name = "NO_INVOICE")
	protected String noInvoice;

	@Column(name = "NO_PAJAK")
	protected String noPajak;

	@Column(name = "TANGGAL_INVOICE")
	protected Date tanggalInvoice;

	@Column(name = "TANGGAL_TT")
	protected Date tanggalTt;

	@Column(name = "TERM_ID")
	protected String termId;

	@Column(name = "TANGGAL_TEMPO")
	protected Date tanggalTempo;

	@Column(name = "PIUTANG_USAHA")
	protected BigDecimal piutangUsaha;

	@Column(name = "DPP")
	protected BigDecimal dpp;

	@Column(name = "PPN")
	protected BigDecimal ppn;

	@Column(name = "PPH")
	protected BigDecimal pph;

	@Column(name = "UANG_MASUK")
	protected BigDecimal uangMasuk;

	@Column(name = "TANGGAL_LUNAS")
	protected Date tanggalLunas;

	@Column(name = "CREATED_BY")
	protected String createdBy;

	@Column(name = "CREATED_DATE")
	protected Date createdDate;

	@Column(name = "UPDATED_BY")
	protected String updatedBy;

	@Column(name = "UPDATED_DATE")
	protected Date updatedDate;

	@Column(name = "FLAG")
	protected String flag;

	public String getInvoiceId() {
		return invoiceId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getProjectId() {
		return projectId;
	}

	public String getRemarksId() {
		return remarksId;
	}

	public String getNoPo() {
		return noPo;
	}

	public String getMarketingId() {
		return marketingId;
	}

	public String getNoInvoice() {
		return noInvoice;
	}

	public String getNoPajak() {
		return noPajak;
	}

	public Date getTanggalInvoice() {
		return tanggalInvoice;
	}

	public Date getTanggalTt() {
		return tanggalTt;
	}

	public String getTermId() {
		return termId;
	}

	public Date getTanggalTempo() {
		return tanggalTempo;
	}

	public BigDecimal getPiutangUsaha() {
		return piutangUsaha;
	}

	public BigDecimal getDpp() {
		return dpp;
	}

	public BigDecimal getPpn() {
		return ppn;
	}

	public BigDecimal getPph() {
		return pph;
	}

	public BigDecimal getUangMasuk() {
		return uangMasuk;
	}

	public Date getTanggalLunas() {
		return tanggalLunas;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public String getFlag() {
		return flag;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public void setRemarksId(String remarksId) {
		this.remarksId = remarksId;
	}

	public void setNoPo(String noPo) {
		this.noPo = noPo;
	}

	public void setMarketingId(String marketingId) {
		this.marketingId = marketingId;
	}

	public void setNoInvoice(String noInvoice) {
		this.noInvoice = noInvoice;
	}

	public void setNoPajak(String noPajak) {
		this.noPajak = noPajak;
	}

	public void setTanggalInvoice(Date tanggalInvoice) {
		this.tanggalInvoice = tanggalInvoice;
	}

	public void setTanggalTt(Date tanggalTt) {
		this.tanggalTt = tanggalTt;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public void setTanggalTempo(Date tanggalTempo) {
		this.tanggalTempo = tanggalTempo;
	}

	public void setPiutangUsaha(BigDecimal piutangUsaha) {
		this.piutangUsaha = piutangUsaha;
	}

	public void setDpp(BigDecimal dpp) {
		this.dpp = dpp;
	}

	public void setPpn(BigDecimal ppn) {
		this.ppn = ppn;
	}

	public void setPph(BigDecimal pph) {
		this.pph = pph;
	}

	public void setUangMasuk(BigDecimal uangMasuk) {
		this.uangMasuk = uangMasuk;
	}

	public void setTanggalLunas(Date tanggalLunas) {
		this.tanggalLunas = tanggalLunas;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}
