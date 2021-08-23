package com.geetuargo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		
	Map<String,Integer>	map = new HashMap();
	
	map.put("eight", 8);
	map.put("four", 4);
	map.put("ten", 10);	
	map.put("two", 2);

	// System.out.println("Initial Mappings are: " + map);
	  
     // Using entrySet() to get the set view
    // System.out.println("The set is: " + map.entrySet());
     map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
     System.out.println("************** ");
     map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
