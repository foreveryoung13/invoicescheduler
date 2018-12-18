package com.nana.bankapp.model;

public class Email {

	private String emailId;
	private String sender;
	private String recipients;
	private String subject;
	private String header;
	private String footer;
	private String content;

	public Email() {
	}

	public Email(String emailId, String sender, String recipients, String subject, String header, String footer,
			String content) {
		super();
		this.emailId = emailId;
		this.sender = sender;
		this.recipients = recipients;
		this.subject = subject;
		this.header = header;
		this.footer = footer;
		this.content = content;
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

}
