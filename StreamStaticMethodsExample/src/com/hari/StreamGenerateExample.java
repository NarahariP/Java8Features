package com.hari;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author Narahari
 *
 */
public class StreamGenerateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final Supplier<Integer> integerSupplier = new Random()::nextInt;
		Stream.generate(integerSupplier).forEach(System.out::println); // It's Infinite loop

		/**
		 * Add limit to loop
		 */
		Stream.generate(integerSupplier).limit(10).forEach(System.out::println);
	}
}
