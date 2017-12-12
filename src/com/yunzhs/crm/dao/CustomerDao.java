package com.yunzhs.crm.dao;

import com.yunzhs.crm.bean.Customer;
import com.yunzhs.crm.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

public class CustomerDao {
    public List<Customer> displayall() throws SQLException {
        QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
        String sql="select * from customer";
        List<Customer> list=qr.query(sql,new BeanListHandler<Customer>(Customer.class));
        return list;
    }
    public  Customer findid(String id) throws SQLException {
        QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
        String sql="select * from customer where cid=?";
        Customer customer=qr.query(sql,new BeanHandler<Customer>(Customer.class),id);
        return  customer;
    }
    public void edit(Customer cu) throws SQLException {
        QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
        String sql="update customer set sname=?,sex=?,addr=?,email=?,telephone=?,age=? where cid=?";
        Object[] obj = {cu.getSname(),cu.getSex(),cu.getAddr(),cu.getEmail(),cu.getTelephone(),cu.getAge(),cu.getCid()};
        qr.update(sql,obj);
    }
    public void add(Customer cu) throws SQLException {
        QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
        String sql="insert into customer (sname,sex,addr,email,telephone,age) values(?,?,?,?,?,?)";
        Object[] obj = {cu.getSname(),cu.getSex(),cu.getAddr(),cu.getEmail(),cu.getTelephone(),cu.getAge()};
        qr.update(sql,obj);
    }
    public  void delete(String id) throws SQLException {
        QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
        String sql="delete  from customer where cid=?";
        qr.update(sql,id);
    }
    //查询总记录数的方法
    public int getTotalCount() throws SQLException{
        QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
        String sql ="select count(*) from customer";
        Long num = (Long) runner.query(sql,new ScalarHandler());
        return num.intValue();
    }
    //查询每页显示的具体数据
    public List<Customer> getByPage(int currentPage,int pageSize) throws SQLException{
        QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "select * from customer limit ?,?";
        List<Customer> list = runner.query(sql, new BeanListHandler<Customer>(Customer.class),(currentPage-1)*pageSize,pageSize);

        return list;
    }
}
