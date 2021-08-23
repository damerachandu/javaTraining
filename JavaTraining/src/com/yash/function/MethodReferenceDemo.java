package com.yash.function;

public class MethodReferenceDemo {

	public static void main(String[] args) {

		Employee e=new Employee();
		e.setEmpId(1001);
		e.setEmpName("sabbir");
		e.setEmpSalary(34000);
		e.setEmpDesignation("Trainer");
		
		Converter<String,String> converter=e::empNameToUpperCase;
		System.out.println("Emp Name:"+converter.convert(e.getEmpName()));
		
		ComputeFunctionalInterface<Double,Double> computeFunctional=Employee::computeTax;
		System.out.println("Tax is:"+computeFunctional.compute(e.getEmpSalary()));
		
		EmployeeFactory<Employee> empFactory=Employee::new;
		Employee newEmployee=empFactory.create(101, "amit", 23000, "Trainer");
		System.out.println(newEmployee);
		
	}

}
