package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class YO 
{
	public static void main(String[] args) throws SQLException
	{

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
	
		Statement stmt =con.createStatement();
		
		
		String s =  " Select employee_id,first_name from employees";
	
	
		ResultSet rs = stmt.executeQuery(s);
		
		while(rs.next())
		{
			int eid =rs.getInt("employee_id");
			String fname = rs.getString("first_name");
			
			
			System.out.println(eid+"   "+fname+"    ");
		}
		
		
	}

}
