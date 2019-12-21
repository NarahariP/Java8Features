package com.hari;

import java.util.stream.Stream;

/**
 * @author Narahari
 *
 */
public class StreamIterateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream.iterate(1, x -> x * 2).forEach(System.out::println); // It's Infinite loop initial value of x=1, result=2
																	// Second iteration x= result, result = result*2

		/**
		 * Now We can add some limit to iterator
		 */
		Stream.iterate(1, x -> x * 2).limit(10).forEach(System.out::println);
	}
}
