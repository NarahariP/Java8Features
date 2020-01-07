package com.hari;

public interface InterfaceOne {

	default void methodFromOne() {
		System.out.println("Inside Interface One....");
	}
}
