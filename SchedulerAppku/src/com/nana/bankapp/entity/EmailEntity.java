package com.nana.bankapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_email")
public class EmailEntity {

	@Id
	@Column(name = "EMAIL_ID")
	private String emailId;

	@Column(name = "SENDER")
	private String sender;

	@Column(name = "RECIPIENTS")
	private String recipients;

	@Column(name = "SUBJECT")
	private String subject;

	@Column(name = "HEADER")
	private String header;

	@Column(name = "FOOTER")
	private String footer;

	@Column(name = "CONTENT")
	private String content;

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

}
