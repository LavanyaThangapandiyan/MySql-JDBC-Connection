package com.practice.emp;

public class Employee1
{
	private int id;
	private String name;
	private int age;
	private String department;
	private String designation;
	private long salary;
	public Employee1()
	{
		
	}
	public Employee1(int id,String name,int age,String department,String designation,long salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.department=department;
		this.designation=designation;
		this.salary=salary; 
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department
				+ ", designation=" + designation + ", salary=" + salary + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getDepartment()=" + getDepartment() + ", getDesignation()="
				+ getDesignation() + ", getSalary()=" + getSalary() + "]";
	}
	
	
}
