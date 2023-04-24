package com.practice.emp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.department.exmp.DepartmentImp;
import com.department.exmp.SaveDepartment;

public class EmployeeImpl implements Employee
{	
	Employee1 employee=new Employee1();
	public static Connection getConnection() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","L#1726@rlav");
		System.out.println(con);
		return con;
	}
	public void saveEmployee(Employee1 employee) throws ClassNotFoundException, SQLException 
	{
		
		Connection con= EmployeeImpl.getConnection();
		String s="INSERT INTO empl(EmpId,EmpName,EmpAge,EmpDep,EmpDesignation,EmpSalary)values(?,?,?,?,?,?)";
		PreparedStatement pre1=con.prepareStatement(s);
	    pre1.setInt(1, employee.getId());
	    pre1.setString(2, employee.getName());
	    pre1.setInt(3, employee.getAge());
	    pre1.setString(4, employee.getDepartment());
	    pre1.setString(5, employee.getDesignation());
	    pre1.setLong(6, employee.getSalary());
		int executeUpdate=pre1.executeUpdate();
		System.out.println(executeUpdate);		
	}
	@Override
	public int deleteEmployee() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID to delete:");
		int id=sc.nextInt();
		Connection con=EmployeeImpl.getConnection();
		String s2="DELETE  FROM empl WHERE EmpId='"+id+"'";
		PreparedStatement pre3=con.prepareStatement(s2);
		int executeUpdate=pre3.executeUpdate();
		System.out.println(executeUpdate);
		return executeUpdate; 
	}
	@Override
	public List<Employee1>employeeList() throws ClassNotFoundException, SQLException
	{
		Connection con=DepartmentImp.getConnection();
		String s="select EmpId,EmpName,EmpAge,EmpDep,EmpDesignation,EmpSalary from empl";
		PreparedStatement ps=con.prepareStatement(s);
		ResultSet rs=ps.executeQuery();
		ArrayList list = new ArrayList();
		while (rs.next()) 
		{
			int EmpId = rs.getInt(1);
			String EmpName = rs.getString(2);
			int EmpAge=rs.getInt(3);
			String EmpDep = rs.getString(4);
			String EmpDesignation=rs.getString(5);
			int EmpSalary=rs.getInt(6);
		    SaveDepartment save = new SaveDepartment();
		    employee.setId(EmpId);
		    employee.setName(EmpName);
		    employee.setAge(EmpAge);
		    employee.setDepartment(EmpDep);
		    employee.setDesignation(EmpDesignation);
		    employee.setSalary(EmpSalary);
			list.add(employee);	
		}
		return list;
		
		
	}
	@Override
	public void findById(int id) throws ClassNotFoundException, SQLException
	{		
			Connection con=EmployeeImpl.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select EmpId,EmpName,EmpAge,EmpDep,EmpDesignation,EmpSalary from empl where EmpId ='"+id+"'");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));   	
			}
			}
	
	@Override
	public void findByName(String name) throws ClassNotFoundException, SQLException 
	{
		Connection con=EmployeeImpl.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select EmpId,EmpName,EmpAge,EmpDep,EmpDesignation,EmpSalary from empl where EmpName = '"+name+"';");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));   	
		}		
}
	@Override
	public void findByDepartment(String dep) throws ClassNotFoundException, SQLException 
	{
		Connection con=EmployeeImpl.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select EmpId,EmpName,EmpAge,EmpDep,EmpDesignation,EmpSalary from empl where EmpDep = '"+dep+"';");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
		}
		
	}
	@Override
	public int updateEmployeeAge(int id, int age) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=EmployeeImpl.getConnection();
		String s="update empl set EmpAge='"+age+"' where EmpId='"+id+"'";
		PreparedStatement ps=con.prepareStatement(s);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		return executeUpdate;
	}
	@Override
	public int updateEmployeeName(int id, String name) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=EmployeeImpl.getConnection();
		String s="update empl set EmpName='"+name+"' where EmpId='"+id+"'";
		PreparedStatement ps=con.prepareStatement(s);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		return executeUpdate;
	}
	
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	



