package com.raghu.bean;

public class Service {
	private DAO dao;

	
	public Service(DAO dao) {
		this.dao = dao;
	}

	public void serviceMethod() {
		System.out.println("Service Method");
		dao.daoMethod();
	}

}
