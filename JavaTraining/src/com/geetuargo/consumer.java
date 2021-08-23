package com.geetuargo;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class consumer {
	
	
	

	public static void main(String[] args) {
		//Consumer<Integer> consumer = t -> System.out.println("Printing"+t);
		
		//consumer.accept(6);
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		
		//list1.stream().forEach(consumer);
		// consumer
		list1.stream().forEach(t -> System.out.println("Printing"+t));

		//Predecative
		list1.stream().filter(t ->t %2 ==0).forEach(t -> System.out.println("Printing Even-"+t));
		
	}

}
