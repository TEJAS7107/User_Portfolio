package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deletee {
private String res;
	public String deleteproject(String name) {
		// TODO Auto-generated method stub

		try {
			Connection gc = Connectionn.getconnection();
			String sql="delete from PROJECT where FILENAME=?";
			PreparedStatement ps = gc.prepareStatement(sql);
			ps.setString(1, name);
			int eu = ps.executeUpdate();
			if(eu==1) {
				this.res="done";
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
