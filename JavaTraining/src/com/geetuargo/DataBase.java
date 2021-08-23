package com.geetuargo;
import java.util.ArrayList;
import java.util.List;


public class DataBase {
	public static List <Employee> getEmployees(){
		
		List <Employee> list = new ArrayList();
		 list.add(new Employee(176, "Ram", "IT",200000 ));
		 list.add(new Employee(186, "Ram2", "Comp", 400000 ));
		 list.add(new Employee(255, "Vidya", "Teaching", 100000 ));
		 list.add(new Employee(196, "Geetu", "Business", 1100000 ));
		 
		 return list;
		
	}

}
