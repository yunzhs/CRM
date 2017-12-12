package com.yunzhs.crm.controller;

import com.yunzhs.crm.bean.Admin;
import com.yunzhs.crm.service.AdminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "AdminRegisterServlet",urlPatterns ="/AdminRegisterServlet")
public class AdminRegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("adminname");
        String password=request.getParameter("password");
        Admin admin=new Admin();
        admin.setAdminname(username);
        admin.setPassword(password);
        AdminService as=new AdminService();
        try {
            as.regist(admin);
            response.sendRedirect(request.getContextPath()+"admin/login.jsp");
        } catch (SQLException e) {
            request.setAttribute("msg","注册失败");
            request.getRequestDispatcher("/admin/register.jsp").forward(request,response);
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
