package com.yunzhs.crm.controller;

import com.yunzhs.crm.bean.Customer;
import com.yunzhs.crm.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerFindAllServlet",urlPatterns = "/CustomerFindAllServlet")
public class CustomerFindAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerService service=new CustomerService();
        try {
            List<Customer> list=service.findall();
            request.setAttribute("allcustomer",list);
            request.getRequestDispatcher("/customer/listCustomer.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
