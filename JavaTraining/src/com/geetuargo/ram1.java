package com.geetuargo;


interface phone
{
	void call();
	
	default void message()
	{
		System.out.println("message Ram");
	}
}

class anaroidPhone implements phone
{
	public void call()
	{
		System.out.println("Calling Ram2");
	}
	
}
public class ram1 {
	
	
	public static void main(String[] args) {
				System.out.println("Hello Ram");
				
				phone ph = new anaroidPhone();
				ph.call();
				ph.message();
	}

}
