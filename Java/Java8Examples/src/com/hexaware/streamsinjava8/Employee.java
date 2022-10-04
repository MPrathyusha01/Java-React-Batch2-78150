package com.hexaware.streamsinjava8;

public class Employee {
	
	private String empId;
	private String empname;
	private float empSalary;
	public Employee() {
		
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public Employee(String empId, String empname, float empSalary) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", empSalary=" + empSalary + "]";
	}
	
	
	

}
