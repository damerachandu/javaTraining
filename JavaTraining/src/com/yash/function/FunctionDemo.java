package com.yash.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String,Integer> function=(s)->{
			 return Integer.parseInt(s);
		};
		
		Function<String,Integer> functionMethodRef=Integer::valueOf;

		functionMethodRef.apply("20");
		System.out.println(10+function.apply("10"));
	}

}
