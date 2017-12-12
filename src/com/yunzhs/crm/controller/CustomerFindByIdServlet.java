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

@WebServlet(name = "CustomerFindByIdServlet",urlPatterns = "/findid")
public class CustomerFindByIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        CustomerService cos=new CustomerService();
        Customer customer= null;
        try {
            customer = cos.findid(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("customerinfo",customer);
        request.getRequestDispatcher("/customer/editCustomer.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
