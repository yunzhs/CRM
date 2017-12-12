package com.yunzhs.crm.controller;

import com.yunzhs.crm.bean.Customer;
import com.yunzhs.crm.bean.PageBean;
import com.yunzhs.crm.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "PageServlet",urlPatterns = "/PageServlet")
public class PageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //1.获取要分页的页面数
            int currentPage  = Integer.parseInt(request.getParameter("page"));
            //2.调用service，返回一个pageBean
            PageBean<Customer> bean = new CustomerService().getPageBean(currentPage);
            //3.存到域对象，转发到page.jsp
            request.setAttribute("pageBean", bean);
            request.getRequestDispatcher("/customer/page.jsp").forward(request, response);
            //request.getRequestDispatcher("/customer/baidupage.jsp").forward(request, response);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
