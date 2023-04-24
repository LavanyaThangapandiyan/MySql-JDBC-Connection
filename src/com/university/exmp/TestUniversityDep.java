package com.university.exmp;

import java.sql.SQLException;
import java.util.Scanner;

public class TestUniversityDep {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		UniversityImp obj=new UniversityImp();
		//obj.getConnection();
        //obj.insertUniversity();
        //obj.updateUniversity();
		//obj.deleteUniversity();
		//obj.universityList();
	   System.out.println("Enter the University ID:");
	   int id=sc.nextInt();
       obj.findByUniversity(id);
		//System.out.println("Enter university location:");
		//String location=sc.nextLine();
		//obj.findByLocation(location);
	}

}
