package com.nana.bankapp.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Component;

import com.nana.bankapp.model.Email;

@Component
public class MailUtilities {

	public static void main(String[] args) {
		String emailFrom = "nana.febriana@inspirotechs.com";
		String emailRecipent = "febrian.nana@gmail.com";
		String subject = "hello";
		String content = "mantul";

		sendMailForInvoiceReminderAuth(emailFrom, emailRecipent, subject, content);
	}

	public static String sendMailForInvoiceReminderAuth(String emailFrom, String emailRecipent, String subject,
			String content) {
		String strReturn = "";

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			/* To do: Isi email dan password dari settingan atau parameter */
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("nana.febriana@inspirotechs.com", "Password.123");
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(emailFrom));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailRecipent));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);

			strReturn = "success";
			System.out.println("Done");

		} catch (MessagingException e) {
			strReturn = "failed";
			throw new RuntimeException(e);
		}

		return strReturn;
	}

	public static Boolean sendMailForInvoiceReminder(Email email) {
		Boolean feedBack = false;

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("nana.febriana@inspirotechs.com", "Password.123");
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("nana.febriana@inspirotechs.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email.getRecipients()));
			message.addRecipient(RecipientType.TO, new InternetAddress("febriana.nana93@gmail.com"));
			message.addRecipient(RecipientType.CC, new InternetAddress("febriana.nana93@gmail.com"));
			message.addRecipient(RecipientType.BCC, new InternetAddress("oktaviansandi13@gmail.com"));
			message.setSubject(email.getSubject());
			message.setText(email.getContent());
			Transport.send(message);

			feedBack = true;

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

		return feedBack;
	}

}
