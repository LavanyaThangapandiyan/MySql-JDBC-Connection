package com.department.exmp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentImp implements University
{
	SaveDepartment save=new SaveDepartment();
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","L#1726@rlav");
		System.out.println(con);
		return con;
	}

	@Override
	public void saveDepartment(SaveDepartment save) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=DepartmentImp.getConnection();
		String s="insert into department(id,name,staffstrength,stdstrength)values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(s);
		ps.setInt(1, save.getId());
		ps.setString(2, save.getName());
		ps.setInt(3,save.getStaffStrength());
		ps.setInt(4, save.getStudentStrength());
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		
	}

	@Override
	public int updateDepartment(String name,int id) throws ClassNotFoundException, SQLException
	{
		Connection con=DepartmentImp.getConnection();
		String s="update department set name='"+name+"' where id='"+id+"'";
		PreparedStatement ps=con.prepareStatement(s);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		return executeUpdate;		
	}
	@Override
	public int updateStaffStrength(int id, int strength) throws ClassNotFoundException, SQLException {
		Connection con=DepartmentImp.getConnection();
		String s="update department set staffstrength='"+strength+"' where id='"+id+"'";
		PreparedStatement ps=con.prepareStatement(s);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		return executeUpdate;	
	}

	@Override
	public int deleteDepartment() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department Id");
		int id=sc.nextInt();
		Connection con=DepartmentImp.getConnection();
		String s="delete from department where id='"+id+"'";
		PreparedStatement ps=con.prepareStatement(s);
		int executeUpdate = ps.executeUpdate(s);
		System.out.println(executeUpdate);
		return executeUpdate;	
	}

	@Override
	public List<SaveDepartment> departmentList() throws ClassNotFoundException, SQLException
	{
		Connection con=DepartmentImp.getConnection();
		String s="select id,name,staffstrength,stdstrength from department";
		PreparedStatement ps=con.prepareStatement(s);
		ResultSet rs=ps.executeQuery();
		ArrayList list = new ArrayList();
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int staffstrength=rs.getInt(3);
			int stdstrength = rs.getInt(4);
		    SaveDepartment save = new SaveDepartment();
			save.setId(id);
			save.setName(name);
			save.setStaffStrength(staffstrength);
			save.setStudentStrength(stdstrength);
			list.add(save);
		
		}
		return list;
		
		
		
	}

	@Override
	public void findByDepartment(String department) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		Connection con=DepartmentImp.getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select id,name,staffstrength,stdstrength from department where name='"+department+"'");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}
		
	}

	@Override
	public void findByid(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=DepartmentImp.getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select id,name,staffstrength,stdstrength from department where id='"+id+"'");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));

		}
		
	}

	
	
	
	

}
