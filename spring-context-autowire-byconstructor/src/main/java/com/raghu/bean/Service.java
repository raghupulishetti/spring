package com.raghu.bean;

public class Service {
	private DAO dao;
	private EDao edao;
	public Service(EDao edao) {
		System.out.println("Service(EDao eDao)");
		this.edao = edao;
	}

	public Service(DAO dao) {
		System.out.println("Service(DAO dao)");
		this.dao = dao;
	}

	
	/*public Service(DAO dao, EDao eDao) {
		System.out.println("Service(DAO dao, EDao eDao)");
		this.dao = dao;
		this.eDao = eDao;
	}*/

	public void serviceMethod() {
		System.out.println("Service Method");
		dao.daoMethod();
		edao.edaoMethod();
	}

}
