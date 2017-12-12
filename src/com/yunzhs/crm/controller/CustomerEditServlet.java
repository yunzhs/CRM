package com.yunzhs.crm.controller;

import com.yunzhs.crm.bean.Customer;
import com.yunzhs.crm.service.CustomerService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

@WebServlet(name = "CustomerEditServlet",urlPatterns = "/CustomerEdit")
public class CustomerEditServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Customer customer=new Customer();
        try {
            BeanUtils.populate(customer,request.getParameterMap());
            new CustomerService().updateById(customer);
            //去访问findAllservlet
            response.sendRedirect(request.getContextPath()+"/CustomerFindAllServlet");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
