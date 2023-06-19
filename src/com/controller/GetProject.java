package com.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.Insert;
@MultipartConfig
/**
 * Servlet implementation class GetProject
 */
public class GetProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetProject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		Part p = request.getPart("file");
		String filename = p.getSubmittedFileName();
		
		//dao
		Insert i = new Insert();
		String result = i.addproject(title,filename);
		if(result.equals("saved"))
		{
			InputStream fis = p.getInputStream();
			byte[] b=new byte[fis.available()];
			//String path = request.getRealPath("images/project");
			String path="C:\\Users\\tejas\\OneDrive\\Desktop\\adv_java_aug\\My_portfolio\\WebContent\\images\\project"+File.separator+filename;
			
			FileOutputStream fos = new FileOutputStream(path);
			fis.read(b);
			fos.write(b);
			response.sendRedirect("Admin.jsp");
		}
		else {
			response.sendRedirect("AddProject.jsp");
		}
	}

}
