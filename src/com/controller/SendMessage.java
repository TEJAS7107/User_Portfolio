package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.Insert;

/**
 * Servlet implementation class SendMessage
 */
public class SendMessage extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		HttpSession session = request.getSession();
		Insert ii = new Insert();
		String sm = ii.sendmsg(name,email,message);
		if(sm.equals("saved"))
		{
			session.setAttribute("msg", "msgsaved");
			response.sendRedirect("index.jsp");
		}
		else
		{
			session.setAttribute("msg", "msgnotsaved");
			response.sendRedirect("index.jsp");
		}
	
	}

}
