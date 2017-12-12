package com.yunzhs.crm.service;

import com.yunzhs.crm.bean.Customer;
import com.yunzhs.crm.dao.CustomerDao;

import java.sql.SQLException;
import java.util.List;

public class CustomerService {
    public List<Customer> findall() throws SQLException {
       CustomerDao customer=new CustomerDao();
       List<Customer> list=customer.displayall() ;
       return list;
    }
    public Customer findid(String id) throws SQLException {
        CustomerDao dao=new CustomerDao();
        Customer customer=dao.findid(id);
        return  customer;
    }
    public void  updateById(Customer customer) throws SQLException {
        CustomerDao dao=new CustomerDao();
        dao.edit(customer);
    }
    public void  add(Customer customer) throws SQLException {
        CustomerDao dao=new CustomerDao();
        dao.add(customer);
    }
    public void  delete(String id) throws SQLException {
        CustomerDao dao=new CustomerDao();
        dao.delete(id);
    }
}
