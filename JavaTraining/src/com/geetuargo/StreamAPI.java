package com.geetuargo;
import java.util.*;
public class StreamAPI {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList();
		
		for(int i=1; i<=10; i++ )
		{
			
			values.add(i);
		}
	
		 values.forEach(a -> System.out.println(a));
	}

}
