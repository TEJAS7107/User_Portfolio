package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
private String res;
	public String getupdate(String Title, String old, String filename) {
		// TODO Auto-generated method stub
		
		
		try {
			Connection gc = Connectionn.getconnection();
			String sql="update Project set Title=?,filename=? where filename=?";
			PreparedStatement ps = gc.prepareStatement(sql);
			ps.setString(1, Title);
			ps.setString(2, filename);
			ps.setString(3, old);
			int eu = ps.executeUpdate();
			if(eu==1) {
				this.res="ok";
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

}
