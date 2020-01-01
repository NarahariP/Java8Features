package com.hari;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Narahari
 */
public class NumericStreamMapExample {

	/**
	 * @return -> By using this method we can convert into any custom Object
	 */
	private static List<Integer> maptoObj() {
		return IntStream.rangeClosed(1, 5).mapToObj(i -> new Integer(i)).collect(toList());
	}

	private static long maptoLong() {
		return IntStream.rangeClosed(1, 5).mapToLong(i -> i) // this will convert IntStream into LongStream
				.sum();
	}

	private static double maptoDouble() {
		return IntStream.rangeClosed(1, 5).mapToDouble(i -> i) // this will convert IntStream into DoubleStream
				.sum();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(maptoObj());
		System.out.println(maptoLong());
		System.out.println(maptoDouble());
	}
}
