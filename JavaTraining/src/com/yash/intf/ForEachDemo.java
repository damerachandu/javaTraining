package com.yash.intf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEachDemo {

	public static void main(String[] args) {

		List<String> names=new ArrayList<>();
		names.add("amit");
		names.add("sumeet");
		names.add("richard");
		
		names.forEach((name)->{
			System.out.println(name);
		});
		
		names.forEach(System.out::println);
		
		Set<String> countryNames=new HashSet<>();
		countryNames.add("India");
		countryNames.add("China");
		countryNames.add("Japan");
		
		countryNames.forEach(System.out::println);
		
		Map<Integer,String> mapUsers=new HashMap<>();
		mapUsers.put(1, "Sabbir");
		mapUsers.put(2, "Amit");
		
		mapUsers.forEach((k,v)->{
			System.out.println("Key:"+k);
			System.out.println("Value:"+v);
		});
		
		mapUsers.putIfAbsent(2, "No name");
		
		System.out.println(mapUsers);
		
		mapUsers.merge(1,"Poonawala",(value,newValue)->value+newValue);
		System.out.println(mapUsers);

		
	}

}
