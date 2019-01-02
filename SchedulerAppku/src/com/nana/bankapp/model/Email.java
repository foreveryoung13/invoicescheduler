package com.nana.bankapp.model;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

public class Email {

	protected String emailId;
	
	@NotEmpty(message = "Sender Name No can't be blank")
	protected String sender;
	
	@NotEmpty(message = "Recipients Name No can't be blank")
	protected String recipients;
	
	@NotEmpty(message = "Subject Name No can't be blank")
	protected String subject;
	
	@NotEmpty(message = "Header Name No can't be blank")
	protected String header;
	
	@NotEmpty(message = "Footer Name No can't be blank")
	protected String footer;
	
	@NotEmpty(message = "Content Name No can't be blank")
	protected String content;
	
	protected String createdBy;
	protected Date createdDate;
	protected String updatedBy;
	protected Date updatedDate;

	public Email() {
	}

	public Email(String emailId, String sender, String recipients, String subject, String header, String footer,
			String content, String createdBy, Date createdDate, String updatedBy, Date updatedDate) {
		super();
		this.emailId = emailId;
		this.sender = sender;
		this.recipients = recipients;
		this.subject = subject;
		this.header = header;
		this.footer = footer;
		this.content = content;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipients() {
		return recipients;
	}

	public void setRecipients(String recipients) {
		this.recipients = recipients;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
