package com.project.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDemo {

	public static void main(String[] args) throws SQLException 
	{
		try

		{

		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","L#1726@rlav");

		Statement st=con.createStatement();

		ResultSet rs=st.executeQuery("Select *from employee");

		while(rs.next())

		{

		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
    
		}

		}

		catch(Exception e)

		{

		System.out.println(e.toString());

		}

		}
	}


