package com.geetuargo;

import java.util.List;
import java.util.stream.*;

public class TaxService {
	
	public static List <Employee> evaluateTaxUsers(){
	    return DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 4000).collect(Collectors.toList());
	
	}

	public static void main(String[] args) {
		
		
		System.out.println(evaluateTaxUsers());

		
		//evaluateTaxUsers().forEach(a -> System.out.println(a.getName()));
		
		 //DataBase.getEmployees().forEach(t -> System.out.println(t));
	
		//DataBase.getEmployees().stream().forEach(t -> System.out.println(t));
	}

}
