package com.hari;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Narahari
 *
 */
public class StreamMinMaxExample {

	static List<Integer> integerList = Arrays.asList(12, 3, 5, 6, 8, 9, 7, 6, 45, 8, 100, 52);

	private static int findMaxValue(List<Integer> integerList) {
		return integerList.stream().reduce(0, (a, b) -> a > b ? a : b);
	}

	private static Optional<Integer> findMaxValueWithOptional(List<Integer> integerList) {
		return integerList.stream().reduce((a, b) -> a > b ? a : b);
	}

	private static int findMinValue(List<Integer> integerList) {
		/**
		 * Here we have issue because we are passing '0' that will be returned reason
		 * its main value
		 */
		return integerList.stream().reduce(0, (a, b) -> a < b ? a : b);
	}

	private static Optional<Integer> findMinValueWithOptional(List<Integer> integerList) {
		return integerList.stream().reduce((a, b) -> a < b ? a : b);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Max value from List:: " + findMaxValue(integerList));
		final Optional<Integer> maxValueOptional = findMaxValueWithOptional(integerList);
		if (maxValueOptional.isPresent()) {
			System.out.println("Max value from List with Optional:: " + maxValueOptional.get());
		}
		System.out.println("Min value form List:: " + findMinValue(integerList));
		final Optional<Integer> minValueFromOptional = findMinValueWithOptional(integerList);
		if (minValueFromOptional.isPresent()) {
			System.out.println("Min value from Optional:: " + minValueFromOptional.get());
		}
	}
}
