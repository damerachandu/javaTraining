package com.yash.intf;

public interface DefaultMethodInterface {
	
	public default void x() {
		System.out.println("-x-");
	}

	public static void main(String args[]) {
		System.out.println("--interface executed--");
	}
}
