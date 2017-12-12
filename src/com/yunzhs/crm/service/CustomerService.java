package com.yunzhs.crm.service;

import com.yunzhs.crm.bean.Customer;
import com.yunzhs.crm.bean.PageBean;
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
    public PageBean<Customer> getPageBean(int currentPage) throws SQLException{
        CustomerDao dao = new CustomerDao();
        //1.封装pageSize；
        int pageSize=3;
        PageBean<Customer>  page  = new PageBean<>();
        page.setPageSize(pageSize);
        //2.封装每页显示的list
        List<Customer>  list = dao.getByPage(currentPage, pageSize);
        page.setList(list);
        //3.参数封装总记录数
        int totalCount = dao.getTotalCount();
        page.setTotalCount(totalCount);
        //4.总页数，不用封装，因为计算出来
        //5.封装当前页码数
        page.setCurrentPage(currentPage);
        return page;
    }
}
