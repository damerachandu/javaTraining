package com.geetuargo;
import java.util.function.*;
public class MethodReference {

	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		
		e.setId(22);
		e.setName("ram");
		e.setSalary(40000);
		
		//Converter<String,String> converter = e::empNameToUpperCase;
		
		 // System.out.println("Emp Name"+converter.convert(e.getName()));

	}

}
