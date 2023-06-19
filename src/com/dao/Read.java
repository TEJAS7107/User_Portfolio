package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pojo.Photo;
import com.pojo.Readd;
import com.pojo.Student;

public class Read {
private String res;
	public String adminauth(String username, String password) {
		// TODO Auto-generated method stub
		
		try {
			Connection gc = Connectionn.getconnection();
			String sql="select * from auth where username=? and password=?";
			PreparedStatement ps = gc.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet eq = ps.executeQuery();
			if(eq.next()) {
				this.res="saved";
			}
			else
			{
				this.res="notsaved";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.res="exe";
		}
		finally {
			return res;
		}
	}
	public ArrayList<Student> updation() {
		// TODO Auto-generated method stub
	ArrayList<Student> al = new ArrayList<Student>();	
		try {
			Connection gc = Connectionn.getconnection();
			String sql="select * from EDU_DATA";
			PreparedStatement ps = gc.prepareStatement(sql);
			ResultSet eq = ps.executeQuery();
			while(eq.next()) {
				Student s = new Student();
				s.setYear(eq.getString("YEAR"));
				s.setStd(eq.getString("STANDARD"));
				s.setBoard(eq.getString("BOARD"));
				s.setSchool(eq.getString("SCHOOL"));
				al.add(s);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		finally {
			return al;
		}
	}


public ArrayList<Readd> Readmsg() {
	// TODO Auto-generated method stub
ArrayList<Readd> al = new ArrayList<Readd>();	
	try {
		Connection gc = Connectionn.getconnection();
		String sql="select * from MESSAGE";
		PreparedStatement ps = gc.prepareStatement(sql);
		ResultSet eq = ps.executeQuery();
		while(eq.next()) {
			
			Readd r = new Readd();
			r.setName(eq.getString("name"));
			r.setEmail(eq.getString("email"));
			r.setMessage(eq.getString("message"));
			al.add(r);
		
		}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	finally {
		return al;
	}
}


public ArrayList<Photo> Readpic() {
	// TODO Auto-generated method stub
ArrayList<Photo> all = new ArrayList<Photo>();	
	try {
		Connection gc = Connectionn.getconnection();
		String sql="select * from PROJECT";
		PreparedStatement ps = gc.prepareStatement(sql);
		ResultSet eq = ps.executeQuery();
		while(eq.next()) {
			
			
			Photo p = new Photo();
		
			p.setTitle(eq.getString("title"));
			p.setFilename(eq.getString("filename"));
			all.add(p);
		
		}
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	finally {
		return all;
	}
}
}
