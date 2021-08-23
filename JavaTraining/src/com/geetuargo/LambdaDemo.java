package com.geetuargo;


interface A
{
	void show(int i);
}
public class LambdaDemo {

	public static void main(String[] args) {
		A obj;
		
		//obj = () -> System.out.println("Hello Ram");
		obj = i -> System.out.println("Hello Ram"+i);
		obj.show(1);
		

	}

}
