package com.crud.practice;

import java.sql.Connection;
import java.sql.SQLException;

public interface Employee 
{	
public void insertEmployee() throws ClassNotFoundException, SQLException;
public void updateEmployee();
public void deleteEmployee();
}
