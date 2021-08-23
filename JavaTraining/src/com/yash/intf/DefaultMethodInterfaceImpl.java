package com.yash.intf;

public class DefaultMethodInterfaceImpl implements DefaultMethodInterface {

	@Override
	public void x() {
		System.out.println("Different implementation");
		DefaultMethodInterface.super.x();
	}
}
