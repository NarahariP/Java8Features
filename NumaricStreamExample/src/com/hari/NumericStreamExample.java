package com.hari;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author Narahari
 *
 */
public class NumericStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("IntStream range Count :: " + IntStream.range(1, 10).count());
		IntStream.range(1, 10).forEach(value -> System.out.print(value + ", "));
		System.out.println();
		System.out.println("IntStream rangeClosed Count :: " + IntStream.rangeClosed(1, 10).count());
		IntStream.rangeClosed(1, 10).forEach(value -> System.out.print(value + ", "));
		System.out.println();
		System.out.println("LongStream range Count :: " + LongStream.range(1, 10).count());
		LongStream.range(1, 10).forEach(value -> System.out.print(value + ", "));
		System.out.println();
		System.out.println("LongStream rangeClosed Count :: " + LongStream.rangeClosed(1, 10).count());
		LongStream.rangeClosed(1, 10).forEach(value -> System.out.print(value + ", "));
		System.out.println();
		System.out.println("DoubleStream range Count :: " + IntStream.range(1, 10).asDoubleStream().count());
		IntStream.range(1, 10).asDoubleStream().forEach(value -> System.out.print(value + ", "));
		System.out.println();
		System.out
				.println("DoubleStream rangeClosed Count :: " + IntStream.rangeClosed(1, 10).asDoubleStream().count());
		IntStream.rangeClosed(1, 10).asDoubleStream().forEach(value -> System.out.print(value + ", "));

	}
}
