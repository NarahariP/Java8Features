package com.hari.impl;

import com.hari.InterfaceOne;
import com.hari.InterfaceThree;
import com.hari.InterfaceTwo;

public class InterfaceImpl implements InterfaceOne, InterfaceTwo, InterfaceThree {

	public static void main(String[] args) {
		final InterfaceImpl interfaceImpl = new InterfaceImpl();
		interfaceImpl.methodFromOne();
		interfaceImpl.methodFromTwo();
		interfaceImpl.methodFromThree();
	}
}
