package com.geetuargo;

public class Employee {
	
	private int id;
	private String name;
	private  String dep;
	private long salary;
	
	
	 public Employee() {
		  super();
			}
	 public Employee(int id, String name, String dep, long salary) 
	 {
		 super(); 
		 this.id = id; 
		 this.name = name; 
		 this.dep = dep; 
		 this.salary = salary; 
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
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dep=" + dep + ", salary=" + salary + "]";
	}
	
	public static String empNameToUpperCase(String empname) {
		return empname.toUpperCase();
	}
}
