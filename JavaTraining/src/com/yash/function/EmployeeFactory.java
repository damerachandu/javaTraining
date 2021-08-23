package com.yash.function;
@FunctionalInterface
public interface EmployeeFactory <E extends Employee>{
	
	public Employee create(int empId,String empName,double empSalary,String empDesignation);

}
