package com.crud.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeImpl implements Employee 
{

	public static Connection getConnection() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","L#1726@rlav");
		System.out.println(con);
		return con;		
	}

	@Override
	public void insertEmployee() throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		Connection con=EmployeeImpl.getConnection();
		String str="INSERT INTO empl VALUES(1012,'  Rahane ',28,'IT','Designer',45000)";
		PreparedStatement prepare=con.prepareStatement(str);
		int executeUpdate = prepare.executeUpdate();
		System.out.println(executeUpdate);		
	}
	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}

}
