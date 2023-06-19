package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.Insert;

/**
 * Servlet implementation class AddEdu
 */
public class AddEdu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEdu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String year = request.getParameter("year");
		String std = request.getParameter("std");
		String board = request.getParameter("board");
		String school = request.getParameter("school");
		
		Insert ii = new Insert();
		String result = ii.insertdata(year,std,board,school);
		HttpSession session = request.getSession();
		if(result.equals("done"))
		{
			System.out.println("inserted");
			session.setAttribute("msg", "message");
			response.sendRedirect("Admin.jsp");
		}
		else {
			session.setAttribute("msg", "failed");
			System.out.println("failed");
			response.sendRedirect("edu.jsp");
		}
		
	}

}
