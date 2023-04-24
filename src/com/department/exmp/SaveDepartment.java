package com.department.exmp;

public class SaveDepartment 
{
	private int id;
	private String name;
	private int staffStrength;
	private int studentStrength;
	
	public SaveDepartment()
	{
		
	}
	public SaveDepartment(int id,String name,int staffStrength,int studentStrength)
	{
		this.id=id;
		this.name=name;
		this.staffStrength=staffStrength;
		this.studentStrength=studentStrength;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStaffStrength() {
		return staffStrength;
	}
	public void setStaffStrength(int staffStrength) {
		this.staffStrength = staffStrength;
	}
	public int getStudentStrength() {
		return studentStrength;
	}
	public void setStudentStrength(int studentStrength) {
		this.studentStrength = studentStrength;
	}
	@Override
	public String toString() {
		return "SaveDepartment [id=" + id + ", name=" + name + ", staffStrength=" + staffStrength + ", studentStrength="
				+ studentStrength + ", getId()=" + getId() + ", getName()=" + getName() + ", getStaffStrength()="
				+ getStaffStrength() + ", getStudentStrength()=" + getStudentStrength() + "]";
	}
	
	
	

}
