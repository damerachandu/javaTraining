package com.yash.function;

import java.util.Optional;

public class OptionalDemo {

	public int sum(Optional<Integer> o1,Optional<Integer> o2) {
		return o1.orElse(0)+o2.orElse(0);
	}
	public static void main(String[] args) {

		Optional<String> optionalString=Optional.of("Sabbir");
		System.out.println("Whether value is present:"+optionalString.isPresent());
		
		OptionalDemo od=new OptionalDemo();
		Optional<Integer> o1=Optional.ofNullable(null);
		Optional<Integer> o2=Optional.of(20);
		System.out.println("Sum:"+od.sum(o1, o2));
	}

}
