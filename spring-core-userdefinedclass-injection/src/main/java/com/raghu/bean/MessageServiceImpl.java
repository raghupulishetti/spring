package com.raghu.bean;

import java.util.Date;

public class MessageServiceImpl implements MessageService {
	private Date date;
	private Email email;

	public MessageServiceImpl() {
		System.out.println("Consteructor executed.");
	}

	public void setDate(Date date) {
		System.out.println("setDate() of MessageServiceImpl.");
		this.date = date;
	}

	public void setEmail(Email email) {
		System.out.println("setEmail() of MessageServiceImpl.");
		this.email = email;
	}

	@Override
	public void sendMessage(String to) throws InterruptedException {
		// code to call email service and send an email.
		Thread.sleep(1000);
		System.out.print("Sending.");
		Thread.sleep(1000);
		System.out.print(" .");
		Thread.sleep(1000);
		System.out.print(" .");
		Thread.sleep(1000);
		System.out.print(" .");
		Thread.sleep(1000);
		System.out.print(" .");
		Thread.sleep(1000);
		System.out.print(" .");
		Thread.sleep(1000);
		System.out.println(" .");
		System.out.println("************** Sending email to ====>" + to);
		System.out.println("************** Sending email on Date ====>" + date);
		System.out.println("************** Sending email from =====>" + email.getFrom());
		System.out.println("************** Sending email content ==>" + email.getContent());
		System.out.println("Email sent successfully....");
	}

}
