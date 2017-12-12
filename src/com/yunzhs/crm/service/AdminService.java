package com.yunzhs.crm.service;

import java.sql.SQLException;

import com.yunzhs.crm.bean.Admin;
import com.yunzhs.crm.dao.AdminDao;

public class AdminService {
	public Admin find(String username,String password) throws SQLException {
		// TODO Auto-generated method stub
		AdminDao ad=new AdminDao();
		Admin admin=ad.getBean(username, password);
		if(admin==null) {
			return null;
		}
		return admin;
	}
	public  void  regist(Admin admin) throws SQLException {
		AdminDao adminDao=new AdminDao();
		adminDao.adddata(admin);
	}
}
