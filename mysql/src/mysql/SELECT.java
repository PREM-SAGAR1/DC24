package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

/*
 *1 create a connection
 * 2 create statement /Query
 * 3 Execute statement/Query
 * 4 store data in resultset 
 * 5 close connection
 */

public class SELECT {

	public static void main(String[] args) throws Exception 
	{
		 //*1 create a connection

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		 //* 2 create statement /Query

		Statement stmt=con.createStatement();
		
		String s = "select * from student";

		// * 3,4 Execute statement/store data in resultset

		
		ResultSet rs = stmt.executeQuery(s);
		
		while(rs.next())
		{
			int sid =rs.getInt("SID");
			String sname =rs.getString("STUNAME");

			System.out.println(sid+" "+sname+" ");
		}
		
		
		
		System.out.println();
		

	}

}
