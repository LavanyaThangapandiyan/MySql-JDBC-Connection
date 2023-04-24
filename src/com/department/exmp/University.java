package com.department.exmp;

import java.sql.SQLException;
import java.util.List;

public interface University 
{
	public void saveDepartment(SaveDepartment save) throws ClassNotFoundException, SQLException;
	public int updateDepartment(String dep,int id) throws ClassNotFoundException, SQLException;
	public int updateStaffStrength(int id,int strength) throws ClassNotFoundException, SQLException;
	public int deleteDepartment() throws ClassNotFoundException, SQLException;
	public List departmentList() throws ClassNotFoundException, SQLException;
	public void findByDepartment(String department) throws ClassNotFoundException, SQLException;
	public void findByid(int id) throws ClassNotFoundException, SQLException;
	
}
