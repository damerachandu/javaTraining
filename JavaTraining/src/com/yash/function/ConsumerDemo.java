package com.yash.function;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void print1(Consumer<String> consumer,String param) {
		consumer.accept(param);
	}
	public static void print2(Consumer<String> consumer,String param) {
		consumer.accept(param);
	}
	public static void main(String[] args) {

		Consumer<String> stringConsumer1=(s)->{
			System.out.println(s);
		};
		
		Consumer<String> stringConsumer2=(s)->{
			System.out.println(s.toLowerCase());
		};
		
		print1(stringConsumer1,"sabbir");
		print1(stringConsumer2,"chirag");
		print2(stringConsumer2,"amit");
		
		//stringConsumer.accept("Sabbir");
		
		Consumer<Integer> integerConsumer=(i)->{
			System.out.println(i);
		};
		integerConsumer.accept(10);
		
		Consumer<Employee> consumerEmployeeName=(e)->{
			System.out.println(e.getEmpName());
		};
		
		Consumer<Employee> consumerEmployeeSalary=(e)->{
			System.out.println(e.getEmpSalary());
		};
		
		Employee e1=new Employee();
		e1.setEmpId(1001);
		e1.setEmpName("Sabbir");
		e1.setEmpSalary(45000);
		e1.setEmpDesignation("Trainer");
		

		printEmployee(consumerEmployeeName,e1);
		printEmployee(consumerEmployeeSalary,e1);
	}
	
	public static void printEmployee(Consumer<Employee> consumer,Employee e) {
		consumer.accept(e);
	}

}
