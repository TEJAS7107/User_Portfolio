package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
private String res;
	public String insertdata(String year, String std, String board, String school) {
		// TODO Auto-generated method stub
	
		try {
			Connection gc = Connectionn.getconnection();
			String sql="insert into EDU_DATA  values(?,?,?,?)";
			PreparedStatement ps = gc.prepareStatement(sql);
			ps.setString(1, year);
			ps.setString(2, std);
			ps.setString(3, board);
			ps.setString(4, school);
			int eu = ps.executeUpdate();
			if(eu==1)
			{
				this.res="done";
			}
			//System.out.println(eu);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.res="fail";
		}
		finally {
			return res;
		}
		
	}
	public String sendmsg(String name, String email, String message) {
		// TODO Auto-generated method stub

		try {
			Connection gc = Connectionn.getconnection();
			String sql="insert into MESSAGE values(?,?,?)";
			PreparedStatement ps = gc.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, message);
			int eu = ps.executeUpdate();
			if(eu==1)
			{
				this.res="saved";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			this.res="exp";
		}
		finally {
			return res;
		}
		
	}
	public String addproject(String title, String filename) {
		// TODO Auto-generated method stub
		try {
			Connection gc = Connectionn.getconnection();
			String sql="insert into PROJECT values(?,?)";
			PreparedStatement ps = gc.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, filename);
			
			int eu = ps.executeUpdate();
			if(eu==1)
			{
				this.res="saved";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			this.res="exp";
		}
		finally {
			return res;
		}
		
	}

}
