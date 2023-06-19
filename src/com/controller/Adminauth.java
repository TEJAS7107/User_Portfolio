package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.Read;

/**
 * Servlet implementation class Adminauth
 */
public class Adminauth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminauth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		
		Read r = new Read();
		String aa = r.adminauth(username,password);
		if(aa.equals("saved")) {
			session.setAttribute("key", "egg");
			response.sendRedirect("Admin.jsp");
			System.out.println(session);
		}
		else if(aa.equals("notsaved"))
		{
			response.sendRedirect("adminauth.jsp");
		}
		else {
			response.sendRedirect("adminauth.jsp");
		}

		
	}

}
