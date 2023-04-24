package com.university.exmp;

import java.sql.SQLException;

public interface University
{
	public void insertUniversity() throws ClassNotFoundException, SQLException;
	public void updateUniversity() throws ClassNotFoundException, SQLException;
	public int  deleteUniversity() throws ClassNotFoundException, SQLException;
	public void universityList() throws ClassNotFoundException, SQLException;
	public void findByUniversity(int id) throws ClassNotFoundException, SQLException;
	public void findByLocation(String location) throws ClassNotFoundException, SQLException;

}
