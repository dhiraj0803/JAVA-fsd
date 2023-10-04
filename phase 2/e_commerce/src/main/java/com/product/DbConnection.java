package com.product;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getConnection() {
		Connection con = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_application", "root", "Dhiraj@1997");
		}
		
		
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}

		return con;

	}

}
