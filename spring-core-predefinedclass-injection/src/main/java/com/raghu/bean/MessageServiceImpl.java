package com.raghu.bean;

import java.util.Date;

public class MessageServiceImpl implements MessageService {
	private String message;
	private Date date;

	public MessageServiceImpl() {
		System.out.println("Consteructor executed.");
	}

	public void setMessage(String message) {
		System.out.println("setMessage() of MessageServiceImpl.");
		this.message = message;
	}

	public void setDate(Date date) {
		System.out.println("setDate() of MessageServiceImpl.");
		this.date = date;
	}

	@Override
	public void sendMessage(String email) {
		System.out.println("************** Sending email to ====>" + email);
		System.out.println("************** Sending email on Date ====>" + date);
		System.out.println("************** Sending message =====>" + message);
	}

}
