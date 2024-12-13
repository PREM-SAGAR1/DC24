package storedprocedureTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.CallableStatement;
import com.mysql.cj.util.StringUtils;

public class SPTesting 
{
	
	Connection con =null;
	Statement stmt = null;
	ResultSet rs;
	java.sql.CallableStatement cstmt;
	ResultSet rs1;
	ResultSet rs2;
	
	@BeforeClass
	public void setup() throws SQLException
	{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root");
	}
	
	@AfterClass
	void tearDown() throws SQLException
	{
		con.close();
	}

	
	//@Test(priority=1)
	void test_storedProcedureExists() throws SQLException
	{
		stmt = con.createStatement();
		rs = stmt.executeQuery("SHOW PROCEDURE STATUS WHERE Name ='SelectAllCustomers'");
	   rs.next();
	   
	   Assert.assertEquals(rs.getString("Name"),"SelectAllCustomers");
	
	}
	
	@Test(priority=1)
	void test_SelectAllCustomers() throws SQLException

	{
		
		cstmt = con.prepareCall("{CALL SelectAllCustomers()}");
	
		rs1= cstmt.executeQuery();
		
	
	} 
	
	public boolean compareResultSets(ResultSet resultSet1, ResultSet resultSet2) throws SQLException
	{
		while(resultSet1.next())
		{
			resultSet2.next();
			int count=resultSet1.getMetaData().getColumnCount();
			for(int i=1;i<= count;i++)
			{
				if(!StringUtils.equals(resultSet1.getString(i),resultSet2.getString(i)))
			{
				return false;	
			}
			}		
		}
		return true;
		
		
	}
}
