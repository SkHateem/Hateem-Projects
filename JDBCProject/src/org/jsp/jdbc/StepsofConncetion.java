package org.jsp.jdbc;

import java.sql.*;
import java.sql.DriverManager;

public class StepsofConncetion throws SQLException,ClassNotFoundException
{
	public static void main(String[] args) 
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Hateem@006");
	}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	

}
