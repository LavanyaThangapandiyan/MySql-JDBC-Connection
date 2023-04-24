package com.practice.emp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Employee 
{
	public void saveEmployee(Employee1 employee) throws ClassNotFoundException, SQLException;
	public int updateEmployeeAge(int id,int age) throws ClassNotFoundException, SQLException;
	public int updateEmployeeName(int id,String name) throws ClassNotFoundException, SQLException;
	public int  deleteEmployee() throws ClassNotFoundException, SQLException;
	public List employeeList() throws ClassNotFoundException, SQLException;
	public void findById(int id) throws ClassNotFoundException, SQLException;
	public void findByName(String name) throws ClassNotFoundException, SQLException;
	public void findByDepartment(String dep) throws ClassNotFoundException, SQLException;
	
	
}
