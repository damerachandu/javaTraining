package com.yash.streams;


import java.util.List;

import com.yash.entity.Interns;

public class BuilderDemo {

	public static void main(String[] args) {

		List<Interns> internsList=Interns.Builder.createInternsList();
		internsList.forEach(System.out::println);
	}

}
