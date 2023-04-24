package com.crud.practice;

import java.sql.SQLException;

public class TestEmpl 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	EmployeeImpl obj=new EmployeeImpl();
	//obj.getConnection();
	obj.insertEmployee();

	}

}
