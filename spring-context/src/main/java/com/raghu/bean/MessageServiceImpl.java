package com.raghu.bean;

public class MessageServiceImpl implements MessageService {
	private String message;

	public MessageServiceImpl() {
		System.out.println("Consteructor executed.");
	}

	public void setMessage(String message) {
		System.out.println("Setter Method executed.");
		this.message = message;
	}

	@Override
	public void sendMessage(String email) {
		System.out.println("************** Sending email to ====>" + email);
		System.out.println("************** Sending message =====>" + message);
	}

}
