package com.project.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DmlCommands 
{
	public static void main(String[] args) throws SQLException 
	{
		//Create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","L#1726@rlav");
		//create a Query/statement
		Statement st=con.createStatement();
		String s="INSERT INTO employee VALUES(11,'smith',28,'Marketing')";
		String s1="UPDATE employee SET EmpName='Dravid' WHERE EmpId=6";
		
		String s2="DELETE FROM employee WHERE EmpId=11";
							
		//Execute query/statement
		
  		st.execute(s2);
		//close the connection
		con.close();
		
		System.out.println("Query Executed......");
		
	}

}
