package com.raghu.bean;

public class MessageServiceImpl implements MessageService {
	private Email email;

	public MessageServiceImpl() {
		System.out.println("Consteructor executed.");
	}

	public void setEmail(Email email) {
		System.out.println("setEmail() of MessageServiceImpl.");
		this.email = email;
	}

	@Override
	public void sendMessage(String to) throws InterruptedException {
		// code to call email service and send an email.
		System.out.println("************** Sending email to ====>" + to);
		System.out.println("************** Sending email from =====>" + email.getFrom());
		System.out.println("************** Sending email content ==>" + email.getContent());
		System.out.println("Email sent successfully....");
	}

}
