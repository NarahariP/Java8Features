package com.hari;

import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * @author Narahari
 *
 */
public class ParallelStreamExample {

	private static long checkPerformanceResult(Supplier<Integer> supplier, int numgerOfTimes) {
		final long startTime = System.currentTimeMillis();
		for (int i = 0; i < numgerOfTimes; i++) {
			supplier.get();
		}
		final long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

	private static int sumSequentialStream() {
		return IntStream.rangeClosed(1, 10000000).sum();
	}

	private static int sumParallelStream() {
		return IntStream.rangeClosed(1, 10000000).parallel().sum();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Get Avilable Processors in Machine :: " + Runtime.getRuntime().availableProcessors());
		System.out.println("Sum using sequential Stream :: " + sumSequentialStream());
		System.out.println("Sum using parallel Stream :: " + sumParallelStream());

		System.out.println("Sequential Stream Result :: "
				+ checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 20));
		System.out.println(
				"Parallel Stream Result :: " + checkPerformanceResult(ParallelStreamExample::sumParallelStream, 20));
	}
}
