package com.yash.function;

public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	private String empDesignation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDesignation="
				+ empDesignation + "]";
	}
	
	
	public String empNameToUpperCase(String empName) {
		return empName.toUpperCase();
	}
	
	public static double computeTax(double empSalary) {
		return empSalary*0.01;
	}
	public Employee(int empId, String empName, double empSalary, String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
	}

	public Employee() {}
}
