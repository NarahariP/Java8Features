package com.hari;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author Narahari
 *
 */
public class NumerivStreamAggregateFunctionsExample {

	/**
	 * Aggregate Functions are: min, max, sum and average
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("************IntStream********************");
		System.out.println("Sum of 1-50 numbers ::" + IntStream.rangeClosed(1, 50).sum());
		System.out.println("Max number in " + IntStream.rangeClosed(0, 50).max().getAsInt());
		System.out.println("min number in " + IntStream.rangeClosed(0, 50).min().getAsInt());
		System.out.println("Average number in " + IntStream.rangeClosed(0, 50).average().getAsDouble());

		System.out.println("*************LongStream********************");
		System.out.println("Sum of 1-50 numbers ::" + LongStream.rangeClosed(1, 50).sum());
		System.out.println("Max number in " + LongStream.rangeClosed(0, 50).max().getAsLong());
		System.out.println("min number in " + LongStream.rangeClosed(0, 50).min().getAsLong());
		System.out.println("Average number in " + LongStream.rangeClosed(0, 50).average().getAsDouble());
	}
}
