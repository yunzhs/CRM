package com.yunzhs.crm.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yunzhs.crm.bean.Admin;
import com.yunzhs.crm.service.AdminService;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet(name="AdminLoginServlet",urlPatterns="/AdminLoginServlet",loadOnStartup=1)
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("adminname");
		String password=request.getParameter("password");
		AdminService as=new AdminService();
		try {
			Admin admin=as.find(name, password);
			if(admin!=null) {
				//账号密码正确
				request.getSession().setAttribute("adminExist",admin);
				response.sendRedirect(request.getContextPath()+"/admin/main.jsp");
			}
			else {
				request.setAttribute("error", "用户名或者密码错误");
				request.getRequestDispatcher("/admin/login.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
