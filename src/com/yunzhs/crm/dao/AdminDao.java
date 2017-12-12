package com.yunzhs.crm.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.yunzhs.crm.bean.Admin;
import com.yunzhs.crm.utils.JDBCUtils;



public class AdminDao {
	public Admin getBean(String username,String password) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		String sql="select * from admin where adminname=? and password=?";
		Admin admin=qr.query(sql, new BeanHandler<Admin>(Admin.class),username,password);
		return admin; 
	}
	public void adddata(Admin admin) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		String sql="insert into admin(adminname,password) values(?,?)";
		qr.update(sql,admin.getAdminname(),admin.getPassword());
	}
}
