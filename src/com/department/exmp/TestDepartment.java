package com.department.exmp;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TestDepartment {


	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		DepartmentImp obj=new DepartmentImp();
		
		/*List<SaveDepartment>departmentList=obj.departmentList();
		System.out.println(departmentList);
		//obj.departmentList();*/
		
		System.out.println("If you want to update Department Name Enter 1 \n or update Staff Strength enter 2:");
		int no=sc.nextInt();
		if(no==1) 
		{
		System.out.println("Enter Department Id ");
		int id=sc.nextInt();
		System.out.println("Enter New Department Name:");
		String name=sc.next();
		System.out.println(obj.updateDepartment(name, id)+"Successfully Updated...");
		obj.updateDepartment(name, id);
		}
		else if(no==2)
		{
			System.out.println("Enter Department Id ");
			 int id=sc.nextInt();
			 System.out.println("Enter StaffStrength:");
			 int strength=sc.nextInt();
			 System.out.println(obj.updateStaffStrength(id,strength ));
			 obj.updateStaffStrength(id, strength);
		}
		else
		{
		System.out.println("Enter valid Input:");
		}
		
		//obj.updateDepartment(null, 0);
		//obj.deleteDepartment();*/
		
		
		
		//System.out.println("Enter Department:");
		//String department=sc.nextLine();
		//obj.findByDepartment(department);
		
		//System.out.println("Enter ID");
		//int id=sc.nextInt();
		//obj.findByid(id);
		
		
		
		
		
		//obj.getConnection();
		//SaveDepartment save=new SaveDepartment();
		//save.setId(1012);
		//save.setName("Information Technology");
		//save.setStaffStrength(20);
		//save.setStudentStrength(850);
		//obj.saveDepartment(save);

	}

}
