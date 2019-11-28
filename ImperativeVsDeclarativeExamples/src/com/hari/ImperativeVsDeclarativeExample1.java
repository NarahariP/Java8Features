package com.hari;

import java.util.stream.IntStream;

/**
 * @author Narahari
 *
 */
public class ImperativeVsDeclarativeExample1 {

	public static void main(String[] args) {
		/**
		 * Imperative - Sum of 100 numbers 
		 * Before Java 8
		 */
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Imperative Sum of 100 numbers: " + sum);

		/**
		 * Declarative - Sum of 100 numbers 
		 * In Java 8
		 */
		int sum1 = IntStream.rangeClosed(1, 100).sum();
		System.out.println("Declarative Sum of 100 numbers: " + sum1);
	}
}
