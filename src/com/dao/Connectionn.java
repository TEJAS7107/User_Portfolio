package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionn {
	public static Connection conn=null;

	public static Connection getconnection() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String pass="root";
			conn = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			return conn;
		}
		
	
	}
}
