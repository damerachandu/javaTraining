package com.yash.function;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<String> supplier1=()->"Hello Sabbir";
		
		System.out.println("Supplier returns:"+supplier1.get());
		
		Supplier<String> supplier2=()->{
			String s1="Hi";
			String s2="Sabbir";
			return s1.concat(s2);
		};
		
		System.out.println("Supplier returns:"+supplier2.get());
		
		Supplier<Employee> supplier3=()->{
			Employee e1=new Employee();
			e1.setEmpId(1001);
			e1.setEmpName("Sabbir");
			e1.setEmpSalary(45000);
			e1.setEmpDesignation("Trainer");
			return e1;
		};
		System.out.println("Supplier returns:"+supplier3.get());

		
	}

}
