package com.raghu.bean.service;

import com.raghu.bean.dao.DAOBean;

public class ServiceBean {
	private DAOBean daoBean;

	public DAOBean getDaoBean() {
		return daoBean;
	}

	public void setDaoBean(DAOBean daoBean) {
		this.daoBean = daoBean;
	}

	public void serviceMethod() {
		System.out.println("serviceMethod");
		daoBean.daoMethod();
	}

}
