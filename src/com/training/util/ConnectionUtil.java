package com.training.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ConnectionUtil 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		getConnection();
		//insertValues();
		//updateValues();
		deleteValues();
		//System.out.println(getConnection());
		
	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","L#1726@rlav");
		//System.out.println(con);
		return con;
	}
	public static void insertValues() throws ClassNotFoundException, SQLException
	{
		Connection con= ConnectionUtil.getConnection();
		String s="INSERT INTO employee VALUES(12,'Dhoni',28,'IT')";
		PreparedStatement prepare=con.prepareStatement(s);
		int executeUpdate=prepare.executeUpdate();
		System.out.println(executeUpdate);
		
	}
	public static void updateValues() throws ClassNotFoundException, SQLException
	{
		Connection con= ConnectionUtil.getConnection();
		String s1="UPDATE employee SET EmpName='Rahul' WHERE EmpId=6";
		PreparedStatement prepare=con.prepareStatement(s1);
		int executeUpdate=prepare.executeUpdate();
		System.out.println(executeUpdate);
	}
	public static void deleteValues() throws ClassNotFoundException, SQLException
	{
		Connection con=ConnectionUtil.getConnection();
		String s2="DELETE FROM employee WHERE EmpId=11";
		PreparedStatement prepare=con.prepareStatement(s2);
		int executeUpdate=prepare.executeUpdate();
		System.out.println(executeUpdate);
	}
	
}
