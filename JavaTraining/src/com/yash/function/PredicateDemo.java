package com.yash.function;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {


		Predicate<String> predicateString=(s)->s.length()>6;
		System.out.println("Predicate Result:"+predicateString.test("shabbir"));
		
		Predicate<String> predicateIsEmpty=String::isEmpty;
		System.out.println("If string is empty:"+predicateIsEmpty.test(" "));
		
		
		Predicate<Object> predicateObject=Objects::isNull;
		Boolean b=null;
		System.out.println("is null?:"+predicateObject.test(b));
	}

}
