import java.io.*;
import java.sql.*;

class JDBC 
{
	public static void main(String[] args) throws ClassNotFoundException,IOException,SQLException
	
	{
	    Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hateem","root","Hateem@006");
		Statement s = con.createStatement();
		ResultSet rs =s.executeQuery("select * from cricket");
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
		}
		
		
	}

}
