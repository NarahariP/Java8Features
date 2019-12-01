package com.hari;

import java.util.function.Consumer;

/**
 * @author Narahari
 *
 */
public class ConsumerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Consumer<String> consumer1 = (string) -> System.out.println(string.toUpperCase());
		consumer1.accept("narahari");
		
	}
}
