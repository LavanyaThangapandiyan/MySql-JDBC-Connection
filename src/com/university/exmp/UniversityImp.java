package com.university.exmp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class UniversityImp implements University
{
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","L#1726@rlav");
		System.out.println(con);
		return con;	
	}
	@Override
	public void insertUniversity() throws ClassNotFoundException, SQLException
	{
	Connection con=UniversityImp.getConnection();
	String s="INSERT INTO university VALUES(1007,'indian Institute of Technology Madras','Chennai',1)";
	PreparedStatement prepare=con.prepareStatement(s);
	int executeUpdate = prepare.executeUpdate();
	System.out.println(executeUpdate);	
		
	}
	@Override
	public void updateUniversity() throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		Connection con=UniversityImp.getConnection();
		String s="UPDATE university SET location='chidambaram' where uniid=1002";
		PreparedStatement prepare=con.prepareStatement(s);
		int executeUpdate = prepare.executeUpdate();
		System.out.println(executeUpdate);	
	}

	@Override
	public int deleteUniversity() throws ClassNotFoundException, SQLException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("IF you want to delete University please Enter University ID ");
		int id=sc.nextInt();
		Connection con=UniversityImp.getConnection();
		String s="DELETE FROM university WHERE uniid='"+id+"'";
		PreparedStatement prepare=con.prepareStatement(s);
		int executeUpdate = prepare.executeUpdate();
		System.out.println(executeUpdate);	
		return executeUpdate;
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void universityList() throws ClassNotFoundException, SQLException
	{
		Connection con=UniversityImp.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from university");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}
	}

	public void findByUniversity(int id) throws ClassNotFoundException, SQLException 
	{
		Connection con=UniversityImp.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from university where uniid='"+id+"'");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}		
		
	}
	@Override
	public void findByLocation(String location) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=UniversityImp.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select *from university where location='"+location+"'");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}
		
	}
		
	}
	


