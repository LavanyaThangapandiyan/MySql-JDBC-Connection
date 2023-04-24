package com.practice.emp;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.department.exmp.SaveDepartment;

public class TestEmployee 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner sc=new Scanner(System.in);
		EmployeeImpl obj=new EmployeeImpl();
		List<Employee1>employeeList=obj.employeeList();
		System.out.println(employeeList);
		
		
		System.out.println("If you want to update Employee Name Enter 1 \n or update Employee Age enter 2:");
		int no=sc.nextInt();
		if(no==1) 
		{
		System.out.println("Enter Employee Id ");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name:");
		String name=sc.next();
		System.out.println(obj.updateEmployeeName(id,name)+"Successfully Updated...");
		obj.updateEmployeeName(id, name);
		}
		else if(no==2)
		{
			System.out.println("Enter Employee Id ");
			 int id=sc.nextInt();
			 System.out.println("Enter Employee Age:");
			 int age=sc.nextInt();
			 System.out.println(obj.updateEmployeeAge(id, age));
			 obj.updateEmployeeAge(id, age);
		}
		else
		{
		System.out.println("Enter valid Input...");
		}
		
		
	     //Employee1 employee=new Employee1();
	     //System.out.println("Enter ID:");
	     //int id=sc.nextInt();
	     //System.out.println("Enter Employee Name");
	     //String name=sc.next();
	     //System.out.println("Enter Employee Age");
	     //int age=sc.nextInt();
	     //System.out.println("Enter Employee Department:");
	     //String department=sc.next();
	     //System.out.println("Enter Employee Designation:");
	     //String designation=sc.next();
	     //System.out.println("Enter Employee Salary");
	     //long salary=sc.nextLong();
	     //employee.setId(id);
	     //employee.setName(name);
	     //employee.setAge(age);
	     //employee.setDepartment(department);
	     //employee.setDesignation(designation);
	     //employee.setSalary(salary);
	     //obj.saveEmployee(employee);
		  //obj.getConnection();
		  //obj.updateEmployee();
		  //obj.deleteEmployee();
		  //obj.employeeList();
		
		  //System.out.println("Enter Employee ID:");
		  //int id=sc.nextInt();
		  //obj.findById(id);
		
		 //System.out.println("Enter Name:");
		 //String name=sc.nextLine();
		 //obj.findByName(name);
		 
		 
		 //System.out.println("Enter Department:");
		 //String dep=sc.nextLine();
		 //obj.findByDepartment(dep);	
		
		
	}

}
