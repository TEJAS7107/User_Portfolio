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

import com.dao.UpdateData;
@MultipartConfig
/**
 * Servlet implementation class UpdateProject
 */
public class UpdateProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Title = request.getParameter("nname");
		String old = request.getParameter("oldname");
		Part part = request.getPart("file");
		System.out.println(part);
		String Filename = part.getSubmittedFileName();
		UpdateData u = new UpdateData();
		String res = u.getupdate(Title,old,Filename);
		if(res.equals("ok")) {
			File f1 = new File("C:\\Users\\tejas\\OneDrive\\Desktop\\adv_java_aug\\My_portfolio\\WebContent\\images\\project\\"+old);
			f1.delete();
			////
			InputStream fis = part.getInputStream();
			byte[] b=new byte[fis.available()];
			FileOutputStream fos = new FileOutputStream("C:\\Users\\tejas\\OneDrive\\Desktop\\adv_java_aug\\My_portfolio\\WebContent\\images\\project"+Filename);
			fis.read(b);
			fos.write(b);
			response.sendRedirect("Update.jsp");
			
			
		}
		else {
			response.sendRedirect("Update.jsp");
		}
			
		}
	

}
