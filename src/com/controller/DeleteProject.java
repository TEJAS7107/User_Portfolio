package com.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Deletee;
import com.dao.Read;

/**
 * Servlet implementation class DeleteProject
 */
public class DeleteProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("fname");
		
		Deletee d = new Deletee();
		String dp = d.deleteproject(name);
		if(dp.equals("done"))
		{
			File f = new File("C:\\Users\\tejas\\OneDrive\\Desktop\\adv_java_aug\\My_portfolio\\WebContent\\images\\project\\"+name);
			f.delete();
			response.sendRedirect("delete.jsp");
		}
		else {
			response.sendRedirect("delete.jsp");
		}
	}

}
