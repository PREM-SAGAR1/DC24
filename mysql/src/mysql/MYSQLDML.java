package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * create a connection
 * create statement /Query
 * Execute statement/Query
 * close connection
 */

public class MYSQLDML {

	public static void main(String[] args) throws Exception
	{
	
		//1.* create a connection
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	
      
      
         //2.* create statement /Query
      
      Statement  stmt =con.createStatement();
      
     // String s = "INSERT INTO STUDENT VALUES(104,'SMITH')";
	//String s = "UPDATE STUDENT SET STUNAME='DAVID' WHERE SID='103'";
    
      String s ="DELETE FROM STUDENT WHERE SID='103'";
      
      //3. * Execute statement/Query
	stmt.execute(s);
	
	//4.close the conection
	
	con.close();
	
	System.out.println("Query exectued..");
	
	
	}

}
