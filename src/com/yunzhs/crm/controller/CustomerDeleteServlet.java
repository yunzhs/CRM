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

@WebServlet(name = "CustomerDeleteServlet",urlPatterns = "/deleteid")
public class CustomerDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String id=request.getParameter("id");
        Customer customer=new Customer();

        try {
            new CustomerService().delete(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //去访问findAllservlet
            response.sendRedirect(request.getContextPath()+"/CustomerFindAllServlet");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request, response);
    }
}
